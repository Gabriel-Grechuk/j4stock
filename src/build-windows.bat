mkdir Build
javac *.java
jar cmvf manifest.mf Build\App.jar *.class
del *.class
pause
