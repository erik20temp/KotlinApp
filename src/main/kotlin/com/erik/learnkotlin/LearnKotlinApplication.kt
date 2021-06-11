package com.erik.learnkotlin

import com.erik.learnkotlin.models.Author
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class LearnKotlinApplication

fun main(args: Array<String>) {
    runApplication<LearnKotlinApplication>(*args)
    for (i in 1..2){
        println("Hello World")
    }
    println()
    for (i in 42 downTo 18 step 4){
        println(i)
    }
    println()
    val myArray = arrayOf(2,4,5,25,3655,75,547)
    myArray.forEach {
        println(it)
    }
    println()
    for ((i, value) in myArray.withIndex()){
        println("index = $i value = $value")
    }
    println()
    val x = 3
    when(x){
        0,1,2,3,4,5 -> println("x is $x also is between 1 and 5" )
        33 -> println("x = 33")
        in 6..50 -> println("x is $x also is between 6 and 50" )
        else -> println("unknown")
    }
    val y = when(x){
        in 10..20 -> "x is $x"
        else -> "x is not between 10 and 20"
    }
    println(y)
    when{
        x > 5 -> println("x is greater then 5")
        x == 5 -> println("x is equal 5")
        else -> println("x is less then 5")
    }
    println()



}
