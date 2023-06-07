@echo off
echo.
title TEMPORIZADOR WEP
echo.
echo TEMPORIZADOR WEP
echo __________________
echo.
set /p wep=Escriva la pagina wep a ingresar:						
set /p h=En cuantas horas desea ingresar:						
set /p m=Con cuantos minutos:								
set /p mensaje=Algun mensaje al ingresar a la pagina:					
pause
cls
set /a t=%h%*3600+%m%*60
set /a tiempo=%t%*1000

ping 1.1.1.1 -n 1 -w %tiempo% >nul
start %wep%
msg * %mensaje%
exit