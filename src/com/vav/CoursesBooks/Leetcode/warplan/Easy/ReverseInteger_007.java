package com.vav.CoursesBooks.Leetcode.warplan.Easy;

/**
 * Created by vaibhav on 2/3/18.
 */
public class ReverseInteger_007 {
    public static void main(String arg[]){
        System.out.println(reverseInteger(4321));
    }

    /**
     * This kind of problems are based on two properties in mathemetics.
     * 1.   Any number % 10 gives its last digit
     * 2.   Any number / 10 gives its all digits except last one.
     *      So if number is 1234:
     *      1234 % 10 = 4
     *      1234 / 10 = 123
     *
     *      If its 1200 then:
     *      1200 % 10 = 0
     *      1200 / 10 = 120
     *
     * We will just use these properties to reverse this number.
     *
     * @param x
     * @return
     */
    public static int reverseInteger(int x){
        int lastDigit= 0;
        int newNumber=0;
        int test = 0;
        while(x!=0){
            lastDigit = x % 10;
            test=newNumber;
            newNumber = newNumber*10 + lastDigit;
            if(test!=((newNumber-lastDigit)/10))
                return 0;

            x= x/10;
        }
        return newNumber;
    }
}
