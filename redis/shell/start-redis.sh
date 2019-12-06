sleep 2
cluster_hosts="redis-1:6379 redis-2:6379 redis-3:6379 redis-4:6379 redis-5:6379 redis-6:6379"
echo yes |docker run -i --rm --network redis-net --entrypoint redis-cli docker.sense.io/redis:5.0.3 --cluster create $cluster_hosts --cluster-replicas 1
#docker service ps -f name= base_redis -q |
#{
#  while read x; do
#    private_ip=$(docker inspect -f '{{range .NetworksAttachments}}{{range .Addresses}}{{.}}{{end}}{{end}}' $x)
#    IFS='/' read -r -a array <<< $private_ip
#    containerIp=${array[0]}
#
#    cluster_hosts="$cluster_hosts $containerIp:6379"
#  done
#  echo $cluster_hosts
#  echo yes |docker run -i --rm --network redis-net --entrypoint redis-cli docker.sense.io/redis:5.0.3 --cluster create $cluster_hosts --cluster-replicas 1
#}

