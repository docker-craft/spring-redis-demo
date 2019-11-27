FROM docker.sense.io/centos:7.6.1810

LABEL maintainer="Ming.Chen<chenming@sensetime.com>"

USER root


RUN mkdir -p /tmp/download && \
 curl -L https://download.docker.com/linux/static/stable/x86_64/docker-18.06.3-ce.tgz | tar -xz -C /tmp/download && \
 rm -rf /tmp/download/docker/dockerd && \
 mv /tmp/download/docker/docker* /usr/local/bin/ && \
 rm -rf /tmp/download && \
 groupadd -g 1000 docker && \
 usermod -aG  docker root