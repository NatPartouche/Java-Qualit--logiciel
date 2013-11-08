#!/bin/bash

#insertHead() {
 # printf '%s\n' H 1i "$1" . w | ed -s "$2"
#}


echo "START"

cp -r /Users/administrateur/Documents/tagandtry/tagtry/src/tagtry/Model/* src/tagtry/model
a=(src/tagtry/model/*.java)

#for i in ${a[@]}; do insertHead "package tagtry.model;" ${i}; done;

echo "COMPLETE"

