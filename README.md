





<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
  <link rel="dns-prefetch" href="https://github.githubassets.com">
  <link rel="dns-prefetch" href="https://avatars0.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars1.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars2.githubusercontent.com">
  <link rel="dns-prefetch" href="https://avatars3.githubusercontent.com">
  <link rel="dns-prefetch" href="https://github-cloud.s3.amazonaws.com">
  <link rel="dns-prefetch" href="https://user-images.githubusercontent.com/">



  <link crossorigin="anonymous" media="all" integrity="sha512-/YEVWs7BzxfKyUd6zVxjEQcXRWsLbcEjv045Rq8DSoipySmQblhVKxlXLva2GtNd5DhwCxHwW1RM0N9I7S2Vew==" rel="stylesheet" href="https://github.githubassets.com/assets/frameworks-481a47a96965f6706fb41bae0d14b09a.css" />
  
    <link crossorigin="anonymous" media="all" integrity="sha512-UuDKgNf/5qyjHC2IFg8kEkn3j2n+D4ShuvNV5eohEqUPfuPzqAxcd98IqomrgGo/g36tB35YvxoA1CbXgE0iFg==" rel="stylesheet" href="https://github.githubassets.com/assets/github-5362384f9e2512870c388a187eaf4868.css" />
    
    
    
    

  <meta name="viewport" content="width=device-width">
  
  <title>RedisUtil/README.md at master · whvcse/RedisUtil</title>
    <meta name="description" content="最全的Java操作Redis的工具类，使用StringRedisTemplate实现，封装了对Redis五种基本类型的各种操作！ - whvcse/RedisUtil">
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
  <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
  <meta property="fb:app_id" content="1401488693436528">

    <meta name="twitter:image:src" content="https://avatars3.githubusercontent.com/u/22876810?s=400&amp;v=4" /><meta name="twitter:site" content="@github" /><meta name="twitter:card" content="summary" /><meta name="twitter:title" content="whvcse/RedisUtil" /><meta name="twitter:description" content="最全的Java操作Redis的工具类，使用StringRedisTemplate实现，封装了对Redis五种基本类型的各种操作！ - whvcse/RedisUtil" />
    <meta property="og:image" content="https://avatars3.githubusercontent.com/u/22876810?s=400&amp;v=4" /><meta property="og:site_name" content="GitHub" /><meta property="og:type" content="object" /><meta property="og:title" content="whvcse/RedisUtil" /><meta property="og:url" content="https://github.com/whvcse/RedisUtil" /><meta property="og:description" content="最全的Java操作Redis的工具类，使用StringRedisTemplate实现，封装了对Redis五种基本类型的各种操作！ - whvcse/RedisUtil" />

  <link rel="assets" href="https://github.githubassets.com/">
  <link rel="web-socket" href="wss://live.github.com/_sockets/VjI6NDYwMDAzMzMwOjQxYmYwNzFiMDJlYjczOTc5YTEyMzdjYjdlOGQwNjJmODNiMTExNDBhYzg1MWE0MTNiYTJjZTk5OWZkZGIxMDc=--93dc394ac11288bd79fea28f96f01c66d2a16507">
  <link rel="sudo-modal" href="/sessions/sudo_modal">
  <meta name="request-id" content="46B9:587A:1E587A:2D8E3F:5DC66A52" data-pjax-transient>


  

  <meta name="selected-link" value="repo_source" data-pjax-transient>

      <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-site-verification" content="ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA">
    <meta name="google-site-verification" content="GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc">

  <meta name="octolytics-host" content="collector.githubapp.com" /><meta name="octolytics-app-id" content="github" /><meta name="octolytics-event-url" content="https://collector.githubapp.com/github-external/browser_event" /><meta name="octolytics-dimension-request_id" content="46B9:587A:1E587A:2D8E3F:5DC66A52" /><meta name="octolytics-dimension-region_edge" content="ap-southeast-1" /><meta name="octolytics-dimension-region_render" content="iad" /><meta name="octolytics-dimension-ga_id" content="" class="js-octo-ga-id" /><meta name="octolytics-dimension-visitor_id" content="5082854785742384573" /><meta name="octolytics-actor-id" content="3413357" /><meta name="octolytics-actor-login" content="uchenm" /><meta name="octolytics-actor-hash" content="754b927f0f52464d95329db59c8b9960c0a4b3fb289260e6404bd919196b4951" />
<meta name="analytics-location" content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" />



    <meta name="google-analytics" content="UA-3769691-2">

  <meta class="js-ga-set" name="userId" content="c4a0be4b3b2642b2028d09aeb5f831a6">

<meta class="js-ga-set" name="dimension1" content="Logged In">



  

      <meta name="hostname" content="github.com">
    <meta name="user-login" content="uchenm">

      <meta name="expected-hostname" content="github.com">
    <meta name="js-proxy-site-detection-payload" content="MzAzODg1OGNmZmQ4ZGRiN2ZhN2QxNDQzMGVjZTgxMTI0MzU0OWJlM2ViNDM3ZWJmMWRiYzYyYzU0MjRhMTgzOXx7InJlbW90ZV9hZGRyZXNzIjoiMTM5LjIyNy4yMzUuMTI5IiwicmVxdWVzdF9pZCI6IjQ2Qjk6NTg3QToxRTU4N0E6MkQ4RTNGOjVEQzY2QTUyIiwidGltZXN0YW1wIjoxNTczMjg0NDM1LCJob3N0IjoiZ2l0aHViLmNvbSJ9">

    <meta name="enabled-features" content="ACTIONS_V2_ON_MARKETPLACE,MARKETPLACE_FEATURED_BLOG_POSTS,MARKETPLACE_INVOICED_BILLING,MARKETPLACE_SOCIAL_PROOF_CUSTOMERS,MARKETPLACE_TRENDING_SOCIAL_PROOF,MARKETPLACE_RECOMMENDATIONS,MARKETPLACE_PENDING_INSTALLATIONS,NOTIFY_ON_BLOCK,RELATED_ISSUES,GHE_CLOUD_TRIAL">

  <meta name="html-safe-nonce" content="d60c722c3e9f480fce37c4431552193bf94c06c2">

  <meta http-equiv="x-pjax-version" content="fa69a6766b45881d74d00fb909806b32">
  

      <link href="https://github.com/whvcse/RedisUtil/commits/master.atom" rel="alternate" title="Recent Commits to RedisUtil:master" type="application/atom+xml">

  <meta name="go-import" content="github.com/whvcse/RedisUtil git https://github.com/whvcse/RedisUtil.git">

  <meta name="octolytics-dimension-user_id" content="22876810" /><meta name="octolytics-dimension-user_login" content="whvcse" /><meta name="octolytics-dimension-repository_id" content="119780104" /><meta name="octolytics-dimension-repository_nwo" content="whvcse/RedisUtil" /><meta name="octolytics-dimension-repository_public" content="true" /><meta name="octolytics-dimension-repository_is_fork" content="false" /><meta name="octolytics-dimension-repository_network_root_id" content="119780104" /><meta name="octolytics-dimension-repository_network_root_nwo" content="whvcse/RedisUtil" /><meta name="octolytics-dimension-repository_explore_github_marketplace_ci_cta_shown" content="false" />


    <link rel="canonical" href="https://github.com/whvcse/RedisUtil/blob/master/README.md" data-pjax-transient>


  <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">

  <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">

  <link rel="mask-icon" href="https://github.githubassets.com/pinned-octocat.svg" color="#000000">
  <link rel="icon" type="image/x-icon" class="js-site-favicon" href="https://github.githubassets.com/favicon.ico">

<meta name="theme-color" content="#1e2327">



  <meta name="webauthn-auth-enabled" content="true">

  <meta name="webauthn-registration-enabled" content="true">

  <link rel="manifest" href="/manifest.json" crossOrigin="use-credentials">

  </head>

  <body class="logged-in env-production emoji-size-boost page-responsive page-blob">
    

  <div class="position-relative js-header-wrapper ">
    <a href="#start-of-content" tabindex="1" class="p-3 bg-blue text-white show-on-focus js-skip-to-content">Skip to content</a>
    <span class="Progress progress-pjax-loader position-fixed width-full js-pjax-loader-bar">
      <span class="progress-pjax-loader-bar top-0 left-0" style="width: 0%;"></span>
    </span>

    
    
    


          <header class="Header js-details-container Details flex-wrap flex-lg-nowrap p-responsive" role="banner">

    <div class="Header-item d-none d-lg-flex">
      <a class="Header-link" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <svg class="octicon octicon-mark-github v-align-middle" height="32" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"/></svg>
</a>

    </div>

    <div class="Header-item d-lg-none">
      <button class="Header-link btn-link js-details-target" type="button" aria-label="Toggle navigation" aria-expanded="false">
        <svg height="24" class="octicon octicon-three-bars" viewBox="0 0 12 16" version="1.1" width="18" aria-hidden="true"><path fill-rule="evenodd" d="M11.41 9H.59C0 9 0 8.59 0 8c0-.59 0-1 .59-1H11.4c.59 0 .59.41.59 1 0 .59 0 1-.59 1h.01zm0-4H.59C0 5 0 4.59 0 4c0-.59 0-1 .59-1H11.4c.59 0 .59.41.59 1 0 .59 0 1-.59 1h.01zM.59 11H11.4c.59 0 .59.41.59 1 0 .59 0 1-.59 1H.59C0 13 0 12.59 0 12c0-.59 0-1 .59-1z"/></svg>
      </button>
    </div>

    <div class="Header-item Header-item--full flex-column flex-lg-row width-full flex-order-2 flex-lg-order-none mr-0 mr-lg-3 mt-3 mt-lg-0 Details-content--hidden">
        <div class="header-search flex-self-stretch flex-lg-self-auto mr-0 mr-lg-3 mb-3 mb-lg-0 scoped-search site-scoped-search js-site-search position-relative js-jump-to"
  role="combobox"
  aria-owns="jump-to-results"
  aria-label="Search or jump to"
  aria-haspopup="listbox"
  aria-expanded="false"
>
  <div class="position-relative">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="js-site-search-form" role="search" aria-label="Site" data-scope-type="Repository" data-scope-id="119780104" data-scoped-search-url="/whvcse/RedisUtil/search" data-unscoped-search-url="/search" action="/whvcse/RedisUtil/search" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
      <label class="form-control input-sm header-search-wrapper p-0 header-search-wrapper-jump-to position-relative d-flex flex-justify-between flex-items-center js-chromeless-input-container">
        <input type="text"
          class="form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus js-site-search-field is-clearable"
          data-hotkey="s,/"
          name="q"
          value=""
          placeholder="Search or jump to…"
          data-unscoped-placeholder="Search or jump to…"
          data-scoped-placeholder="Search or jump to…"
          autocapitalize="off"
          aria-autocomplete="list"
          aria-controls="jump-to-results"
          aria-label="Search or jump to…"
          data-jump-to-suggestions-path="/_graphql/GetSuggestedNavigationDestinations#csrf-token=gy0hUl9eft/mOXOYRLlF7vstatZb65kt27aT2hiFb8xOXrMrxhqvcamINRDbZ6aLxMuwxlHRYIRLoPRJLg5aKQ=="
          spellcheck="false"
          autocomplete="off"
          >
          <input type="hidden" class="js-site-search-type-field" name="type" >
            <img src="https://github.githubassets.com/images/search-key-slash.svg" alt="" class="mr-2 header-search-key-slash">

            <div class="Box position-absolute overflow-hidden d-none jump-to-suggestions js-jump-to-suggestions-container">
              
<ul class="d-none js-jump-to-suggestions-template-container">
  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-suggestion" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 12 16" version="1.1" role="img"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 15 16" version="1.1" role="img"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 00-1 1v14a1 1 0 001 1h13a1 1 0 001-1V1a1 1 0 00-1-1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M15.7 13.3l-3.81-3.83A5.93 5.93 0 0013 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 000-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z"/></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>

</ul>

<ul class="d-none js-jump-to-no-results-template-container">
  <li class="d-flex flex-justify-center flex-items-center f5 d-none js-jump-to-suggestion p-2">
    <span class="text-gray">No suggested jump to results</span>
  </li>
</ul>

<ul id="jump-to-results" role="listbox" class="p-0 m-0 js-navigation-container jump-to-suggestions-results-container js-jump-to-suggestions-results-container">
  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-scoped-search d-none" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 12 16" version="1.1" role="img"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 15 16" version="1.1" role="img"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 00-1 1v14a1 1 0 001 1h13a1 1 0 001-1V1a1 1 0 00-1-1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M15.7 13.3l-3.81-3.83A5.93 5.93 0 0013 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 000-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z"/></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>

  

