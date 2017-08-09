package com.vav.Common.Algorithms1_Sedgewick.UnionFind_01;

/**
 * Created by Vaibhav on 7/14/17.
 */
public class QuickFind {

    private int id[];

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }
    public boolean connected(int p, int q){ //this is find operation
        return id[p]==id[q];//?true:false;
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

     for(int i=0;i<id.length;i++){
         if(id[i]==pid){
             id[i]=qid;
         }
     }
    }
}
