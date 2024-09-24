#!/bin/bash

cd ./target/classes

for n in {1..9}; do
	java --add-opens java.base/java.util=ALL-UNNAMED ua.nure.task1.Test$n >out$n.txt 
done
