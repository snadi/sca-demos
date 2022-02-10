# CMPUT 402/501 Static Analysis Tools Demo

This sample code is used to demo different static verification tools such as FindBugs, PMD, Google ErrorProne, SpotBugs, and CogniCrypt. 

## Getting Started

Some of the tools demonstrated here require a compiled jar file. To create the jar file for this sample project, run

`mvn clean package assembly:single`

## FindBugs Demo

* I downloaded the FindBugs 3.0.1 files from this [link](http://prdownloads.sourceforge.net/findbugs/findbugs-3.0.1.zip?download). Note that there are alternative ways to run FindBugs (e.g., running it as an Eclipse plugin or an [IntelliJ plugin](https://plugins.jetbrains.com/plugin/3847-findbugs-idea)). You can check them on their [webpage](http://findbugs.sourceforge.net/) or search for additional ways to integrate FindBugs in your workflow. 

* Run FindBugs on the current project (run the following command from any directory but point to the right FindBugs jar file in the `lib` folder of the zip file you downloaded for FindBugs):

`java -jar <path to FindBugs jar file>`

E.g., for me, I just saved to downloads folder and ran as:
`java -jar ~/Downloads/findbugs-3.0.1/lib/findbugs.jar`

* The above command will open a GUI. You can follow the GUI instructions [here](http://findbugs.sourceforge.net/manual/gui.html) to see how to set up a new project. Note that for the source directory, you need to select the `src/main/java` directory of this current project.

* Once you set up the project, you can view the different warnings in the GUI.

* An alternative way for running FindBugs is through `ant`. There is already a `build.xml` file that configures the build for you so you can run FindBugs through the command line. Please note that you may need to update the path to the FindBugs directory to wherever you unzipped the above archive to.

`ant findbugs`

Running the above command will create an xml output file called `demo-findbugs.xml`

## PMD Demo

* The `pom.xml` file in this repo already has the pmd plugin as part of the reporting phase. To produce the pmd report, run:

`mvn pmd:pmd`

* In the target folder, you will find a `pmd.xml` file that contains the results of running PMD. You can also visualize those results by viewing the `target/site/pmd.html` file

## Google ErrorProne Demo

* To run ErrorProne, go to the `pom.xml` file and uncomment all parts marked by `for running google error prone`. 

* Run `mvn clean compile` to force a compilation. You will notice that the build now fails. Google ErrorProne is integrated into the build process and causes it to fail upon detecting any error (based on its ruleset). See [website](https://github.com/google/error-prone) for how to run it using different build systems.

## SpotBugs

* The `pom.xml` file already has the SpotBugs dependency added

* Run `mvn spotbugs:check`. It will show you the errors spotted and that you can visually look at the errors by running `mvn spotbugs:gui`

## CogniCrypt

* Download the precompiled version of CongniCrypt from their [repo](https://github.com/CROSSINGTUD/CryptoAnalysis), as well as the set of Crysl rules they have there. I used version [2.7.1](https://github.com/CROSSINGTUD/CryptoAnalysis/releases/tag/2.7.1). I created a folder `CogniCrypt` and inside it placed the pre-compiled CogniCrypt jar file and unzipped the `crypto-api-rules.zip` file into a folder called rules with all the `.crsyl` rules inside it.

* Run `java -jar ../CogniCrypt/CryptoAnalysis-2.7.1-SNAPSHOT-jar-with-dependencies.jar --rulesDir=../CogniCrypt/rules/ --applicationCp=target/sca-demo-1.0-SNAPSHOT.jar` from inside this project's main directory


