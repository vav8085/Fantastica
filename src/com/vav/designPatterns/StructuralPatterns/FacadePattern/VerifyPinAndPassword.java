package com.vav.designPatterns.StructuralPatterns.FacadePattern;

/**
 * Created by z179905 on 1/17/17.
 */
public class VerifyPinAndPassword {
    private String accountNumber = "12345";
    private String pin = "123";

    public String getAccountNumber(){
        return accountNumber;
    }

    public Boolean verifyAccountAndPin(String accountNumber, String pin){
        if(accountNumber.equals(this.accountNumber)&&pin.equals(this.pin)){
            System.out.println("Login Successful!");
            return true;
        }else{
            System.out.println("Login failed!");
            return false;

        }
    }
}
