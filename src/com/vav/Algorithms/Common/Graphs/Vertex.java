package com.vav.Algorithms.Common.Graphs;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Vertex {
    //vertex can have other data as well along with an entire object
    private char label;
    private boolean wasVisited;

    public Vertex(char label){
        this.label = label;
        wasVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
