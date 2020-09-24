#!/bin/bash

for f in $(find src -type f)
do
  printf '\033[7m%s\033[m\n' "$f"
  java "$f"
done
