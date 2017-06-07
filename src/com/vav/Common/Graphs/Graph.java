package com.vav.Common.Graphs;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Graph {
    private final int MAX_VERTICES = 20;
    private Vertex[] vertexList;
    private int adjMatrix[][];
    private int nVerts;

    public Graph(){
        vertexList = new Vertex[MAX_VERTICES];
        adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        nVerts = 0;
        for(int i = 0; i < MAX_VERTICES; i++){
            for(int j = 0; j< MAX_VERTICES; j++){
                adjMatrix[i][j] = 0;
            }
        }
    }
    public void addVertex(char label){
        vertexList[nVerts++] = new Vertex(label);
    }
    public void addEdge(int start, int end){
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }
    public void displayVertex(int vertexPosition){
        System.out.println(vertexList[vertexPosition]);
    }
}
