@echo off
set fileName=%1
set className=%fileName:~0,-4%
javac %fileName% && java %className%