#!/bin/sh

BIN=$(dirname $0)/bin
echo $BIN
$BIN/startup.sh $*
