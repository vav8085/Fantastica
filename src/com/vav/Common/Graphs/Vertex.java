package com.vav.Common.Graphs;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Vertex {
    private char label;
    private boolean wasVisited;

    public Vertex(char label){
        this.label = label;
        wasVisited = false;
    }
}
