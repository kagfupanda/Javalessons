#!/bin/sh

if [ $# -lt 1 ]; then
    echo "Usage: $0 <project_name>"
    exit 1
fi

# create the top level project directory

mkdir $1

#check status of previous command

if [ $? -ne 0 ]; then
    # print an error message and exit
    echo "mkdir $1 failed. Exiting."
    exit 1
fi

echo "Created $1 directory succesfully."

# Create the bin subdirectory under project
mkdir $1/bin

#Check status of previous command

if [ $? -ne 0 ]; then
    # Print an error message and exit.
    echo "mkdir $1/bin failed. Exiting."
    exit 1
fi

echo "Created $1/bin directory succesfully." 

# Create the src subdirectory under the project
mkdir $1/src

#Check the status of the previous command

if [ $? -ne 0 ]; then
    # Print an error message and exit.
    echo "mkdir $1/src failed. Exiting."
    exit 1
fi

echo "Created $1/src directory succesfully."

exit 0