<li class="d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-global-search d-none" role="option">
  <a tabindex="-1" class="no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2" href="">
    <div class="jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none">
      <svg height="16" width="16" class="octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none" title="Repository" aria-label="Repository" viewBox="0 0 12 16" version="1.1" role="img"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none" title="Project" aria-label="Project" viewBox="0 0 15 16" version="1.1" role="img"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 00-1 1v14a1 1 0 001 1h13a1 1 0 001-1V1a1 1 0 00-1-1z"/></svg>
      <svg height="16" width="16" class="octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none" title="Search" aria-label="Search" viewBox="0 0 16 16" version="1.1" role="img"><path fill-rule="evenodd" d="M15.7 13.3l-3.81-3.83A5.93 5.93 0 0013 6c0-3.31-2.69-6-6-6S1 2.69 1 6s2.69 6 6 6c1.3 0 2.48-.41 3.47-1.11l3.83 3.81c.19.2.45.3.7.3.25 0 .52-.09.7-.3a.996.996 0 000-1.41v.01zM7 10.7c-2.59 0-4.7-2.11-4.7-4.7 0-2.59 2.11-4.7 4.7-4.7 2.59 0 4.7 2.11 4.7 4.7 0 2.59-2.11 4.7-4.7 4.7z"/></svg>
    </div>

    <img class="avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none" alt="" aria-label="Team" src="" width="28" height="28">

    <div class="jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target">
    </div>

    <div class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search">
      <span class="js-jump-to-badge-search-text-default d-none" aria-label="in this repository">
        In this repository
      </span>
      <span class="js-jump-to-badge-search-text-global d-none" aria-label="in all of GitHub">
        All GitHub
      </span>
      <span aria-hidden="true" class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>

    <div aria-hidden="true" class="border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump">
      Jump to
      <span class="d-inline-block ml-1 v-align-middle">↵</span>
    </div>
  </a>
</li>


    <li class="d-flex flex-justify-center flex-items-center p-0 f5 js-jump-to-suggestion">
      <img src="https://github.githubassets.com/images/spinners/octocat-spinner-128.gif" alt="Octocat Spinner Icon" class="m-2" width="28">
    </li>
</ul>

            </div>
      </label>
</form>  </div>
</div>


      <nav class="d-flex flex-column flex-lg-row flex-self-stretch flex-lg-self-auto" aria-label="Global">
    <a class="Header-link d-block d-lg-none py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:dashboard:user" aria-label="Dashboard" href="/dashboard">
      Dashboard
</a>
  <a class="js-selected-navigation-item Header-link  mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15" data-hotkey="g p" data-ga-click="Header, click, Nav menu - item:pulls context:user" aria-label="Pull requests you created" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls" href="/pulls">
    Pull requests
</a>
  <a class="js-selected-navigation-item Header-link  mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15" data-hotkey="g i" data-ga-click="Header, click, Nav menu - item:issues context:user" aria-label="Issues you created" data-selected-links="/issues /issues/assigned /issues/mentioned /issues" href="/issues">
    Issues
</a>
    <div class="mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15">
      <a class="js-selected-navigation-item Header-link" data-ga-click="Header, click, Nav menu - item:marketplace context:user" data-octo-click="marketplace_click" data-octo-dimensions="location:nav_bar" data-selected-links=" /marketplace" href="/marketplace">
        Marketplace
</a>      

    </div>

  <a class="js-selected-navigation-item Header-link  mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15" data-ga-click="Header, click, Nav menu - item:explore" data-selected-links="/explore /trending /trending/developers /integrations /integrations/feature/code /integrations/feature/collaborate /integrations/feature/ship showcases showcases_search showcases_landing /explore" href="/explore">
    Explore
</a>


    <a class="Header-link d-block d-lg-none mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15" href="https://github.com/uchenm">
      <img class="avatar" height="20" width="20" alt="@uchenm" src="https://avatars1.githubusercontent.com/u/3413357?s=60&amp;v=4" />
      uchenm
</a>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form action="/logout" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="zdBhN9sJRD8WDVlmm++XgEY1Kocu460btDKi1K4AQlNVPZcOmh6Mgsy10TUYZMpQ5aik/d7zazIC1iNHooTgrw==" />
      <button type="submit" class="Header-link mr-0 mr-lg-3 py-2 py-lg-0 border-top border-lg-top-0 border-white-fade-15 d-lg-none btn-link d-block width-full text-left" data-ga-click="Header, sign out, icon:logout" style="padding-left: 2px;">
        <svg class="octicon octicon-sign-out v-align-middle" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 9V7H8V5h4V3l4 3-4 3zm-2 3H6V3L2 1h8v3h1V1c0-.55-.45-1-1-1H1C.45 0 0 .45 0 1v11.38c0 .39.22.73.55.91L6 16.01V13h4c.55 0 1-.45 1-1V8h-1v4z"/></svg>
        Sign out
      </button>
</form></nav>

    </div>

    <div class="Header-item Header-item--full flex-justify-center d-lg-none position-relative">
      <div class="css-truncate css-truncate-target width-fit position-absolute left-0 right-0 text-center">
              <svg class="octicon octicon-repo" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
    <a class="Header-link" href="/whvcse">whvcse</a>
    /
    <a class="Header-link" href="/whvcse/RedisUtil">RedisUtil</a>

</div>
    </div>


    <div class="Header-item mr-0 mr-lg-3 flex-order-1 flex-lg-order-none">
      

    <a aria-label="You have unread notifications" class="Header-link notification-indicator position-relative tooltipped tooltipped-sw js-socket-channel js-notification-indicator" data-hotkey="g n" data-ga-click="Header, go to notifications, icon:unread" data-channel="notification-changed:3413357" href="/notifications">
        <span class="mail-status unread"></span>
        <svg class="octicon octicon-bell" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 12v1H0v-1l.73-.58c.77-.77.81-2.55 1.19-4.42C2.69 3.23 6 2 6 2c0-.55.45-1 1-1s1 .45 1 1c0 0 3.39 1.23 4.16 5 .38 1.88.42 3.66 1.19 4.42l.66.58H14zm-7 4c1.11 0 2-.89 2-2H5c0 1.11.89 2 2 2z"/></svg>
</a>
    </div>


    <div class="Header-item position-relative d-none d-lg-flex">
      <details class="details-overlay details-reset">
  <summary class="Header-link"
      aria-label="Create new…"
      data-ga-click="Header, create new, icon:add">
    <svg class="octicon octicon-plus" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 9H7v5H5V9H0V7h5V2h2v5h5v2z"/></svg> <span class="dropdown-caret"></span>
  </summary>
  <details-menu class="dropdown-menu dropdown-menu-sw">
    
<a role="menuitem" class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>

  <a role="menuitem" class="dropdown-item" href="/new/import" data-ga-click="Header, import a repository">
    Import repository
  </a>

<a role="menuitem" class="dropdown-item" href="https://gist.github.com/" data-ga-click="Header, create new gist">
  New gist
</a>

  <a role="menuitem" class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>


  <div role="none" class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="whvcse/RedisUtil">This repository</span>
  </div>
    <a role="menuitem" class="dropdown-item" href="/whvcse/RedisUtil/issues/new" data-ga-click="Header, create new issue" data-skip-pjax>
      New issue
    </a>


  </details-menu>
</details>

    </div>

    <div class="Header-item position-relative mr-0 d-none d-lg-flex">
      
  <details class="details-overlay details-reset js-feature-preview-indicator-container" data-feature-preview-indicator-src="/users/uchenm/feature_preview/indicator_check.json">

  <summary class="Header-link"
    aria-label="View profile and more"
    data-ga-click="Header, show menu, icon:avatar">
    <img alt="@uchenm" class="avatar" src="https://avatars2.githubusercontent.com/u/3413357?s=40&amp;v=4" height="20" width="20">
      <span class="feature-preview-indicator js-feature-preview-indicator" hidden></span>
    <span class="dropdown-caret"></span>
  </summary>
  <details-menu class="dropdown-menu dropdown-menu-sw mt-2" style="width: 180px">
    <div class="header-nav-current-user css-truncate"><a role="menuitem" class="no-underline user-profile-link px-3 pt-2 pb-2 mb-n2 mt-n1 d-block" href="/uchenm" data-ga-click="Header, go to profile, text:Signed in as">Signed in as <strong class="css-truncate-target">uchenm</strong></a></div>
    <div role="none" class="dropdown-divider"></div>

      <div class="pl-3 pr-3 f6 user-status-container js-user-status-context pb-1" data-url="/users/status?compact=1&amp;link_mentions=0&amp;truncate=1">
        
<div class="js-user-status-container
    user-status-compact rounded-1 px-2 py-1 mt-2
    border
  " data-team-hovercards-enabled>
  <details class="js-user-status-details details-reset details-overlay details-overlay-dark">
    <summary class="btn-link btn-block link-gray no-underline js-toggle-user-status-edit toggle-user-status-edit "
      role="menuitem" data-hydro-click="{&quot;event_type&quot;:&quot;user_profile.click&quot;,&quot;payload&quot;:{&quot;profile_user_id&quot;:22876810,&quot;target&quot;:&quot;EDIT_USER_STATUS&quot;,&quot;user_id&quot;:3413357,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;}}" data-hydro-click-hmac="83ddcb0d31f0f63b06e167da4c5ba8c9815149d3d3301d9de557e5c275b41e11">
      <div class="d-flex">
        <div class="f6 lh-condensed user-status-header
          d-inline-block v-align-middle
            user-status-emoji-only-header circle
            pr-2
