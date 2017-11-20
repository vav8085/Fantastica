package com.vav.Common.DisjointSets;

/**
 * Created by vaibhav on 7/15/17.
 */
public class QuickUnion {
    private int id[];

    public QuickUnion(int n){
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }
    public int getRoot(int parent){
        while(id[parent]!=parent){
            parent = id[parent];
        }
        return parent;
    }
    public boolean connected(int p, int q){
        return getRoot(p)==getRoot(q);
    }
    public void union(int p, int q){
        int i = getRoot(p);
        int j = getRoot(q);
        id[i]= j;
    }
}
