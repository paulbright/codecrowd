
#!/bin/bash 
rm -rf ./build
rm -rf ./package
mkdir -p build/org/co/paul
mkdir package
javac ./org/co/paul/Hello.java
mv ./org/co/paul/Hello.class ./build/org/co/paul/
cd build
jar vcf ../package/myhello.jar .
cd ..