"
            style="max-width: 29px"
          >
          <div class="user-status-emoji-container flex-shrink-0 mr-1 mt-1 lh-condensed-ultra v-align-bottom" style="">
            <svg class="octicon octicon-smiley" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zm4.81 12.81a6.72 6.72 0 01-2.17 1.45c-.83.36-1.72.53-2.64.53-.92 0-1.81-.17-2.64-.53-.81-.34-1.55-.83-2.17-1.45a6.773 6.773 0 01-1.45-2.17A6.59 6.59 0 011.21 8c0-.92.17-1.81.53-2.64.34-.81.83-1.55 1.45-2.17.62-.62 1.36-1.11 2.17-1.45A6.59 6.59 0 018 1.21c.92 0 1.81.17 2.64.53.81.34 1.55.83 2.17 1.45.62.62 1.11 1.36 1.45 2.17.36.83.53 1.72.53 2.64 0 .92-.17 1.81-.53 2.64-.34.81-.83 1.55-1.45 2.17zM4 6.8v-.59c0-.66.53-1.19 1.2-1.19h.59c.66 0 1.19.53 1.19 1.19v.59c0 .67-.53 1.2-1.19 1.2H5.2C4.53 8 4 7.47 4 6.8zm5 0v-.59c0-.66.53-1.19 1.2-1.19h.59c.66 0 1.19.53 1.19 1.19v.59c0 .67-.53 1.2-1.19 1.2h-.59C9.53 8 9 7.47 9 6.8zm4 3.2c-.72 1.88-2.91 3-5 3s-4.28-1.13-5-3c-.14-.39.23-1 .66-1h8.59c.41 0 .89.61.75 1z"/></svg>
          </div>
        </div>
        <div class="
          d-inline-block v-align-middle
          
          
           css-truncate css-truncate-target 
           user-status-message-wrapper f6"
           style="line-height: 20px;" >
          <div class="d-inline-block text-gray-dark v-align-text-top text-left">
              <span class="text-gray ml-2">Set status</span>
          </div>
        </div>
      </div>
    </summary>
    <details-dialog class="details-dialog rounded-1 anim-fade-in fast Box Box--overlay" role="dialog" tabindex="-1">
      <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="position-relative flex-auto js-user-status-form" action="/users/status?compact=1&amp;link_mentions=0&amp;truncate=1" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="_method" value="put" /><input type="hidden" name="authenticity_token" value="JVic8T14voWMT4Llr0ed9kLSLCxZKvs3L8075chC+Vcc0RvG9FJM9OxfvgorU2rLw7q3gEzg8/upoQvwXtR4Ow==" />
        <div class="Box-header bg-gray border-bottom p-3">
          <button class="Box-btn-octicon js-toggle-user-status-edit btn-octicon float-right" type="reset" aria-label="Close dialog" data-close-dialog>
            <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
          </button>
          <h3 class="Box-title f5 text-bold text-gray-dark">Edit status</h3>
        </div>
        <input type="hidden" name="emoji" class="js-user-status-emoji-field" value="">
        <input type="hidden" name="organization_id" class="js-user-status-org-id-field" value="">
        <div class="px-3 py-2 text-gray-dark">
          <div class="js-characters-remaining-container position-relative mt-2">
            <div class="input-group d-table form-group my-0 js-user-status-form-group">
              <span class="input-group-button d-table-cell v-align-middle" style="width: 1%">
                <button type="button" aria-label="Choose an emoji" class="btn-outline btn js-toggle-user-status-emoji-picker btn-open-emoji-picker p-0">
                  <span class="js-user-status-original-emoji" hidden></span>
                  <span class="js-user-status-custom-emoji"></span>
                  <span class="js-user-status-no-emoji-icon" >
                    <svg class="octicon octicon-smiley" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zm4.81 12.81a6.72 6.72 0 01-2.17 1.45c-.83.36-1.72.53-2.64.53-.92 0-1.81-.17-2.64-.53-.81-.34-1.55-.83-2.17-1.45a6.773 6.773 0 01-1.45-2.17A6.59 6.59 0 011.21 8c0-.92.17-1.81.53-2.64.34-.81.83-1.55 1.45-2.17.62-.62 1.36-1.11 2.17-1.45A6.59 6.59 0 018 1.21c.92 0 1.81.17 2.64.53.81.34 1.55.83 2.17 1.45.62.62 1.11 1.36 1.45 2.17.36.83.53 1.72.53 2.64 0 .92-.17 1.81-.53 2.64-.34.81-.83 1.55-1.45 2.17zM4 6.8v-.59c0-.66.53-1.19 1.2-1.19h.59c.66 0 1.19.53 1.19 1.19v.59c0 .67-.53 1.2-1.19 1.2H5.2C4.53 8 4 7.47 4 6.8zm5 0v-.59c0-.66.53-1.19 1.2-1.19h.59c.66 0 1.19.53 1.19 1.19v.59c0 .67-.53 1.2-1.19 1.2h-.59C9.53 8 9 7.47 9 6.8zm4 3.2c-.72 1.88-2.91 3-5 3s-4.28-1.13-5-3c-.14-.39.23-1 .66-1h8.59c.41 0 .89.61.75 1z"/></svg>
                  </span>
                </button>
              </span>
              <text-expander keys=": @" data-mention-url="/autocomplete/user-suggestions" data-emoji-url="/autocomplete/emoji">
                <input
                  type="text"
                  autocomplete="off"
                  data-no-org-url="/autocomplete/user-suggestions"
                  data-org-url="/suggestions?mention_suggester=1"
                  data-maxlength="80"
                  class="d-table-cell width-full form-control js-user-status-message-field js-characters-remaining-field"
                  placeholder="What's happening?"
                  name="message"
                  value=""
                  aria-label="What is your current status?">
              </text-expander>
              <div class="error">Could not update your status, please try again.</div>
            </div>
            <div style="margin-left: 53px" class="my-1 text-small label-characters-remaining js-characters-remaining" data-suffix="remaining" hidden>
              80 remaining
            </div>
          </div>
          <include-fragment class="js-user-status-emoji-picker" data-url="/users/status/emoji"></include-fragment>
          <div class="overflow-auto ml-n3 mr-n3 px-3 border-bottom" style="max-height: 33vh">
            <div class="user-status-suggestions js-user-status-suggestions collapsed overflow-hidden">
              <h4 class="f6 text-normal my-3">Suggestions:</h4>
              <div class="mx-3 mt-2 clearfix">
                  <div class="float-left col-6">
                      <button type="button" value=":palm_tree:" class="d-flex flex-items-baseline flex-items-stretch lh-condensed f6 btn-link link-gray no-underline js-predefined-user-status mb-1">
                        <div class="emoji-status-width mr-2 v-align-middle js-predefined-user-status-emoji">
                          <g-emoji alias="palm_tree" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f334.png">🌴</g-emoji>
                        </div>
                        <div class="d-flex flex-items-center no-underline js-predefined-user-status-message ws-normal text-left" style="border-left: 1px solid transparent">
                          On vacation
                        </div>
                      </button>
                      <button type="button" value=":face_with_thermometer:" class="d-flex flex-items-baseline flex-items-stretch lh-condensed f6 btn-link link-gray no-underline js-predefined-user-status mb-1">
                        <div class="emoji-status-width mr-2 v-align-middle js-predefined-user-status-emoji">
                          <g-emoji alias="face_with_thermometer" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f912.png">🤒</g-emoji>
                        </div>
                        <div class="d-flex flex-items-center no-underline js-predefined-user-status-message ws-normal text-left" style="border-left: 1px solid transparent">
                          Out sick
                        </div>
                      </button>
                  </div>
                  <div class="float-left col-6">
                      <button type="button" value=":house:" class="d-flex flex-items-baseline flex-items-stretch lh-condensed f6 btn-link link-gray no-underline js-predefined-user-status mb-1">
                        <div class="emoji-status-width mr-2 v-align-middle js-predefined-user-status-emoji">
                          <g-emoji alias="house" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f3e0.png">🏠</g-emoji>
                        </div>
                        <div class="d-flex flex-items-center no-underline js-predefined-user-status-message ws-normal text-left" style="border-left: 1px solid transparent">
                          Working from home
                        </div>
                      </button>
                      <button type="button" value=":dart:" class="d-flex flex-items-baseline flex-items-stretch lh-condensed f6 btn-link link-gray no-underline js-predefined-user-status mb-1">
                        <div class="emoji-status-width mr-2 v-align-middle js-predefined-user-status-emoji">
                          <g-emoji alias="dart" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f3af.png">🎯</g-emoji>
                        </div>
                        <div class="d-flex flex-items-center no-underline js-predefined-user-status-message ws-normal text-left" style="border-left: 1px solid transparent">
                          Focusing
                        </div>
                      </button>
                  </div>
              </div>
            </div>
            <div class="user-status-limited-availability-container">
              <div class="form-checkbox my-0">
                <input type="checkbox" name="limited_availability" value="1" class="js-user-status-limited-availability-checkbox" data-default-message="I may be slow to respond." aria-describedby="limited-availability-help-text-truncate-true-compact-true" id="limited-availability-truncate-true-compact-true">
                <label class="d-block f5 text-gray-dark mb-1" for="limited-availability-truncate-true-compact-true">
                  Busy
                </label>
                <p class="note" id="limited-availability-help-text-truncate-true-compact-true">
                  When others mention you, assign you, or request your review,
                  GitHub will let them know that you have limited availability.
                </p>
              </div>
            </div>
          </div>
            

<div class="d-inline-block f5 mr-2 pt-3 pb-2" >
  <div class="d-inline-block mr-1">
    Clear status
  </div>

  <details class="js-user-status-expire-drop-down f6 dropdown details-reset details-overlay d-inline-block mr-2">
    <summary class="f5 btn-link link-gray-dark border px-2 py-1 rounded-1" aria-haspopup="true">
      <div class="js-user-status-expiration-interval-selected d-inline-block v-align-baseline">
        Never
      </div>
      <div class="dropdown-caret"></div>
    </summary>

    <ul class="dropdown-menu dropdown-menu-se pl-0 overflow-auto" style="width: 220px; max-height: 15.5em">
      <li>
        <button type="button" class="btn-link dropdown-item js-user-status-expire-button ws-normal" title="Never">
          <span class="d-inline-block text-bold mb-1">Never</span>
          <div class="f6 lh-condensed">Keep this status until you clear your status or edit your status.</div>
        </button>
      </li>
      <li class="dropdown-divider" role="none"></li>
        <li>
          <button type="button" class="btn-link dropdown-item ws-normal js-user-status-expire-button" title="in 30 minutes" value="2019-11-09T15:57:15+08:00">
            in 30 minutes
          </button>
        </li>
        <li>
          <button type="button" class="btn-link dropdown-item ws-normal js-user-status-expire-button" title="in 1 hour" value="2019-11-09T16:27:15+08:00">
            in 1 hour
          </button>
        </li>
        <li>
          <button type="button" class="btn-link dropdown-item ws-normal js-user-status-expire-button" title="in 4 hours" value="2019-11-09T19:27:15+08:00">
            in 4 hours
          </button>
        </li>
        <li>
          <button type="button" class="btn-link dropdown-item ws-normal js-user-status-expire-button" title="today" value="2019-11-09T23:59:59+08:00">
            today
          </button>
        </li>
        <li>
          <button type="button" class="btn-link dropdown-item ws-normal js-user-status-expire-button" title="this week" value="2019-11-10T23:59:59+08:00">
            this week
          </button>
        </li>
    </ul>
  </details>
  <input class="js-user-status-expiration-date-input" type="hidden" name="expires_at" value="">
</div>

          <include-fragment class="js-user-status-org-picker" data-url="/users/status/organizations"></include-fragment>
        </div>
        <div class="d-flex flex-items-center flex-justify-between p-3 border-top">
          <button type="submit" disabled class="width-full btn btn-primary mr-2 js-user-status-submit">
            Set status
          </button>
          <button type="button" disabled class="width-full js-clear-user-status-button btn ml-2 ">
            Clear status
          </button>
        </div>
</form>    </details-dialog>
  </details>
</div>

      </div>
      <div role="none" class="dropdown-divider"></div>


    <a role="menuitem" class="dropdown-item" href="/uchenm" data-ga-click="Header, go to profile, text:your profile">Your profile</a>

    <a role="menuitem" class="dropdown-item" href="/uchenm?tab=repositories" data-ga-click="Header, go to repositories, text:your repositories">Your repositories</a>

    <a role="menuitem" class="dropdown-item" href="/uchenm?tab=projects" data-ga-click="Header, go to projects, text:your projects">Your projects</a>

    <a role="menuitem" class="dropdown-item" href="/uchenm?tab=stars" data-ga-click="Header, go to starred repos, text:your stars">Your stars</a>
      <a role="menuitem" class="dropdown-item" href="https://gist.github.com/mine" data-ga-click="Header, your gists, text:your gists">Your gists</a>





    <div role="none" class="dropdown-divider"></div>
      
<div id="feature-enrollment-toggle" class="hide-sm hide-md feature-preview-details position-relative">
  <button
    type="button"
    class="dropdown-item btn-link"
    role="menuitem"
    data-feature-preview-trigger-url="/users/uchenm/feature_previews"
    data-feature-preview-close-details="{&quot;event_type&quot;:&quot;feature_preview.clicks.close_modal&quot;,&quot;payload&quot;:{&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}"
    data-feature-preview-close-hmac="31ce28cfcb61866d5a6bedf58aa973d35cd5e04dab0367aa48275bd596a8bcaf"
    data-hydro-click="{&quot;event_type&quot;:&quot;feature_preview.clicks.open_modal&quot;,&quot;payload&quot;:{&quot;link_location&quot;:&quot;user_dropdown&quot;,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}"
    data-hydro-click-hmac="23d139ac46fbbbe7788c16ce5febf96a5369d7422c35df3756c20a9ad495ffca"
  >
    Feature preview
  </button>
    <span class="feature-preview-indicator js-feature-preview-indicator" hidden></span>
</div>

    <a role="menuitem" class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">Help</a>
    <a role="menuitem" class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">Settings</a>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="logout-form" action="/logout" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="PruRZQyjczjGslu64v0jU1Gv1KiAEEwJlHkgr7f7Vy6mVmdcTbS7hRwK0+lhdn6D8jJa0nAAiiAinaE8u3/10g==" />
      
      <button type="submit" class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout" role="menuitem">
        Sign out
      </button>
</form>  </details-menu>
</details>

    </div>

  </header>

      

  </div>

  <div id="start-of-content" class="show-on-focus"></div>


    <div id="js-flash-container">

</div>



  <div class="application-main " data-commit-hovercards-enabled>
        <div itemscope itemtype="http://schema.org/SoftwareSourceCode" class="">
    <main  >
      


  

      <div class="border-bottom shelf intro-shelf js-notice mb-0 pb-4">
  <div class="width-full container">
    <div class="width-full mx-auto shelf-content">
      <h2 class="shelf-title">Learn Git and GitHub without any code!</h2>
      <p class="shelf-lead">
          Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.
      </p>
      <a class="btn btn-primary shelf-cta" target="_blank" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;READ_GUIDE&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="45912b90a0c4d3e17b7f44f0481e7db31c48e38936e137ff1a629b4651264a5a" href="https://guides.github.com/activities/hello-world/">Read the guide</a>
    </div>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="shelf-dismiss js-notice-dismiss" action="/dashboard/dismiss_bootcamp" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="_method" value="delete" /><input type="hidden" name="authenticity_token" value="iFHnHGWr0wKyACz3pPlmWRUTKBMS+6MNNzOA+4sel35D0WQ6rD8lWtd4yc7qiXC8BaayxjoKNChtoRfQwF4EiA==" />
      <button name="button" type="submit" class="mr-1 close-button tooltipped tooltipped-w" aria-label="Hide this notice forever" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;DISMISS_BANNER&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="1da6483762c56dcb88416d9ba6fe0782e289946bb7cce13fc4aa88c39b24328c">
        <svg aria-label="Hide this notice forever" class="octicon octicon-x v-align-text-top" viewBox="0 0 12 16" version="1.1" width="12" height="16" role="img"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
