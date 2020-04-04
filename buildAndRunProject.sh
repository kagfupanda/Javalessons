#!/bin/sh

if [ $# -lt 1 ]; then
    echo "Usage: $0 <project_name>"
    exit 1
fi 

# Compile source code using -d for class file destination

javac -d $1/bin $1/src/$1.java

# Check to see if code compiled

if [ $? -ne 0 ]; then
    echo "javac $1/src/$1.java failed. Exiting"
    exit 1
fi

# Run Code
echo "Run $1"

pushd $1/bin
java $1
popd

exit 0
