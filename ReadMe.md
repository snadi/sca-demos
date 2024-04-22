# CS-UH-3260 Static Analysis Tools Demo

This sample code is used to demo different static verification tools such as SpotBugs, PMD, and Google ErrorProne. This repo has been forked and udpated from the same material originally prepared by Sarah Nadi for CMPUT 402/501 at the University of Alberta.

## Getting Started

Some of the tools demonstrated here require a compiled jar file. To create the jar file for this sample project, run

```
mvn clean package assembly:single
```

## SpotBugs Demo

* The `pom.xml` file already has the SpotBugs dependency added

* Run `mvn spotbugs:check`. It will show you the errors spotted and that you can visually look at the errors by running `mvn spotbugs:gui`

## PMD Demo

* The `pom.xml` file in this repo already has the pmd plugin as part of the reporting phase. To produce the pmd report, run:

`mvn pmd:pmd`

* In the target folder, you will find a `pmd.xml` file that contains the results of running PMD. You can also visualize those results by viewing the `target/site/pmd.html` file

## Google ErrorProne Demo

* To run ErrorProne, go to the `pom.xml` file and uncomment all parts marked by `for running google error prone`. 

* Run `mvn clean compile` to force a compilation. You will notice that the build now fails. Google ErrorProne is integrated into the build process and causes it to fail upon detecting any error (based on its ruleset). See [website](https://github.com/google/error-prone) for how to run it using different build systems.



## CogniCrypt

* Download the precompiled version of CongniCrypt from their [repo](https://github.com/CROSSINGTUD/CryptoAnalysis), as well as the set of Crysl rules they have there. I used version [2.7.1](https://github.com/CROSSINGTUD/CryptoAnalysis/releases/tag/2.7.1). I created a folder `CogniCrypt` and inside it placed the pre-compiled CogniCrypt jar file and unzipped the `crypto-api-rules.zip` file into a folder called rules with all the `.crsyl` rules inside it.

* Run `java -jar ../CogniCrypt/CryptoAnalysis-2.7.1-SNAPSHOT-jar-with-dependencies.jar --rulesDir=../CogniCrypt/rules/ --applicationCp=target/sca-demo-1.0-SNAPSHOT.jar` from inside this project's main directory