</button></form>  </div>
</div>











  <div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav pt-0 pt-lg-4 ">
    <div class="repohead-details-container clearfix container-lg p-responsive d-none d-lg-block">

      <ul class="pagehead-actions">




  <li>
    
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form data-remote="true" class="clearfix js-social-form js-social-container" action="/notifications/subscribe" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="dRd7bAPTbHgA3EGYL2mw/KgUuKYe7cNrCRMl0M8JCLdCokopvt2tLLTMcE5b/k73bozcCp/ui2RD2pLfzjGeXw==" />      <input type="hidden" name="repository_id" value="119780104">

      <details class="details-reset details-overlay select-menu float-left">
        <summary class="select-menu-button float-left btn btn-sm btn-with-count" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;WATCH_BUTTON&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="c3f39875fc6d1a9ce10ada6e1e069758f8d8084a4befa5c4214b0b400b6ac737" data-ga-click="Repository, click Watch settings, action:blob#show">          <span data-menu-button>
              <svg class="octicon octicon-eye v-align-text-bottom" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
              Watch
          </span>
</summary>        <details-menu
          class="select-menu-modal position-absolute mt-5"
          style="z-index: 99;">
          <div class="select-menu-header">
            <span class="select-menu-title">Notifications</span>
          </div>
          <div class="select-menu-list">
            <button type="submit" name="do" value="included" class="select-menu-item width-full" aria-checked="true" role="menuitemradio">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5L12 5z"/></svg>
              <div class="select-menu-item-text">
                <span class="select-menu-item-heading">Not watching</span>
                <span class="description">Be notified only when participating or @mentioned.</span>
                <span class="hidden-select-button-text" data-menu-button-contents>
                  <svg class="octicon octicon-eye v-align-text-bottom" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                  Watch
                </span>
              </div>
            </button>

            <button type="submit" name="do" value="release_only" class="select-menu-item width-full" aria-checked="false" role="menuitemradio">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5L12 5z"/></svg>
              <div class="select-menu-item-text">
                <span class="select-menu-item-heading">Releases only</span>
                <span class="description">Be notified of new releases, and when participating or @mentioned.</span>
                <span class="hidden-select-button-text" data-menu-button-contents>
                  <svg class="octicon octicon-eye v-align-text-bottom" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                  Unwatch releases
                </span>
              </div>
            </button>

            <button type="submit" name="do" value="subscribed" class="select-menu-item width-full" aria-checked="false" role="menuitemradio">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5L12 5z"/></svg>
              <div class="select-menu-item-text">
                <span class="select-menu-item-heading">Watching</span>
                <span class="description">Be notified of all conversations.</span>
                <span class="hidden-select-button-text" data-menu-button-contents>
                  <svg class="octicon octicon-eye v-align-text-bottom" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.06 2C3 2 0 8 0 8s3 6 8.06 6C13 14 16 8 16 8s-3-6-7.94-6zM8 12c-2.2 0-4-1.78-4-4 0-2.2 1.8-4 4-4 2.22 0 4 1.8 4 4 0 2.22-1.78 4-4 4zm2-4c0 1.11-.89 2-2 2-1.11 0-2-.89-2-2 0-1.11.89-2 2-2 1.11 0 2 .89 2 2z"/></svg>
                  Unwatch
                </span>
              </div>
            </button>

            <button type="submit" name="do" value="ignore" class="select-menu-item width-full" aria-checked="false" role="menuitemradio">
              <svg class="octicon octicon-check select-menu-item-icon" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M12 5l-8 8-4-4 1.5-1.5L4 10l6.5-6.5L12 5z"/></svg>
              <div class="select-menu-item-text">
                <span class="select-menu-item-heading">Ignoring</span>
                <span class="description">Never be notified.</span>
                <span class="hidden-select-button-text" data-menu-button-contents>
                  <svg class="octicon octicon-mute v-align-text-bottom" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 2.81v10.38c0 .67-.81 1-1.28.53L3 10H1c-.55 0-1-.45-1-1V7c0-.55.45-1 1-1h2l3.72-3.72C7.19 1.81 8 2.14 8 2.81zm7.53 3.22l-1.06-1.06-1.97 1.97-1.97-1.97-1.06 1.06L11.44 8 9.47 9.97l1.06 1.06 1.97-1.97 1.97 1.97 1.06-1.06L13.56 8l1.97-1.97z"/></svg>
                  Stop ignoring
                </span>
              </div>
            </button>
          </div>
        </details-menu>
      </details>
        <a class="social-count js-social-count"
          href="/whvcse/RedisUtil/watchers"
          aria-label="27 users are watching this repository">
          27
        </a>
</form>
  </li>

  <li>
      <div class="js-toggler-container js-social-container starring-container ">
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="starred js-social-form" action="/whvcse/RedisUtil/unstar" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="VPblxAyvdIvQ5e5CgmkvxPD0QayOLMmoH/KyhWzDFz1TpUZ84V8yTBxbMl3q/IKmkokAjGnCho4hGNZCQjrnYg==" />
      <input type="hidden" name="context" value="repository"></input>
      <button type="submit" class="btn btn-sm btn-with-count js-toggler-target" aria-label="Unstar this repository" title="Unstar whvcse/RedisUtil" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;UNSTAR_BUTTON&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="5dce6f211dcb82befccfd0ab12df4446b2485ccfe19bfc12ea68a3fdeae2d18e" data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">        <svg class="octicon octicon-star v-align-text-bottom" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74L14 6z"/></svg>
        Unstar
</button>        <a class="social-count js-social-count" href="/whvcse/RedisUtil/stargazers"
           aria-label="459 users starred this repository">
           459
        </a>
</form>
    <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="unstarred js-social-form" action="/whvcse/RedisUtil/star" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="YuB6dmI8da0hRRYOxQwLdTznoqz9lcBSzRg0efwZwdv6G0RgzFps9Q/dJYjsUpGeZDE6qBRpC7IFOo6eEjMf7A==" />
      <input type="hidden" name="context" value="repository"></input>
      <button type="submit" class="btn btn-sm btn-with-count js-toggler-target" aria-label="Unstar this repository" title="Star whvcse/RedisUtil" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;STAR_BUTTON&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="6cb352ec00fb7b81038bbc8b49d6d4b91590b8f9990ca8ba06e8b67254229d3c" data-ga-click="Repository, click star button, action:blob#show; text:Star">        <svg class="octicon octicon-star v-align-text-bottom" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M14 6l-4.9-.64L7 1 4.9 5.36 0 6l3.6 3.26L2.67 14 7 11.67 11.33 14l-.93-4.74L14 6z"/></svg>
        Star
</button>        <a class="social-count js-social-count" href="/whvcse/RedisUtil/stargazers"
           aria-label="459 users starred this repository">
          459
        </a>
</form>  </div>

  </li>

  <li>
          <details class="details-reset details-overlay details-overlay-dark d-inline-block float-left">
            <summary class="btn btn-sm btn-with-count" data-hydro-click="{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;FORK_BUTTON&quot;,&quot;repository_id&quot;:119780104,&quot;client_id&quot;:&quot;1183444351.1561439677&quot;,&quot;originating_request_id&quot;:&quot;46B9:587A:1E587A:2D8E3F:5DC66A52&quot;,&quot;originating_url&quot;:&quot;https://github.com/whvcse/RedisUtil/blob/master/README.md&quot;,&quot;referrer&quot;:&quot;https://github.com/whvcse/RedisUtil&quot;,&quot;user_id&quot;:3413357}}" data-hydro-click-hmac="4327dbd2f2b25f7f321e3d3a1d6e5c629a346b09a6a205b2f7f64f7e2c62199c" data-ga-click="Repository, show fork modal, action:blob#show; text:Fork" title="Fork your own copy of whvcse/RedisUtil to your account">              <svg class="octicon octicon-repo-forked v-align-text-bottom" viewBox="0 0 10 16" version="1.1" width="10" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8 1a1.993 1.993 0 00-1 3.72V6L5 8 3 6V4.72A1.993 1.993 0 002 1a1.993 1.993 0 00-1 3.72V6.5l3 3v1.78A1.993 1.993 0 005 15a1.993 1.993 0 001-3.72V9.5l3-3V4.72A1.993 1.993 0 008 1zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3 10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zm3-10c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
              Fork
</summary>            <details-dialog
              class="anim-fade-in fast Box Box--overlay d-flex flex-column"
              src="/whvcse/RedisUtil/fork?fragment=1"
              preload>
              <div class="Box-header">
                <button class="Box-btn-octicon btn-octicon float-right" type="button" aria-label="Close dialog" data-close-dialog>
                  <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
                </button>
                <h3 class="Box-title">Fork RedisUtil</h3>
              </div>
              <div class="overflow-auto text-center">
                <include-fragment>
                  <div class="octocat-spinner my-3" aria-label="Loading..."></div>
                  <p class="f5 text-gray">If this dialog fails to load, you can visit <a href="/whvcse/RedisUtil/fork">the fork page</a> directly.</p>
                </include-fragment>
              </div>
            </details-dialog>
          </details>

    <a href="/whvcse/RedisUtil/network/members" class="social-count"
       aria-label="339 users forked this repository">
      339
    </a>
  </li>
</ul>

      <h1 class="public ">
    <svg class="octicon octicon-repo" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9H3V8h1v1zm0-3H3v1h1V6zm0-2H3v1h1V4zm0-2H3v1h1V2zm8-1v12c0 .55-.45 1-1 1H6v2l-1.5-1.5L3 16v-2H1c-.55 0-1-.45-1-1V1c0-.55.45-1 1-1h10c.55 0 1 .45 1 1zm-1 10H1v2h2v-1h3v1h5v-2zm0-10H2v9h9V1z"/></svg>
  <span class="author" itemprop="author"><a class="url fn" rel="author" data-hovercard-type="user" data-hovercard-url="/hovercards?user_id=22876810" data-octo-click="hovercard-link-click" data-octo-dimensions="link_type:self" href="/whvcse">whvcse</a></span><!--
--><span class="path-divider">/</span><!--
--><strong itemprop="name"><a data-pjax="#js-repo-pjax-container" href="/whvcse/RedisUtil">RedisUtil</a></strong>
  

</h1>

    </div>
    
<nav class="hx_reponav reponav js-repo-nav js-sidenav-container-pjax container-lg p-responsive d-none d-lg-block"
     itemscope
     itemtype="http://schema.org/BreadcrumbList"
    aria-label="Repository"
     data-pjax="#js-repo-pjax-container">

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a class="js-selected-navigation-item selected reponav-item" itemprop="url" data-hotkey="g c" aria-current="page" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages /whvcse/RedisUtil" href="/whvcse/RedisUtil">
      <svg class="octicon octicon-code" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M9.5 3L8 4.5 11.5 8 8 11.5 9.5 13 14 8 9.5 3zm-5 0L0 8l4.5 5L6 11.5 2.5 8 6 4.5 4.5 3z"/></svg>
      <span itemprop="name">Code</span>
      <meta itemprop="position" content="1">
</a>  </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a itemprop="url" data-hotkey="g i" class="js-selected-navigation-item reponav-item" data-selected-links="repo_issues repo_labels repo_milestones /whvcse/RedisUtil/issues" href="/whvcse/RedisUtil/issues">
        <svg class="octicon octicon-issue-opened" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7 2.3c3.14 0 5.7 2.56 5.7 5.7s-2.56 5.7-5.7 5.7A5.71 5.71 0 011.3 8c0-3.14 2.56-5.7 5.7-5.7zM7 1C3.14 1 0 4.14 0 8s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm1 3H6v5h2V4zm0 6H6v2h2v-2z"/></svg>
        <span itemprop="name">Issues</span>
        <span class="Counter">6</span>
        <meta itemprop="position" content="2">
</a>    </span>

  <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
    <a data-hotkey="g p" itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_pulls checks /whvcse/RedisUtil/pulls" href="/whvcse/RedisUtil/pulls">
      <svg class="octicon octicon-git-pull-request" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M11 11.28V5c-.03-.78-.34-1.47-.94-2.06C9.46 2.35 8.78 2.03 8 2H7V0L4 3l3 3V4h1c.27.02.48.11.69.31.21.2.3.42.31.69v6.28A1.993 1.993 0 0010 15a1.993 1.993 0 001-3.72zm-1 2.92c-.66 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2zM4 3c0-1.11-.89-2-2-2a1.993 1.993 0 00-1 3.72v6.56A1.993 1.993 0 002 15a1.993 1.993 0 001-3.72V4.72c.59-.34 1-.98 1-1.72zm-.8 10c0 .66-.55 1.2-1.2 1.2-.65 0-1.2-.55-1.2-1.2 0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2zM2 4.2C1.34 4.2.8 3.65.8 3c0-.65.55-1.2 1.2-1.2.65 0 1.2.55 1.2 1.2 0 .65-.55 1.2-1.2 1.2z"/></svg>
      <span itemprop="name">Pull requests</span>
      <span class="Counter">0</span>
      <meta itemprop="position" content="3">
