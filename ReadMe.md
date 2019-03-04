# CMPUT 402 Static Analysis Tools Demo

This sample code is used to demo different static verification tools such as FindBugs, PMD, Google ErrorProne, SpotBugs, CogniCrypt, and Coverity

## Getting Started

Some of the tools demonstrated here require a compiled jar file. To create the jar file for this sample project, run

`mvn clean package assembly:single`

## FindBugs Demo

* I downloaded the FindBugs jar file from this [link](http://prdownloads.sourceforge.net/findbugs/findbugs-3.0.1.zip?download). Note that there are alternative ways to run FindBugs. You can check them on their webpage. 

* Run FindBugs on the current project (run the following command from the main directory of this project):

`java -jar <path to FindBugs jar file>`

* The above command will open a GUI. You can follow the GUI instructions [here](http://findbugs.sourceforge.net/manual/gui.html) to see how to use set up a new project. Note that for the source directory, you need to select the `src/main/java` directory.

* Once you set up the project, you can view the different warnings in the GUI.

* An alternative way for running FindBugs is through `ant`. There is already a `build.xml` file that configures the build for you so you can run FindBugs through the command line. 
