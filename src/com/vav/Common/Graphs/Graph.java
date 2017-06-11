package com.vav.Common.Graphs;

import java.util.Stack;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Graph {
    private final int MAX_VERTICES = 20;
    private Vertex[] vertexList;
    private int adjMatrix[][];
    private int nVerts;
    private Stack<Integer> stack;

    public Graph(){
        stack = new Stack<>();
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

    public int getAdjUnvisitedVertex(int v){
        for(int j=0;j<nVerts;j++){
            if(adjMatrix[v][j]==1 && vertexList[j].isWasVisited()==false){
                return j;
            }
        }
        return -1;
    }
    public void dfs(){
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        stack.push(0);

        while (!stack.isEmpty()){
            int v = getAdjUnvisitedVertex(stack.peek());
            if(v==-1){

            }else{

            }
        }

    }
}
