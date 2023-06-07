@ECHO OFF  
START https://misionesonline.net/ 
TIMEOUT /T 3600 > NUL  
TASKKILL /IM brave.exe 
TASKKILL /F
EXIT  