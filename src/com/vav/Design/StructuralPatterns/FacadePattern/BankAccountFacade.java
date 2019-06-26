package com.vav.Design.StructuralPatterns.FacadePattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class BankAccountFacade {
    WelcomeToBank welcomeToBank;
    VerifyPinAndPassword verifyPinAndPassword;
    VerifyTransactions verifyTransactions;
    String accountNumber;
    String pin;
    public BankAccountFacade(String accountNumber, String pin) {
        this.accountNumber=accountNumber;
        this.pin = pin;
         welcomeToBank = new WelcomeToBank();
         verifyPinAndPassword = new VerifyPinAndPassword();
         verifyTransactions = new VerifyTransactions();


    }
    public void withdrawCash(int cashAmount){
        if(verifyPinAndPassword.verifyAccountAndPin(accountNumber,pin))
        verifyTransactions.withdrawAmount(cashAmount);
    }
    public void depositeAmount(int depositeAmount) {
        if(verifyPinAndPassword.verifyAccountAndPin(accountNumber,pin))
            verifyTransactions.addAmount(depositeAmount);
    }
}
