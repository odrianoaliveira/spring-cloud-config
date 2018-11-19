#!/usr/bin/env bash

curl -v \
	-H 'Content-Type: application/json' \
	-H 'X-Github-Event: push' \
	-d '{}' \
	http://root:s3cr3t@localhost:8888/monitor