</a>  </span>


    <a data-hotkey="g b" class="js-selected-navigation-item reponav-item" data-selected-links="repo_projects new_repo_project repo_project /whvcse/RedisUtil/projects" href="/whvcse/RedisUtil/projects">
      <svg class="octicon octicon-project" viewBox="0 0 15 16" version="1.1" width="15" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M10 12h3V2h-3v10zm-4-2h3V2H6v8zm-4 4h3V2H2v12zm-1 1h13V1H1v14zM14 0H1a1 1 0 00-1 1v14a1 1 0 001 1h13a1 1 0 001-1V1a1 1 0 00-1-1z"/></svg>
      Projects
      <span class="Counter" >0</span>
</a>

    <a class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /whvcse/RedisUtil/wiki" href="/whvcse/RedisUtil/wiki">
      <svg class="octicon octicon-book" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M3 5h4v1H3V5zm0 3h4V7H3v1zm0 2h4V9H3v1zm11-5h-4v1h4V5zm0 2h-4v1h4V7zm0 2h-4v1h4V9zm2-6v9c0 .55-.45 1-1 1H9.5l-1 1-1-1H2c-.55 0-1-.45-1-1V3c0-.55.45-1 1-1h5.5l1 1 1-1H15c.55 0 1 .45 1 1zm-8 .5L7.5 3H2v9h6V3.5zm7-.5H9.5l-.5.5V12h6V3z"/></svg>
      Wiki
</a>
    <a data-skip-pjax="true" class="js-selected-navigation-item reponav-item" data-selected-links="security alerts policy code_scanning /whvcse/RedisUtil/security/advisories" href="/whvcse/RedisUtil/security/advisories">
      <svg class="octicon octicon-shield" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M0 2l7-2 7 2v6.02C14 12.69 8.69 16 7 16c-1.69 0-7-3.31-7-7.98V2zm1 .75L7 1l6 1.75v5.268C13 12.104 8.449 15 7 15c-1.449 0-6-2.896-6-6.982V2.75zm1 .75L7 2v12c-1.207 0-5-2.482-5-5.985V3.5z"/></svg>
      Security
</a>
    <a class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors dependency_graph pulse people /whvcse/RedisUtil/pulse" href="/whvcse/RedisUtil/pulse">
      <svg class="octicon octicon-graph" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M16 14v1H0V0h1v14h15zM5 13H3V8h2v5zm4 0H7V3h2v10zm4 0h-2V6h2v7z"/></svg>
      Insights
</a>

</nav>

  <div class="reponav-wrapper reponav-small d-lg-none">
  <nav class="reponav js-reponav text-center no-wrap"
       itemscope
       itemtype="http://schema.org/BreadcrumbList">

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a class="js-selected-navigation-item selected reponav-item" itemprop="url" aria-current="page" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages /whvcse/RedisUtil" href="/whvcse/RedisUtil">
        <span itemprop="name">Code</span>
        <meta itemprop="position" content="1">
</a>    </span>

      <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
        <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_issues repo_labels repo_milestones /whvcse/RedisUtil/issues" href="/whvcse/RedisUtil/issues">
          <span itemprop="name">Issues</span>
          <span class="Counter">6</span>
          <meta itemprop="position" content="2">
</a>      </span>

    <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
      <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_pulls checks /whvcse/RedisUtil/pulls" href="/whvcse/RedisUtil/pulls">
        <span itemprop="name">Pull requests</span>
        <span class="Counter">0</span>
        <meta itemprop="position" content="3">
</a>    </span>

      <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
        <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_projects new_repo_project repo_project /whvcse/RedisUtil/projects" href="/whvcse/RedisUtil/projects">
          <span itemprop="name">Projects</span>
          <span class="Counter">0</span>
          <meta itemprop="position" content="4">
</a>      </span>

      <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
        <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="repo_wiki /whvcse/RedisUtil/wiki" href="/whvcse/RedisUtil/wiki">
          <span itemprop="name">Wiki</span>
          <meta itemprop="position" content="5">
</a>      </span>

      <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="security alerts policy code_scanning /whvcse/RedisUtil/security/advisories" href="/whvcse/RedisUtil/security/advisories">
        <span itemprop="name">Security</span>
        <meta itemprop="position" content="6">
</a>
      <a class="js-selected-navigation-item reponav-item" data-selected-links="pulse /whvcse/RedisUtil/pulse" href="/whvcse/RedisUtil/pulse">
        Pulse
</a>
      <span itemscope itemtype="http://schema.org/ListItem" itemprop="itemListElement">
        <a itemprop="url" class="js-selected-navigation-item reponav-item" data-selected-links="community /whvcse/RedisUtil/community" href="/whvcse/RedisUtil/community">
          Community
</a>      </span>

  </nav>
</div>


  </div>
<div class="container-lg clearfix new-discussion-timeline experiment-repo-nav  p-responsive">
  <div class="repository-content ">

    
    


  


    <a class="d-none js-permalink-shortcut" data-hotkey="y" href="/whvcse/RedisUtil/blob/59ec94564b3ab1703fb51ed622ff5ef0f089bf40/README.md">Permalink</a>

    <!-- blob contrib key: blob_contributors:v21:7f5a2fbcea0f7c7582a39bdef7428e25 -->
      

    <div class="d-flex flex-items-start flex-shrink-0 pb-3 flex-column flex-md-row">
      <span class="d-flex flex-justify-between width-full width-md-auto">
        
<details class="details-reset details-overlay select-menu branch-select-menu  hx_rsm" id="branch-select-menu">
  <summary class="btn btn-sm select-menu-button css-truncate"
           data-hotkey="w"
           title="Switch branches or tags">
    <i>Branch:</i>
    <span class="css-truncate-target" data-menu-button>master</span>
  </summary>

  <details-menu class="select-menu-modal hx_rsm-modal position-absolute" style="z-index: 99;" src="/whvcse/RedisUtil/ref-list/master/README.md?source_action=show&amp;source_controller=blob" preload>
    <include-fragment class="select-menu-loading-overlay anim-pulse">
      <svg height="32" class="octicon octicon-octoface" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M14.7 5.34c.13-.32.55-1.59-.13-3.31 0 0-1.05-.33-3.44 1.3-1-.28-2.07-.32-3.13-.32s-2.13.04-3.13.32c-2.39-1.64-3.44-1.3-3.44-1.3-.68 1.72-.26 2.99-.13 3.31C.49 6.21 0 7.33 0 8.69 0 13.84 3.33 15 7.98 15S16 13.84 16 8.69c0-1.36-.49-2.48-1.3-3.35zM8 14.02c-3.3 0-5.98-.15-5.98-3.35 0-.76.38-1.48 1.02-2.07 1.07-.98 2.9-.46 4.96-.46 2.07 0 3.88-.52 4.96.46.65.59 1.02 1.3 1.02 2.07 0 3.19-2.68 3.35-5.98 3.35zM5.49 9.01c-.66 0-1.2.8-1.2 1.78s.54 1.79 1.2 1.79c.66 0 1.2-.8 1.2-1.79s-.54-1.78-1.2-1.78zm5.02 0c-.66 0-1.2.79-1.2 1.78s.54 1.79 1.2 1.79c.66 0 1.2-.8 1.2-1.79s-.53-1.78-1.2-1.78z"/></svg>
    </include-fragment>
  </details-menu>
</details>

        <div class="BtnGroup flex-shrink-0 d-md-none">
          <a href="/whvcse/RedisUtil/find/master"
                class="js-pjax-capture-input btn btn-sm BtnGroup-item"
                data-pjax
                data-hotkey="t">
            Find file
          </a>
          <clipboard-copy value="README.md" class="btn btn-sm BtnGroup-item">
            Copy path
          </clipboard-copy>
        </div>
      </span>
      <h2 id="blob-path" class="breadcrumb flex-auto min-width-0 text-normal flex-md-self-center ml-md-2 mr-md-3 my-2 my-md-0">
        <span class="js-repo-root text-bold"><span class="js-path-segment"><a data-pjax="true" href="/whvcse/RedisUtil"><span>RedisUtil</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
      </h2>

      <div class="BtnGroup flex-shrink-0 d-none d-md-inline-block">
        <a href="/whvcse/RedisUtil/find/master"
              class="js-pjax-capture-input btn btn-sm BtnGroup-item"
              data-pjax
              data-hotkey="t">
          Find file
        </a>
        <clipboard-copy value="README.md" class="btn btn-sm BtnGroup-item">
          Copy path
        </clipboard-copy>
      </div>
    </div>



    <include-fragment src="/whvcse/RedisUtil/contributors/master/README.md" class="Box Box--condensed commit-loader">
      <div class="Box-body bg-blue-light f6">
        Fetching contributors&hellip;
      </div>

      <div class="Box-body d-flex flex-items-center" >
          <img alt="" class="loader-loading mr-2" src="https://github.githubassets.com/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" height="16" />
        <span class="text-red h6 loader-error">Cannot retrieve contributors at this time</span>
      </div>
</include-fragment>




    <div class="Box mt-3 position-relative">
      
<div class="Box-header py-2 d-flex flex-column flex-shrink-0 flex-md-row flex-md-items-center">
  <div class="text-mono f6 flex-auto pr-3 flex-order-2 flex-md-order-1 mt-2 mt-md-0">

      339 lines (275 sloc)
      <span class="file-info-divider"></span>
    25.3 KB
  </div>

  <div class="d-flex py-1 py-md-0 flex-auto flex-order-1 flex-md-order-2 flex-sm-grow-0 flex-justify-between">

    <div class="BtnGroup">
      <a id="raw-url" class="btn btn-sm BtnGroup-item" href="/whvcse/RedisUtil/raw/master/README.md">Raw</a>
        <a class="btn btn-sm js-update-url-with-hash BtnGroup-item" data-hotkey="b" href="/whvcse/RedisUtil/blame/master/README.md">Blame</a>
      <a rel="nofollow" class="btn btn-sm BtnGroup-item" href="/whvcse/RedisUtil/commits/master/README.md">History</a>
    </div>


    <div>
            <a class="btn-octicon tooltipped tooltipped-nw"
               href="https://desktop.github.com"
               aria-label="Open this file in GitHub Desktop"
               data-ga-click="Repository, open with desktop, type:mac">
                <svg class="octicon octicon-device-desktop" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M15 2H1c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1h5.34c-.25.61-.86 1.39-2.34 2h8c-1.48-.61-2.09-1.39-2.34-2H15c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm0 9H1V3h14v8z"/></svg>
            </a>

            <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="inline-form js-update-url-with-hash" action="/whvcse/RedisUtil/edit/master/README.md" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="udqlg2suxatjcFj1qFhzUzmct32VmXgVnc6SkisqWLmgk3E0yvktLbXIlYV/wa+J0CCB3pg9NBSKjeznqdHSZQ==" />
              <button class="btn-octicon tooltipped tooltipped-nw" type="submit"
                aria-label="Fork this project and edit the file" data-hotkey="e" data-disable-with>
                <svg class="octicon octicon-pencil" viewBox="0 0 14 16" version="1.1" width="14" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M0 12v3h3l8-8-3-3-8 8zm3 2H1v-2h1v1h1v1zm10.3-9.3L12 6 9 3l1.3-1.3a.996.996 0 011.41 0l1.59 1.59c.39.39.39 1.02 0 1.41z"/></svg>
              </button>
</form>
          <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="inline-form" action="/whvcse/RedisUtil/delete/master/README.md" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="BxILChUYZjjRoEJ07uQb17pYw0K3dO9B576wH92TqNP2DtMhKEFXiqpOvFsIUQrb1dBCHrgywirqzYffhiulPQ==" />
            <button class="btn-octicon btn-octicon-danger tooltipped tooltipped-nw" type="submit"
              aria-label="Fork this project and delete the file" data-disable-with>
              <svg class="octicon octicon-trashcan" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M11 2H9c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1H2c-.55 0-1 .45-1 1v1c0 .55.45 1 1 1v9c0 .55.45 1 1 1h7c.55 0 1-.45 1-1V5c.55 0 1-.45 1-1V3c0-.55-.45-1-1-1zm-1 12H3V5h1v8h1V5h1v8h1V5h1v8h1V5h1v9zm1-10H2V3h9v1z"/></svg>
            </button>
