#!/bin/bash

manifest_name=$1

java -jar /app/modpack-builder.jar \
    --version "$(date +%s)" \
    --input /app/modpack \
    --output /app/upload \
    --manifest-dest "/app/upload/${manifest_name}.json"

