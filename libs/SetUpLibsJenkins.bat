@echo off
powershell Set-ExecutionPolicy Unrestricted -Scope CurrentUser
powershell %WORKSPACE%\libs\SetUpLibs.ps1
echo Download of libraries completed.