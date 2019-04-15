package com.vav.Revision.Revision1.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class rGraph {
    private final int TOTAL_VERTICES;
    private rVertex[] vertexArray;
    private int[][] adjacencyMatrix;
    private int nVertices;

    public rGraph(int totalVertices) {
        TOTAL_VERTICES = totalVertices;
        nVertices=0;
        vertexArray = new rVertex[totalVertices];
        adjacencyMatrix = new int[totalVertices][totalVertices];
        for(int i=0;i<totalVertices;i++){
            for(int j=0;j<totalVertices;j++){
                adjacencyMatrix[i][j]=0;
                adjacencyMatrix[j][i]=0;
            }
        }
    }

    public void insertVertex(int i, String label){
        rVertex vertex = new rVertex();
        vertex.setLabel(label);
        vertexArray[nVertices++] = vertex;
    }

    public int getAdjacentUnvisitedVertex(int i){
        for(int k=0;k<nVertices;k++){
            if(adjacencyMatrix[k][i]==1 && !vertexArray[k].isVisited()){
                return k;
            }
        }
        return -1;
    }

    public void dfs(){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Integer adjacentVertex;
        while (!stack.isEmpty()){
            adjacentVertex = getAdjacentUnvisitedVertex(stack.peek());
            System.out.println(vertexArray[adjacentVertex].getLabel());
            if(adjacentVertex!=-1){
                stack.push(adjacentVertex);
                vertexArray[adjacentVertex].setVisited(true);
            }else{
                stack.pop();
            }
        }
    }
    public void bfs(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()){
            Integer current = queue.remove();
            System.out.println(vertexArray[current].getLabel());
            while (getAdjacentUnvisitedVertex(current)!=-1){
                vertexArray[getAdjacentUnvisitedVertex(current)].setVisited(true);
                queue.add(getAdjacentUnvisitedVertex(current));
            }
        }
    }

}
