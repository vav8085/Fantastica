package com.vav.Design.StructuralPatterns.FacadePattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class FacadeClient {
    public static void main(String arg[]){
        BankAccountFacade bankAccountFacade = new BankAccountFacade("12345", "123");
        bankAccountFacade.withdrawCash(100);
        bankAccountFacade.depositeAmount(50);
        bankAccountFacade.withdrawCash(960);

    }
}
