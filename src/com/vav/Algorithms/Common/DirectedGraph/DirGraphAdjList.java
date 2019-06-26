package com.vav.Algorithms.Common.DirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ToDo Directed graph using adjacency list
 */
public class DirGraphAdjList {
    private Vertex[] vertexArray;
    private ArrayList<LinkedList<Integer>> adjacencyList;
    private final int MAX;
    private int count;
    private Stack<Integer> topoStack;

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
    public LinkedList<Integer> getAdjacentVertices(int v){
       return adjacencyList.get(v);
    }
    public void dfs(int v){
        vertexArray[v].setVisited(true);
        for(Integer adjacentVertex: getAdjacentVertices(v)){
            if(!vertexArray[adjacentVertex.intValue()].isVisited()){
                dfs(adjacentVertex);
            }
        }
    }

    /**
     * A helper class for topological sorting this class calls the topologicalSorting method
     * @param v
     */
    public void topologicalSortHelper(int v){
        topoStack = new Stack<>();

        for(int i=0;i<vertexArray.length;i++){
            if(!vertexArray[i].isVisited())
            topologicalSorting(i);
        }
    }
    public void topologicalSorting(int v){
        vertexArray[v].setVisited(true);
        for(Integer adjacentVertex : getAdjacentVertices(v)){
            if(!vertexArray[adjacentVertex].isVisited()){
                topologicalSorting(adjacentVertex);
            }
        }
        topoStack.push(v);
    }

}
