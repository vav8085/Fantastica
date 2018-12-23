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

    }
}
