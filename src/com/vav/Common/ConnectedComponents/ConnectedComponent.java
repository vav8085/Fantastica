package com.vav.Common.ConnectedComponents;
import com.vav.Common.Graphs.GraphAdjList;
import com.vav.Common.Graphs.Vertex;

public class ConnectedComponent {
    private int ids[];
    private int count=0;

    public ConnectedComponent(GraphAdjList G, int max){
        Vertex[] vertexList = G.getVertexList();
        ids = new int[vertexList.length];
        for(int i=0;i<vertexList.length;i++){
            if(!vertexList[i].isWasVisited()){
                dfs(G,i);
                count++;
            }
        }
    }
    public void dfs(GraphAdjList G,int v){
        Vertex[] vertexList = G.getVertexList();
        vertexList[v].setWasVisited(true);
        ids[v] = count;
        for(int vertex: G.getAdjacancyList(v)){
            if(!vertexList[vertex].isWasVisited())
                dfs(G,vertex);
        }
    }
}
