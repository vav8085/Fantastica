package com.vav.Common.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class GraphRevision {
    Vertex[] arr;
    int[][] adj;
    final int maxVertices;
    int count;
    Stack stack;
    Queue queue;

    public GraphRevision(int max){
        maxVertices = 10;
        count = 0;
        stack = new Stack();
        queue = new ArrayDeque();
        arr = new Vertex[max];
        for(int i=0;i<adj.length;i++){
            for(int j=0;j<adj.length;j++){
                adj[i][j]=0;
            }
        }
    }
    public void addVertex(char label){
        arr[count++]=new Vertex(label);
    }

    /**
     * In actual case we will be given two vertices and will be asked to connect them
     * WWe have to find out the position of each vertex in the vertex array and then pass
     * the position to below method
     * @param i
     * @param j
     */
    public void addEdge(int i, int j){
        adj[i][j] = 1;
        adj[j][i] = 1;
    }

}
