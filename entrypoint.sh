#!/bin/bash

manifest_name=$1
version=$2

java -jar /app/modpack-builder.jar \
    --version "${version}" \
    --input /app/modpack \
    --output /app/upload \
    --manifest-dest "/app/upload/${manifest_name}.json"

