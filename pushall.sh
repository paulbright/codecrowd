#!/bin/bash 

if [ "$#" -eq 0 ] || [ -z "$1" ]; 
      then
          echo "usage: $./pushall <comment>" 
      else
          #echo \"$1\"
          git add --all
          git commit -m "$1"
          git push origin master
fi

