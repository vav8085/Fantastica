package com.vav.Common.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class GraphRevision {
    Vertex[] arr;
    int[][] adj;
    final int maxVertices;
    int count;
    Stack<Integer> stack;
    Queue<Integer> queue;

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
    public int getAdjascentUnvisitedVertex(int v){
        for(int i=0;i<count;i++){
            if(adj[v][i]==1 && arr[i].isWasVisited()==false){
                return i;
            }
        }
        return -1;
    }

    public void dfs(){
        arr[0].setWasVisited(true);
        stack.push(0);
        while (!stack.isEmpty()){
            int current = stack.peek();
            int next = getAdjascentUnvisitedVertex(current);
            if(next!=-1){
                stack.push(next);
                arr[next].setWasVisited(true);
            }else{
                stack.pop();
            }
        }
    }
    public void bfs(){
        arr[0].setWasVisited(true);
        queue.add(0);
        while (!queue.isEmpty()){
            int current = queue.remove();
            int next;
            while ((next = getAdjascentUnvisitedVertex(current))!=-1){
                arr[next].setWasVisited(true);
                queue.add(next);
            }

        }
    }
}
