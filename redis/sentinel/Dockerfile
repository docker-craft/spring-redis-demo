FROM redis:5.0.5-alpine

LABEL MAINTAINER="Chen Ming<ming.chen@sensetime.com>"

EXPOSE 26379
COPY sentinel.conf /etc/redis/sentinel.conf
ENTRYPOINT redis-server /etc/redis/sentinel.conf --sentinel