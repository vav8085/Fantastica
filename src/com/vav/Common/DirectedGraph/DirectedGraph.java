package com.vav.Common.DirectedGraph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by vaibhav on 7/9/17.
 */
public class DirectedGraph {
    private Vertex[] vertexArray;
    private int nVerts;
    private int[][] adjMatrix;
    private Stack<Integer> dfsStack;
    private Queue<Integer> bfsQueue;

    public DirectedGraph(int maxSize){
        dfsStack = new Stack<>();
        bfsQueue = new ArrayDeque<>();
        vertexArray = new Vertex[maxSize];
        adjMatrix = new int[maxSize][maxSize];
        nVerts=0;
        for(int i =0;i<maxSize;i++){
            for(int j=0;j<maxSize;j++){
                adjMatrix[i][j]=0;
            }
        }
    }
    public void addVertex(char label){
        Vertex vertex = new Vertex(label);
        vertexArray[nVerts++]=vertex;
    }
    public void addEdge(int start,int end){ // this has changed for directed graphs
        adjMatrix[start][end] = 1;
    }
    public void displayVertex(int position){//Position starts from 0
        System.out.println(vertexArray[position].label);
    }
    public int getNextUnvisitedVertex(int currentVertexPosition){
        for(int i=0;i<nVerts;i++){
            if(adjMatrix[currentVertexPosition][i]==1 && vertexArray[i].isVisited()==false){
                return i;
            }
        }
        return -1;
    }
    public void dfs(){  //dfs wont change for directed graphs
        dfsStack.push(0); //pushing the 0th vertex in vertexArray to stack
        vertexArray[0].setVisited(true);//visiting the 0th vertex
        int nextUnvisitedVertex;
        while (!dfsStack.isEmpty()){
            nextUnvisitedVertex=getNextUnvisitedVertex(dfsStack.peek());//We do not remove the vertex as long as it has adjascent unvisited vertices.
            if(nextUnvisitedVertex!=-1){
                dfsStack.push(nextUnvisitedVertex);
                displayVertex(nextUnvisitedVertex);
                vertexArray[nextUnvisitedVertex].setVisited(true);
            }else{
                dfsStack.pop();
            }
        }

    }
    public void bfs(){
        bfsQueue.add(0);
        vertexArray[0].setVisited(true);
        int nextUnvisitedVertex;
        while (!bfsQueue.isEmpty()){
            nextUnvisitedVertex = getNextUnvisitedVertex(bfsQueue.remove());// In BFS we remove the vertex instantly because we dont need to backtrack
            while(nextUnvisitedVertex!=-1){
                bfsQueue.add(nextUnvisitedVertex);
                displayVertex(nextUnvisitedVertex);
                vertexArray[nextUnvisitedVertex].setVisited(true);
            }
        }
    }

}

class Vertex{
    char label;
    boolean isVisited;

    public Vertex(char label){
        this.label = label;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
