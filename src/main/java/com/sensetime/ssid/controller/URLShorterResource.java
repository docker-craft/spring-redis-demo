package com.sensetime.ssid.controller;

import com.google.common.hash.Hashing;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

@RestController
public class URLShorterResource {

    @Autowired
    StringRedisTemplate redisTemplate;


    @GetMapping("URL/{id}")
    public String getUrl(@PathVariable String id) {
        String url =  redisTemplate.opsForValue().get(id);
        System.out.println("URL Retrieved: " + url);

        if (url == null) {
            throw new RuntimeException("There is no shorter URL for : " + id);
        }
        return url;
    }


    @PostMapping("/create")
    public String create(@RequestBody String url) {
        System.out.println(url);

        UrlValidator urlValidator = new UrlValidator(new String[] { "http", "https" });
        if (urlValidator.isValid(url)) {
            String id = Hashing.murmur3_32().hashString(url, StandardCharsets.UTF_8).toString();
            System.out.println("URL ID generated:" + id);
            redisTemplate.opsForValue().set(id, url);
            return id;
        }
        throw new RuntimeException("URL Invalid: " + url);

    }

}
