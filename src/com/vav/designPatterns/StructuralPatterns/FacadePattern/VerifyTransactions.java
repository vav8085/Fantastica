package com.vav.designPatterns.StructuralPatterns.FacadePattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class VerifyTransactions {
    private int cashInAccount = 1000;
    public void addAmount(int amount){
        cashInAccount+=amount;
        System.out.println("Available funds:"+cashInAccount);
    }
    public void withdrawAmount(int amount){
        if(amount>cashInAccount){
            System.out.print("Insufficient funds!");
        }else{
            cashInAccount-=amount;
            System.out.println("Available funds:"+cashInAccount);
        }
    }
}
