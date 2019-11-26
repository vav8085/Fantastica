package com.vav.Design.FunctionalProgramming.Notes

import edu.princeton.cs.introcs.In

fun main(args: Array<String>) {
    lambdas()
}
fun lambdas(){
    doMaths(5,6, addition)
    doMaths(5,6, multiplication)
}
var addition:(Int, Int) -> Int =  {a: Int,b: Int -> a+b}
var multiplication:(Int, Int) -> Int =  {a: Int,b: Int -> a*b}

fun doMaths(a: Int, b: Int, operation: (Int, Int) -> Int ): Int{
    return operation.invoke(a,b)
}