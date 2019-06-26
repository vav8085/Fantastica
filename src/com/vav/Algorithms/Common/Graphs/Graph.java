package com.vav.Algorithms.Common.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Vaibhav on 6/5/17.
 */
public class Graph {
    private final int MAX_VERTICES = 20;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int nVerts;
    //Stack for DFS
    private Stack<Integer> stack;
    private Queue<Integer> queue;

    public Graph(){
        stack = new Stack<>();
        queue = new ArrayDeque<>();
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

    public int getAdjascentUnvisitedVertex(int v){
        for(int j=0;j<nVerts;j++) {
            if (adjacencyMatrix[v][j]==1 && vertexList[j].isWasVisited()==false){
                return j;
            }
        }
        return -1;
    }

    /**********Depth first search**************/
    public void dfs(){
        vertexList[0].setWasVisited(true);
        stack.push(0);
        displayVertex(0);
        int nextUnvisitedVertexPosition;
        while(!stack.isEmpty()){
            nextUnvisitedVertexPosition = getAdjascentUnvisitedVertex(stack.peek());
            if(nextUnvisitedVertexPosition!=-1){
                vertexList[nextUnvisitedVertexPosition].setWasVisited(true);
                displayVertex(nextUnvisitedVertexPosition);
                stack.push(nextUnvisitedVertexPosition);
            }else{
                stack.pop();
            }
        }
        for(int i=0;i<vertexList.length;i++){
            vertexList[i].setWasVisited(false);
        }
    }

    /**********Breadth first search**************/
    public void bfs(){
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        queue.add(0);
        int currentVertex;
        while(!queue.isEmpty()){
            int adjascentVertex;
            currentVertex = queue.remove();
            while((adjascentVertex=getAdjascentUnvisitedVertex(currentVertex))!=-1){
                vertexList[adjascentVertex].setWasVisited(true);
                displayVertex(adjascentVertex);
                queue.add(adjascentVertex);
            }
        }
        for(int i=0;i<vertexList.length;i++){
            vertexList[i].setWasVisited(false);
        }
    }

    /**********Minimum spanning tree**************/
    public void mst(){
        vertexList[0].setWasVisited(true);
        stack.push(0);
        int currentVertex;
        while (!stack.isEmpty()){
            currentVertex = stack.peek();
            int nextVertex = getAdjascentUnvisitedVertex(currentVertex);
            if(nextVertex !=-1){
                displayVertex(currentVertex);
                displayVertex(nextVertex);
                stack.push(nextVertex);
                vertexList[nextVertex].setWasVisited(true);
            }else{
                stack.pop();
            }
        }
        for(int i=0;i<vertexList.length;i++){
            vertexList[i].setWasVisited(false);
        }
    }
    public ArrayList<Integer> getAdjascentVertex(int v){
        ArrayList<Integer> adjascentVertices = new ArrayList<>();
        for(int i=0;i<nVerts;i++){
            if(adjacencyMatrix[v][i]==1){
                adjascentVertices.add(i);
            }
        }
        return adjascentVertices;
    }

    public void printAllEdges(int v){
        for(int x: getAdjascentVertex(v)){
            System.out.println(v+"->"+x);
        }

    }
}