</form>    </div>
  </div>
</div>




      
  <div id="readme" class="Box-body readme blob instapaper_body js-code-block-container">
    <article class="markdown-body entry-content p-3 p-md-6" itemprop="text"><h1><a id="user-content-redisutil" class="anchor" aria-hidden="true" href="#redisutil"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>RedisUtil</h1>
<h2><a id="user-content-介绍" class="anchor" aria-hidden="true" href="#介绍"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>介绍</h2>
<p> 最全的Java操作Redis的工具类，封装了对Redis五种基本类型的各种操作，力求符合Redis的原生操作，使用StringRedisTemplate实现！</p>
<p><strong>快速导航：</strong><br>
<a href="#%E4%B8%80keys%E7%9B%B8%E5%85%B3%E5%91%BD%E4%BB%A4">key命令操作</a> |
<a href="#%E4%BA%8Cstring%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E6%93%8D%E4%BD%9C">String数据操作</a> |
<a href="#%E4%B8%89hash%E7%9B%B8%E5%85%B3%E7%9A%84%E6%93%8D%E4%BD%9C">Hash数据操作</a> |
<a href="#%E5%9B%9Blist%E7%9B%B8%E5%85%B3%E7%9A%84%E6%93%8D%E4%BD%9C">List数据操作</a> |
<a href="#%E4%BA%94set%E7%9B%B8%E5%85%B3%E7%9A%84%E6%93%8D%E4%BD%9C">Set数据操作</a> |
<a href="#%E5%85%ADzset%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E6%93%8D%E4%BD%9C">zSet数据操作</a></p>
<p><strong>相关知识：</strong><br>
<a href="#%E7%9F%A5%E8%AF%86%E8%A1%A5%E5%85%85">Redis基础知识补充</a> |
<a href="#%E4%B8%89redis%E4%B8%8Espring%E7%9A%84%E9%9B%86%E6%88%90">Spring集成Redis</a> |
<a href="#%E5%9B%9BSpringBoot%E4%B8%AD%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8">在SpringBoot中使用</a></p>
<h2><a id="user-content-解惑" class="anchor" aria-hidden="true" href="#解惑"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>解惑</h2>
<p> 很多人提出疑问“为什么没有操作Object的方法？”，请看这里介绍<a href="#%E4%BA%8Credistemplate%E5%92%8Cstringredistemplate">redistemplate和stringredistemplate</a>。</p>
<h2><a id="user-content-用法" class="anchor" aria-hidden="true" href="#用法"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>用法</h2>
<h3><a id="user-content-一keys相关命令" class="anchor" aria-hidden="true" href="#一keys相关命令"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>一、keys相关命令</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>void delete(String key)</td>
<td>key存在时删除key</td>
</tr>
<tr>
<td align="center">2</td>
<td>void delete(Collection keys)</td>
<td>批量删除key</td>
</tr>
<tr>
<td align="center">3</td>
<td>byte[] dump(String key)</td>
<td>序列化key，返回被序列化的值</td>
</tr>
<tr>
<td align="center">4</td>
<td>Boolean hasKey(String key)</td>
<td>检查key是否存在</td>
</tr>
<tr>
<td align="center">5</td>
<td>Boolean expire(String key, long timeout, TimeUnit unit)</td>
<td>设置过期时间</td>
</tr>
<tr>
<td align="center">6</td>
<td>Boolean expireAt(String key, Date date)</td>
<td>设置过期时间</td>
</tr>
<tr>
<td align="center">7</td>
<td>Set keys(String pattern)</td>
<td>查找所有符合给定模式(pattern)的key</td>
</tr>
<tr>
<td align="center">8</td>
<td>Boolean move(String key, int dbIndex)</td>
<td>将当前数据库的key移动到给定的数据库db当中</td>
</tr>
<tr>
<td align="center">9</td>
<td>Boolean persist(String key)</td>
<td>移除key的过期时间，key将持久保持</td>
</tr>
<tr>
<td align="center">10</td>
<td>Long getExpire(String key, TimeUnit unit)</td>
<td>返回key的剩余的过期时间</td>
</tr>
<tr>
<td align="center">11</td>
<td>Long getExpire(String key)</td>
<td>返回key的剩余的过期时间</td>
</tr>
<tr>
<td align="center">12</td>
<td>String randomKey()</td>
<td>从当前数据库中随机返回一个key</td>
</tr>
<tr>
<td align="center">13</td>
<td>void rename(String oldKey, String newKey)</td>
<td>修改key的名称</td>
</tr>
<tr>
<td align="center">14</td>
<td>Boolean renameIfAbsent(String oldKey, String newKey)</td>
<td>仅当newkey不存在时，将oldKey改名为 newkey</td>
</tr>
<tr>
<td align="center">15</td>
<td>DataType type(String key)</td>
<td>返回key所储存的值的类型</td>
</tr>
</tbody>
</table>
<blockquote>
<p><strong>TimeUnit是时间单位，可选值有：</strong><br>
 天:TimeUnit.DAYS、小时:TimeUnit.HOURS、分钟:TimeUnit.MINUTES、秒:TimeUnit.SECONDS、毫秒:TimeUnit.MILLISECONDS。</p>
</blockquote>
<br>
<h3><a id="user-content-二string数据类型操作" class="anchor" aria-hidden="true" href="#二string数据类型操作"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>二、String数据类型操作</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>String get(String key)</td>
<td>获取指定key的值</td>
</tr>
<tr>
<td align="center">2</td>
<td>String getRange(String key, long start, long end)</td>
<td>返回key中字符串值的子字符</td>
</tr>
<tr>
<td align="center">3</td>
<td>String getAndSet(String key, String value)</td>
<td>将key的值设为value，并返回key旧值</td>
</tr>
<tr>
<td align="center">4</td>
<td>Boolean getBit(String key, long offset)</td>
<td>对key所储存的值，获取指定位置上的bit</td>
</tr>
<tr>
<td align="center">5</td>
<td>List multiGet(Collection keys)</td>
<td>批量获取</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>添加相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">6</td>
<td>void set(String key, String value)</td>
<td>设置指定key的值</td>
</tr>
<tr>
<td align="center">7</td>
<td>boolean setBit(String key, long offset, boolean value)</td>
<td>设置指定位置上的ASCII码</td>
</tr>
<tr>
<td align="center">8</td>
<td>void setEx(String key,String value,long timeout,TimeUnit unit)</td>
<td>将值value关联到key，并设置key过期时间</td>
</tr>
<tr>
<td align="center">9</td>
<td>boolean setIfAbsent(String key, String value)</td>
<td>只有在 key 不存在时设置 key 的值</td>
</tr>
<tr>
<td align="center">10</td>
<td>void setRange(String key, String value, long offset)</td>
<td>用value覆写key的值，从偏移量offset开始</td>
</tr>
<tr>
<td align="center">11</td>
<td>void multiSet(Map&lt;String,String&gt; maps)</td>
<td>批量添加</td>
</tr>
<tr>
<td align="center">12</td>
<td>boolean multiSetIfAbsent(Map&lt;String,String&gt; maps)</td>
<td>批量添加，仅当所有key都不存在</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>其他方法</strong></td>
<td></td>
</tr>
<tr>
<td align="center">13</td>
<td>Integer append(String key, String value)</td>
<td>追加到末尾</td>
</tr>
<tr>
<td align="center">14</td>
<td>Long incrBy(String key, long increment)</td>
<td>增加(自增长), 负数则为自减</td>
</tr>
<tr>
<td align="center">15</td>
<td>Double incrByFloat(String key, double increment)</td>
<td>增加(自增长), 负数则为自减</td>
</tr>
<tr>
<td align="center">16</td>
<td>Long size(String key)</td>
<td>获取字符串的长度</td>
</tr>
</tbody>
</table>
<blockquote>
<p><strong>关于上面xxBit方法的使用：</strong><br>
 例如字符'a'的ASCII码是97，转为二进制是'01100001'，setBit方法就是把第offset位置上变成0或者1，true是1，false是0。</p>
