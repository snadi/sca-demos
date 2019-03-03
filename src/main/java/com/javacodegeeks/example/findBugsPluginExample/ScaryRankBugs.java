package com.javacodegeeks.example.findBugsPluginExample;

/**
 * This code is from the following tutorial https://examples.javacodegeeks.com/core-java/findbugs-eclipse-example/
 * which was used to demonstrate FindBugs in class
 */

/**
 * Scary Rank Bugs Sample
 */
public class ScaryRankBugs {

    /**
     * The check str value.
     */
    private String checkStrValue = null;

    /**
     * The Constructor.
     */
    public ScaryRankBugs() {
        this.checkStrValue = "SomeValue";
    }

    /**
     * Execute some conditions.
     */
    private void executeSomeConditions() {
        if ("SomeValue".equals(this.checkStrValue)) {
            // Condition 1
        } else if ("SomeValue".equals(this.checkStrValue)) {
            // Condition 2
        }
    }

    /**
     * Incorrect assignment in if condition.
     */
    private static void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value = true) {
            //do Something
        } else {
            //else Do Something
        }
    }
}
