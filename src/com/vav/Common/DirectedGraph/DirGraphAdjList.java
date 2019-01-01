package com.vav.Common.DirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ToDo Directed graph using adjacency list
 */
public class DirGraphAdjList {
    private Vertex[] vertexArray;
    private ArrayList<LinkedList<Integer>> adjacencyList;
    private final int MAX;
    private int count;

    public DirGraphAdjList(int max){
        this.MAX = max;
        count=0;
        vertexArray = new Vertex[count];
        adjacencyList = new ArrayList<>(max);
        for(LinkedList linkedList: adjacencyList){
            linkedList = new LinkedList();
        }
    }
    public void addVertex(Vertex v){
        vertexArray[count++] = v;
    }
    public void addEdge(int v, int w){
        adjacencyList.get(v).addLast(w); //Only adding to one list
    }
    public void getAdjacentVertices(int v){

    }
    public void dfs(){
        
    }
}
