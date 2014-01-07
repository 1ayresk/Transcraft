@echo off
powershell Set-ExecutionPolicy Unrestricted -Scope CurrentUser
powershell %WORKSPACE%\libs\SetUpLibsJenkins.ps1
echo Download of libraries completed.