</blockquote>
<br>
<h3><a id="user-content-三hash相关的操作" class="anchor" aria-hidden="true" href="#三hash相关的操作"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>三、Hash相关的操作</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>Object hGet(String key, String field)</td>
<td>获取存储在哈希表中指定字段的值</td>
</tr>
<tr>
<td align="center">2</td>
<td>Map hGetAll(String key)</td>
<td>获取所有给定字段的值</td>
</tr>
<tr>
<td align="center">3</td>
<td>List hMultiGet(String key, Collection fields)</td>
<td>获取所有给定字段的值</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>添加相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">4</td>
<td>void hPut(String key, String hashKey, String value)</td>
<td>添加字段</td>
</tr>
<tr>
<td align="center">5</td>
<td>void hPutAll(String key, Map maps)</td>
<td>添加多个字段</td>
</tr>
<tr>
<td align="center">6</td>
<td>Boolean hPutIfAbsent(String key,String hashKey,String value)</td>
<td>仅当hashKey不存在时才设置</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>其他方法</strong></td>
<td></td>
</tr>
<tr>
<td align="center">7</td>
<td>Long hDelete(String key, Object... fields)</td>
<td>删除一个或多个哈希表字段</td>
</tr>
<tr>
<td align="center">8</td>
<td>boolean hExists(String key, String field)</td>
<td>查看哈希表key中指定的字段是否存在</td>
</tr>
<tr>
<td align="center">9</td>
<td>Long hIncrBy(String key, Object field, long increment)</td>
<td>为哈希表key中指定字段的值增加increment</td>
</tr>
<tr>
<td align="center">10</td>
<td>Double hIncrByFloat(String key, Object field, double delta)</td>
<td>为哈希表key中指定字段的值增加increment</td>
</tr>
<tr>
<td align="center">11</td>
<td>Set hKeys(String key)</td>
<td>获取所有哈希表中的字段</td>
</tr>
<tr>
<td align="center">12</td>
<td>Long hSize(String key)</td>
<td>获取哈希表中字段的数量</td>
</tr>
<tr>
<td align="center">13</td>
<td>List hValues(String key)</td>
<td>获取哈希表中所有值</td>
</tr>
<tr>
<td align="center">14</td>
<td>Cursor hScan(String key, ScanOptions options)</td>
<td>迭代哈希表中的键值对</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>引入序列化依赖</strong></td>
<td>     com.dyuproject.protostuff     protostuff-core     1.0.8        com.dyuproject.protostuff     protostuff-runtime     1.0.8 </td>
</tr>
<tr>
<td align="center">15</td>
<td>getListCache(final String key, Class targetClass)</td>
<td>获取缓存中的List，targetClass是序列化的类</td>
</tr>
<tr>
<td align="center">16</td>
<td>putListCacheWithExpireTime(String key, List objList, final long expireTime)</td>
<td>把List放到缓存，expireTime是过期策略</td>
</tr>
</tbody>
</table>
<br>
<h3><a id="user-content-四list相关的操作" class="anchor" aria-hidden="true" href="#四list相关的操作"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>四、List相关的操作</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>String lIndex(String key, long index)</td>
<td>通过索引获取列表中的元素</td>
</tr>
<tr>
<td align="center">2</td>
<td>List lRange(String key, long start, long end)</td>
<td>获取列表指定范围内的元素</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>添加相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">3</td>
<td>Long lLeftPush(String key, String value)</td>
<td>存储在list头部</td>
</tr>
<tr>
<td align="center">4</td>
<td>Long lLeftPushAll(String key, String... value)</td>
<td>存储在list头部</td>
</tr>
<tr>
<td align="center">5</td>
<td>Long lLeftPushAll(String key, Collection value)</td>
<td>存储在list头部</td>
</tr>
<tr>
<td align="center">6</td>
<td>Long lLeftPushIfPresent(String key, String value)</td>
<td>当list存在的时候才加入</td>
</tr>
<tr>
<td align="center">7</td>
<td>lLeftPush(String key, String pivot, String value)</td>
<td>如果pivot存在,再pivot前面添加</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">8</td>
<td>Long lRightPush(String key, String value)</td>
<td>存储在list尾部</td>
</tr>
<tr>
<td align="center">9</td>
<td>Long lRightPushAll(String key, String... value)</td>
<td>存储在list尾部</td>
</tr>
<tr>
<td align="center">10</td>
<td>Long lRightPushAll(String key, Collection value)</td>
<td>存储在list尾部</td>
</tr>
<tr>
<td align="center">11</td>
<td>Long lRightPushIfPresent(String key, String value)</td>
<td>当list存在的时候才加入</td>
</tr>
<tr>
<td align="center">12</td>
<td>lRightPush(String key, String pivot, String value)</td>
<td>在pivot元素的右边添加值</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">13</td>
<td>void lSet(String key, long index, String value)</td>
<td>通过索引设置列表元素的值</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>删除相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">14</td>
<td>String lLeftPop(String key)</td>
<td>移出并获取列表的第一个元素</td>
</tr>
<tr>
<td align="center">15</td>
<td>String lBLeftPop(String key,long timeout,TimeUnit unit)</td>
<td>移出并获取第一个元素,没有则阻塞直到超时或有为止</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">16</td>
<td>String lRightPop(String key)</td>
<td>移除并获取列表最后一个元素</td>
</tr>
<tr>
<td align="center">17</td>
<td>String lBRightPop(String key,long timeout,TimeUnit unit)</td>
<td>移出并获取最后个元素,没有则阻塞直到超时或有为止</td>
</tr>
<tr>
<td align="center">18</td>
<td>String lRightPopAndLeftPush(String sKey,String dKey)</td>
<td>移除最后一个元素并加到另一个列表并返回</td>
</tr>
<tr>
<td align="center">19</td>
<td>String lBRightPopAndLeftPush(sKey,dKey,timeout,unit)</td>
<td>移除最后个元素并加到另个列表并返回,阻塞超时或有</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">20</td>
<td>Long lRemove(String key, long index, String value)</td>
<td>删除集合中值等于value得元素</td>
</tr>
<tr>
<td align="center">21</td>
<td>void lTrim(String key, long start, long end)</td>
<td>裁剪list</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>其他方法</strong></td>
<td></td>
</tr>
<tr>
<td align="center">22</td>
<td>Long lLen(String key)</td>
<td>获取列表长度</td>
</tr>
</tbody>
</table>
<br>
<h3><a id="user-content-五set相关的操作" class="anchor" aria-hidden="true" href="#五set相关的操作"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>五、Set相关的操作</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>Set sMembers(String key)</td>
<td>获取集合所有元素</td>
</tr>
<tr>
<td align="center">2</td>
<td>Long sSize(String key)</td>
<td>获取集合大小</td>
</tr>
<tr>
<td align="center">3</td>
<td>Boolean sIsMember(String key, Object value)</td>
<td>判断集合是否包含value</td>
</tr>
<tr>
<td align="center">4</td>
<td>String sRandomMember(String key)</td>
<td>随机获取集合中的一个元素</td>
</tr>
<tr>
<td align="center">5</td>
<td>List sRandomMembers(String key, long count)</td>
<td>随机获取集合count个元素</td>
</tr>
<tr>
<td align="center">6</td>
<td>Set sDistinctRandomMembers(String key, long count)</td>
<td>随机获取count个元素并去除重复的</td>
</tr>
<tr>
<td align="center">7</td>
<td>Cursor sScan(String key, ScanOptions options)</td>
<td>使用迭代器获取元素</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">8</td>
<td>Set sIntersect(String key, String otherKey)</td>
<td>获取两个集合的交集</td>
</tr>
<tr>
<td align="center">9</td>
<td>Set sIntersect(String key, Collection otherKeys)</td>
<td>获取key集合与多个集合的交集</td>
</tr>
<tr>
<td align="center">10</td>
<td>Long sIntersectAndStore(String key, String oKey, String dKey)</td>
<td>key集合与oKey的交集存储到dKey中</td>
</tr>
<tr>
<td align="center">11</td>
<td>Long sIntersectAndStore(String key,Collection oKeys,String dKey)</td>
<td>key与多个集合的交集存储到dKey中</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">12</td>
<td>Set sUnion(String key, String otherKeys)</td>
<td>获取两个集合的并集</td>
</tr>
<tr>
<td align="center">13</td>
<td>Set sUnion(String key, Collection otherKeys)</td>
<td>获取key集合与多个集合的并集</td>
</tr>
<tr>
<td align="center">14</td>
<td>Long sUnionAndStore(String key, String otherKey, String destKey)</td>
<td>key集合与oKey的并集存储到dKey中</td>
</tr>
<tr>
<td align="center">15</td>
<td>Long sUnionAndStore(String key,Collection oKeys,String dKey)</td>
<td>key与多个集合的并集存储到dKey中</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">16</td>
<td>Set sDifference(String key, String otherKey)</td>
<td>获取两个集合的差集</td>
</tr>
<tr>
<td align="center">17</td>
<td>Set sDifference(String key, Collection otherKeys)</td>
<td>获取key集合与多个集合的差集</td>
</tr>
<tr>
<td align="center">18</td>
<td>Long sDifference(String key, String otherKey, String destKey)</td>
<td>key与oKey集合的差集存储到dKey中</td>
</tr>
<tr>
<td align="center">19</td>
<td>Long sDifference(String key,Collection otherKeys,String dKey)</td>
<td>key与多个集合的差集存储到dKey中</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>添加相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">20</td>
<td>Long sAdd(String key, String... values)</td>
<td>添加</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>删除相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">21</td>
<td>Long sRemove(String key, Object... values)</td>
<td>移除</td>
</tr>
<tr>
<td align="center">22</td>
<td>String sPop(String key)</td>
<td>随机移除一个元素</td>
</tr>
<tr>
<td align="center">23</td>
<td>Boolean sMove(String key, String value, String destKey)</td>
<td>将key集合中value移到destKey中</td>
</tr>
</tbody>
</table>
<br>
<h3><a id="user-content-六zset数据类型操作" class="anchor" aria-hidden="true" href="#六zset数据类型操作"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>六、zset数据类型操作</h3>
<table>
<thead>
<tr>
<th align="center">NO</th>
<th>方法</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center">1</td>
<td>Set zRange(String key, long start, long end)</td>
<td>获取元素,小到大排序,s开始e结束位置</td>
</tr>
<tr>
<td align="center">2</td>
<td>Set&lt;TypedTuple&gt; zRangeWithScores(String key, long start, long end)</td>
<td>获取集合元素, 并且把score值也获取</td>
</tr>
<tr>
<td align="center">3</td>
<td>Set zRangeByScore(String key, double min, double max)</td>
<td>根据score范围查询元素,从小到大排序</td>
</tr>
<tr>
<td align="center">4</td>
<td>Set&lt;TypedTuple&gt; zRangeByScoreWithScores(key,double min,double max)</td>
<td>根据score范围查询元素,并返回score</td>
</tr>
<tr>
<td align="center">5</td>
<td>Set zRangeByScoreWithScores(key,double min,max,long start,end)</td>
<td>根据score查询元素,s开始e结束位置</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">6</td>
<td>Set zReverseRange(String key, long start, long end)</td>
<td>获取集合元素, 从大到小排序</td>
</tr>
<tr>
<td align="center">7</td>
<td>Set&lt;TypedTuple&gt; zReverseRangeWithScores(key, long start, long end)</td>
<td>获取元素,从大到小排序,并返回score</td>
</tr>
<tr>
<td align="center">8</td>
<td>Set zReverseRangeByScore(String key, double min, double max)</td>
<td>根据score范围查询元素,从大到小排序</td>
</tr>
<tr>
<td align="center">9</td>
<td>Set zReverseRangeByScoreWithScores(key,double min,double max)</td>
<td>根据score查询,大到小排序返回score</td>
</tr>
<tr>
<td align="center">10</td>
<td>Set zReverseRangeByScore(key, double min, max, long start, end)</td>
<td>根据score查询,大到小,s开始e结束</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">11</td>
<td>Long zRank(String key, Object value)</td>
<td>返回元素在集合的排名,score由小到大</td>
</tr>
<tr>
<td align="center">12</td>
<td>Long zReverseRank(String key, Object value)</td>
<td>返回元素在集合的排名,score由大到小</td>
</tr>
<tr>
<td align="center">13</td>
<td>Long zCount(String key, double min, double max)</td>
<td>根据score值范围获取集合元素的数量</td>
</tr>
<tr>
<td align="center">14</td>
<td>Long zSize(String key)</td>
<td>获取集合大小</td>
</tr>
<tr>
<td align="center">15</td>
<td>Long zZCard(String key)</td>
<td>获取集合大小</td>
</tr>
<tr>
<td align="center">16</td>
<td>Double zScore(String key, Object value)</td>
<td>获取集合中value元素的score值</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">17</td>
<td>Long zUnionAndStore(String key, String otherKey, String destKey)</td>
<td>获取key和oKey的并集并存储在dKey中</td>
</tr>
<tr>
<td align="center">18</td>
<td>Long zUnionAndStore(String key,Collection otherKeys,String dKey)</td>
<td>获取key和多个集合并集并存在dKey中</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">19</td>
<td>Long zIntersectAndStore(String key, String otherKey, String destKey)</td>
<td>获取key和oKey交集并存在destKey中</td>
</tr>
<tr>
<td align="center">20</td>
<td>Long zIntersectAndStore(String key,Collection oKeys,String dKey)</td>
<td>获取key和多个集合交集并存在dKey中</td>
</tr>
<tr>
<td align="center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td align="center">21</td>
<td>Cursor&lt;TypedTuple&gt; zScan(String key, ScanOptions options)</td>
<td>使用迭代器获取</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>添加相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">22</td>
<td>Boolean zAdd(String key, String value, double score)</td>
<td>添加元素,zSet按score由小到大排列</td>
</tr>
<tr>
<td align="center">23</td>
<td>Long zAdd(String key, Set&lt;TypedTuple&gt; values)</td>
<td>批量添加,TypedTuple使用见下面介绍</td>
</tr>
<tr>
<td align="center"></td>
<td><strong>删除相关</strong></td>
<td></td>
</tr>
<tr>
<td align="center">24</td>
<td>Long zRemove(String key, Object... values)</td>
<td>移除</td>
</tr>
<tr>
<td align="center">25</td>
<td>Double zIncrementScore(String key, String value, double delta)</td>
<td>增加元素的score值,并返回增加后的值</td>
</tr>
<tr>
<td align="center">26</td>
<td>Long zRemoveRange(String key, long start, long end)</td>
<td>移除指定索引位置的成员</td>
</tr>
<tr>
<td align="center">27</td>
<td>Long zRemoveRangeByScore(String key, double min, double max)</td>
<td>根据指定的score值的范围来移除成员</td>
</tr>
</tbody>
</table>
<blockquote>
<p><strong>批量添加时<code>TypedTuple</code>的使用：</strong><br>
TypedTuple typedTuple = new DefaultTypedTuple(value,score)</p>
</blockquote>
<p><br><br></p>
<h2><a id="user-content-知识补充" class="anchor" aria-hidden="true" href="#知识补充"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>知识补充</h2>
<h3><a id="user-content-一redis知识补充" class="anchor" aria-hidden="true" href="#一redis知识补充"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>一、Redis知识补充</h3>
<p> Redis 可以存储键与5种不同数据结构类型之间的映射，这5种数据结构类型分别为：String（字符串）、List（列表）、Set（集合）、Hash（散列）和 zSet（有序集合）。</p>
<h4><a id="user-content-1string字符串" class="anchor" aria-hidden="true" href="#1string字符串"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>1.String（字符串）</h4>
<p><strong>结构存储的值：</strong><br>
  可以是字符串、整数或者浮点数。</p>
<p><strong>结构的读写能力：</strong><br>
  对整个字符串或者字符串的其中一部分执行操作，对象和浮点数执行自增(increment)或者自减(decrement)。</p>
<h4><a id="user-content-2-list列表" class="anchor" aria-hidden="true" href="#2-list列表"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>2. List（列表）</h4>
<p><strong>结构存储的值：</strong><br>
  一个链表，链表上的每个节点都包含了一个字符串。</p>
<p><strong>结构的读写能力：</strong><br>
  从链表的两端推入或者弹出元素，根据偏移量(offset)对链表进行修剪(trim)，读取单个或者多个元素，根据值来查找或者移除元素。</p>
<h4><a id="user-content-3-set集合" class="anchor" aria-hidden="true" href="#3-set集合"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>3. Set（集合）</h4>
<p><strong>结构存储的值：</strong><br>
  包含字符串的无序收集器(unOrderedCollection)，并且被包含的每个字符串都是独一无二的、各不相同。</p>
<p><strong>结构的读写能力：</strong><br>
  添加、获取、移除单个元素，检查一个元素是否存在于某个集合中，计算交集、并集、差集，从集合里面随机获取元素。</p>
<h4><a id="user-content-4-hash散列" class="anchor" aria-hidden="true" href="#4-hash散列"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>4. Hash（散列）</h4>
<p><strong>结构存储的值：</strong><br>
  包含键值对的无序散列表。</p>
<p><strong>结构的读写能力：</strong><br>
  添加、获取、移除单个键值对，获取所有键值对。</p>
<h4><a id="user-content-5-zset有序集合" class="anchor" aria-hidden="true" href="#5-zset有序集合"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>5. zSet（有序集合）</h4>
<p><strong>结构存储的值：</strong><br>
  字符串成员(member)与浮点数分值(score)之间的有序映射，元素的排列顺序由分值(score)的大小决定。</p>
