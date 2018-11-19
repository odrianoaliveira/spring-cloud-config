#!/usr/bin/env bash

# to install it, type: brew install httpie
http --json POST http://root:s3cr3t@localhost:8888/monitor X-Github-Event:"push" commits:='[{"modified": ["config-client-development.yml"] }]'
