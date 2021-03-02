package com.javacodegeeks.example.findBugsPluginExample;

/**
 * This code is from the following tutorial https://examples.javacodegeeks.com/core-java/findbugs-eclipse-example/
 * which was used to demonstrate FindBugs in class
 */

/**
 * Of Concern Rank Bugs Sample
 */
public class OfConcernRankBugs {

    /** The place holder. */
    private String placeHolder = null;

    /**
     * The Constructor.
     */
    public OfConcernRankBugs() {
        this.placeHolder = "Test String";
    }

    /**
     * Gets the place holder.
     *
     * @return the place holder
     */
    private String getPlaceHolder(){
        return this.placeHolder;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        OfConcernRankBugs object = (OfConcernRankBugs) obj;
        return this.getPlaceHolder().equals(object.getPlaceHolder());
    }

    private void test(){
        Number[] arr = new Integer[10];
        arr[0] = 1.0;
    }
}

