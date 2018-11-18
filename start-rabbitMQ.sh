#!/usr/bin/env bash

docker pull rabbitmq:3-management
docker run -d --hostname my-rabbit --name local-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management