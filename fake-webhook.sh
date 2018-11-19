#!/usr/bin/env bash

curl -v \
	-H 'Content-Type: application/json' \
	-d '{}' \
	http://root:s3cr3t@localhost:8888/monitor
