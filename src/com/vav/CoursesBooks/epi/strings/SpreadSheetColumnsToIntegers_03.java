package com.vav.CoursesBooks.epi.strings;

public class SpreadSheetColumnsToIntegers_03 {

    public static int spreadSheetColumnsToIntegers(String cols){
        int number = 0;
        for(int i=0;i<cols.length();i++){
            number = number * 26 + cols.charAt(0) -'A' + 1;
        }
        return number;
    }

    public static void main(String arg[]){
        System.out.println(spreadSheetColumnsToIntegers("AA")); //27
    }
}
