@echo off
set fileName=%1
set className=%fileName:~0,-5%
echo %fileName%
javac %fileName% && java %className%