<p><strong>结构的读写能力：</strong><br>
  添加、获取、删除单个元素，根据分值(score)范围(range)或者成员来获取元素。</p>
<br>
<h3><a id="user-content-二redistemplate和stringredistemplate" class="anchor" aria-hidden="true" href="#二redistemplate和stringredistemplate"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>二、RedisTemplate和StringRedisTemplate</h3>
<p>  二者主要区别是他们使用的序列化类不一样，RedisTemplate使用的是JdkSerializationRedisSerializer，
StringRedisTemplate使用的是StringRedisSerializer，两者的数据是不共通的。</p>
<h4><a id="user-content-1-redistemplate" class="anchor" aria-hidden="true" href="#1-redistemplate"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>1. RedisTemplate：</h4>
<p>  RedisTemplate使用的是JDK的序列化策略，向Redis存入数据会将数据先序列化成字节数组然后在存入Redis数据库，
这个时候打开Redis查看的时候，你会看到你的数据不是以可读的形式展现的，而是以字节数组显示，类似下面：<code>\xAC\xED\x00\x05t\x05sr\x00</code>。</p>
<p>  所以使用RedisTemplate可以把一个Java对象直接存储在Redis里面，但是存进去的数据是不易直观读的，不通用的，
建议不要直接存一个Object对象，可以变成Hash来存储，也可以转成json格式的数据来存储，在实际应用中也是很多都采用json格式来存储的。</p>
<h4><a id="user-content-2-stringredistemplate" class="anchor" aria-hidden="true" href="#2-stringredistemplate"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>2. StringRedisTemplate:</h4>
<p>  StringRedisTemplate默认采用的是String的序列化策略，保存的key和value都是采用此策略序列化保存的，
StringRedisTemplate是继承RedisTemplate的，这种对redis的操方式更优雅，任何Redis连接工具，都可以读出直观的数据，便于数据的维护。</p>
<br>
<h3><a id="user-content-三redis与spring的集成" class="anchor" aria-hidden="true" href="#三redis与spring的集成"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>三、Redis与Spring的集成</h3>
<p>1.集成配置</p>
<div class="highlight highlight-text-xml"><pre>&lt;<span class="pl-ent">bean</span> <span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>poolConfig<span class="pl-pds">"</span></span> <span class="pl-e">class</span>=<span class="pl-s"><span class="pl-pds">"</span>redis.clients.jedis.JedisPoolConfig<span class="pl-pds">"</span></span>&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>maxIdle<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>300<span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>maxTotal<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>600<span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>maxWaitMillis<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>1000<span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>testOnBorrow<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>true<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">bean</span>&gt;

&lt;<span class="pl-ent">bean</span> <span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>jedisConnectionFactory<span class="pl-pds">"</span></span> <span class="pl-e">class</span>=<span class="pl-s"><span class="pl-pds">"</span>org.springframework.data.redis.connection.jedis.JedisConnectionFactory<span class="pl-pds">"</span></span>&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>hostName<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>127.0.0.1<span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>password<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span><span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>port<span class="pl-pds">"</span></span> <span class="pl-e">value</span>=<span class="pl-s"><span class="pl-pds">"</span>6379<span class="pl-pds">"</span></span> /&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>poolConfig<span class="pl-pds">"</span></span> <span class="pl-e">ref</span>=<span class="pl-s"><span class="pl-pds">"</span>poolConfig<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">bean</span>&gt;

&lt;<span class="pl-ent">bean</span> <span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>redisTemplate<span class="pl-pds">"</span></span> <span class="pl-e">class</span>=<span class="pl-s"><span class="pl-pds">"</span>org.springframework.data.redis.core.StringRedisTemplate<span class="pl-pds">"</span></span>&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>connectionFactory<span class="pl-pds">"</span></span> <span class="pl-e">ref</span>=<span class="pl-s"><span class="pl-pds">"</span>jedisConnectionFactory<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">bean</span>&gt;

<span class="pl-c"><span class="pl-c">&lt;!--</span> RedisUtil注入RedisTemplate <span class="pl-c">--&gt;</span></span>
&lt;<span class="pl-ent">bean</span> <span class="pl-e">id</span>=<span class="pl-s"><span class="pl-pds">"</span>redisUtil<span class="pl-pds">"</span></span> <span class="pl-e">class</span>=<span class="pl-s"><span class="pl-pds">"</span>com.xxx.utils.RedisUtil<span class="pl-pds">"</span></span>&gt;
	&lt;<span class="pl-ent">property</span> <span class="pl-e">name</span>=<span class="pl-s"><span class="pl-pds">"</span>redisTemplate<span class="pl-pds">"</span></span> <span class="pl-e">ref</span>=<span class="pl-s"><span class="pl-pds">"</span>redisTemplate<span class="pl-pds">"</span></span> /&gt;
&lt;/<span class="pl-ent">bean</span>&gt;</pre></div>
<p>2.使用RedisUtil工具类方法如下：</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">@Autowired</span>
<span class="pl-k">private</span> <span class="pl-smi">RedisUtil</span> redisUtil;</pre></div>
<h3><a id="user-content-四springboot中如何使用" class="anchor" aria-hidden="true" href="#四springboot中如何使用"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>四、SpringBoot中如何使用</h3>
<p>修改你的RedisUtil代码：</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">@Component</span>
<span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">RedisUtil</span> {
    <span class="pl-k">@Autowired</span>
    <span class="pl-k">private</span> <span class="pl-smi">StringRedisTemplate</span> redisTemplate;

    <span class="pl-c1">......</span>
}</pre></div>
<p>使用<code>@Autowired</code>自动注入redisTemplate。</p>
<br>
<h2><a id="user-content-推荐" class="anchor" aria-hidden="true" href="#推荐"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M4 9h1v1H4c-1.5 0-3-1.69-3-3.5S2.55 3 4 3h4c1.45 0 3 1.69 3 3.5 0 1.41-.91 2.72-2 3.25V8.59c.58-.45 1-1.27 1-2.09C10 5.22 8.98 4 8 4H4c-.98 0-2 1.22-2 2.5S3 9 4 9zm9-3h-1v1h1c1 0 2 1.22 2 2.5S13.98 12 13 12H9c-.98 0-2-1.22-2-2.5 0-.83.42-1.64 1-2.09V6.25c-1.09.53-2 1.84-2 3.25C6 11.31 7.55 13 9 13h4c1.45 0 3-1.69 3-3.5S14.5 6 13 6z"></path></svg></a>推荐</h2>
<p><a href="http://easyweb.vip" rel="nofollow">EasyWeb管理系统模板</a> |
<a href="https://gitee.com/whvse/EasyWeb" rel="nofollow">基于OAuth2.0的前后端分离开发平台</a></p>
<br>
</article>
  </div>

    </div>

  

  <details class="details-reset details-overlay details-overlay-dark">
    <summary data-hotkey="l" aria-label="Jump to line"></summary>
    <details-dialog class="Box Box--overlay d-flex flex-column anim-fade-in fast linejump" aria-label="Jump to line">
      <!-- '"` --><!-- </textarea></xmp> --></option></form><form class="js-jump-to-line-form Box-body d-flex" action="" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden" value="&#x2713;" />
        <input class="form-control flex-auto mr-3 linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
        <button type="submit" class="btn" data-close-dialog>Go</button>
</form>    </details-dialog>
  </details>



  </div>
</div>

    </main>
  </div>
  

  </div>

        
<div class="footer container-lg width-full p-responsive" role="contentinfo">
  <div class="position-relative d-flex flex-row-reverse flex-lg-row flex-wrap flex-lg-nowrap flex-justify-center flex-lg-justify-between pt-6 pb-2 mt-6 f6 text-gray border-top border-gray-light ">
    <ul class="list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0">
      <li class="mr-3 mr-lg-0">&copy; 2019 <span title="0.66684s from unicorn-7f678d97c7-8sgw2">GitHub</span>, Inc.</li>
        <li class="mr-3 mr-lg-0"><a data-ga-click="Footer, go to terms, text:terms" href="https://github.com/site/terms">Terms</a></li>
        <li class="mr-3 mr-lg-0"><a data-ga-click="Footer, go to privacy, text:privacy" href="https://github.com/site/privacy">Privacy</a></li>
        <li class="mr-3 mr-lg-0"><a data-ga-click="Footer, go to security, text:security" href="https://github.com/security">Security</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://githubstatus.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
        <li><a data-ga-click="Footer, go to help, text:help" href="https://help.github.com">Help</a></li>
    </ul>

    <a aria-label="Homepage" title="GitHub" class="footer-octicon d-none d-lg-block mx-lg-4" href="https://github.com">
      <svg height="24" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="24" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"/></svg>
</a>
   <ul class="list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0">
        <li class="mr-3 mr-lg-0"><a data-ga-click="Footer, go to contact, text:contact" href="https://github.com/contact">Contact GitHub</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://github.com/pricing" data-ga-click="Footer, go to Pricing, text:Pricing">Pricing</a></li>
      <li class="mr-3 mr-lg-0"><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li class="mr-3 mr-lg-0"><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
        <li class="mr-3 mr-lg-0"><a href="https://github.blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a data-ga-click="Footer, go to about, text:about" href="https://github.com/about">About</a></li>

    </ul>
  </div>
  <div class="d-flex flex-justify-center pb-6">
    <span class="f6 text-gray-light"></span>
  </div>
</div>



  <div id="ajax-error-message" class="ajax-error-message flash flash-error">
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.893 1.5c-.183-.31-.52-.5-.887-.5s-.703.19-.886.5L.138 13.499a.98.98 0 000 1.001c.193.31.53.501.886.501h13.964c.367 0 .704-.19.877-.5a1.03 1.03 0 00.01-1.002L8.893 1.5zm.133 11.497H6.987v-2.003h2.039v2.003zm0-3.004H6.987V5.987h2.039v4.006z"/></svg>
    <button type="button" class="flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
      <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
    </button>
    You can’t perform that action at this time.
  </div>


    
    <script crossorigin="anonymous" integrity="sha512-4JsuiTlMAprr6vF8YB0G8g7Ss7s5+irdU7eFQpEMW60R1NDb61bo6shomBSAcepi26csEdoMpSTXRPyLTLwJpw==" type="application/javascript" src="https://github.githubassets.com/assets/frameworks-452b2867.js"></script>
    
    <script crossorigin="anonymous" async="async" integrity="sha512-q850LlHrJbHiWzYuzYR6/LJaJb8QZK4z3Ac5SPmI/wVFq24YIw2RopksyDaqSJAOMLGer0yPm+BOeBzFOWtI6Q==" type="application/javascript" src="https://github.githubassets.com/assets/github-bootstrap-45a6c992.js"></script>
    
    
    
  <div class="js-stale-session-flash flash flash-warn flash-banner" hidden
    >
    <svg class="octicon octicon-alert" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M8.893 1.5c-.183-.31-.52-.5-.887-.5s-.703.19-.886.5L.138 13.499a.98.98 0 000 1.001c.193.31.53.501.886.501h13.964c.367 0 .704-.19.877-.5a1.03 1.03 0 00.01-1.002L8.893 1.5zm.133 11.497H6.987v-2.003h2.039v2.003zm0-3.004H6.987V5.987h2.039v4.006z"/></svg>
    <span class="js-stale-session-flash-signed-in" hidden>You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
    <span class="js-stale-session-flash-signed-out" hidden>You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
  </div>
  <template id="site-details-dialog">
  <details class="details-reset details-overlay details-overlay-dark lh-default text-gray-dark hx_rsm" open>
    <summary role="button" aria-label="Close dialog"></summary>
    <details-dialog class="Box Box--overlay d-flex flex-column anim-fade-in fast hx_rsm-dialog hx_rsm-modal">
      <button class="Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0" type="button" aria-label="Close dialog" data-close-dialog>
        <svg class="octicon octicon-x" viewBox="0 0 12 16" version="1.1" width="12" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.48 8l3.75 3.75-1.48 1.48L6 9.48l-3.75 3.75-1.48-1.48L4.52 8 .77 4.25l1.48-1.48L6 6.52l3.75-3.75 1.48 1.48L7.48 8z"/></svg>
      </button>
      <div class="octocat-spinner my-6 js-details-dialog-spinner"></div>
    </details-dialog>
  </details>
</template>

  <div class="Popover js-hovercard-content position-absolute" style="display: none; outline: none;" tabindex="0">
  <div class="Popover-message Popover-message--bottom-left Popover-message--large Box box-shadow-large" style="width:360px;">
  </div>
</div>

  <div aria-live="polite" class="js-global-screen-reader-notice sr-only"></div>

  </body>
</html>

