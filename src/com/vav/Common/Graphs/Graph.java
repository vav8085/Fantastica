package com.vav.Common.Graphs;

import java.util.Stack;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Graph {
    private final int MAX_VERTICES = 20;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int nVerts;

    public Graph(){
        vertexList = new Vertex[MAX_VERTICES];
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        nVerts = 0;
        for(int i = 0; i < MAX_VERTICES; i++){
            for(int j = 0; j< MAX_VERTICES; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[nVerts++] = new Vertex(label);
    }
    public void addEdge(int start, int end){
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
    }
    public void displayVertex(int vertexPosition){
        System.out.println(vertexList[vertexPosition]);
    }

    public void getAdjascentUnvisitedVertex(int v){
        for(int j=0;j<nVerts;j++) {
            if (adjacencyMatrix[v][j]==1 && )
        }
    }
}
