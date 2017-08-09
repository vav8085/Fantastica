package com.vav.Common.Algorithms1_Sedgewick.UnionFind_01;

/**
 * Created by Vaibhav on 8/4/17.
 */
public class WeightedQuickUnion {
    private int id[];
    private int sz[];
    public WeightedQuickUnion(int n){
        for(int i=0;i<n;i++){
            id[i] = i;
            sz[i] = 1;
        }
    }
    public int getRoot(int item){
        while(id[item]!=item){
            item = id[item];
        }
        return item;
    }
    public boolean connected(int p , int q){
        if(getRoot(p)==getRoot(q)){
            return true;
        }else return false;
    }
    public void union(int p, int q){
        int pr = getRoot(p);
        int qr = getRoot(q);
        if(sz[p]<sz[q]){
            id[q] = pr;
            sz[p] = sz[p] + sz[q];
        }else{
            id[p] = qr;
            sz[q] = sz[p] + sz[q];
        }
    }
}