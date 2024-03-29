package com.vav.Algorithms.Common.Graphs;

import java.util.*;

/**
 * This graph class uses adjacency list instead of matrix
 */
public class GraphAdjList {
    Vertex[] arr;
    ArrayList<LinkedList<Integer>> adjList;
     int maxVertices;
    int count;
    Stack<Integer> stack;
    Queue<Integer> queue;

    public GraphAdjList(int max){
        maxVertices = 10;
        count = 0;
        stack = new Stack();
        queue = new ArrayDeque();
        arr = new Vertex[max];
        adjList = new ArrayList<>(max);
        for(LinkedList linkedList: adjList){
            linkedList = new LinkedList();
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
        adjList.get(i).addLast(j);
        adjList.get(j).addLast(i);
    }
    public int getAdjascentUnvisitedVertex(int v){
        for(Integer ver: adjList.get(v)){
            if(!arr[ver].isWasVisited()){
                return ver;
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

    public void dfsRecursive(int v){
        arr[v].setWasVisited(true);
        System.out.println(v+ "-" +arr[v].getLabel());
        for(int i = 0;i<adjList.get(v).size();i++){
            if(!arr[i].isWasVisited())
            dfsRecursive(i);
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

    public Vertex[] getVertexList() {
        return arr;
    }

    public LinkedList<Integer> getAdjacancyList(int v) {
        return adjList.get(v);
    }
}
