package com.erik.learnkotlin.models.inherits

open class Person (
    open var id: Long? = null,
    open var firstName: String? = null,
    open var lastName: String? = null,
    open var person: String? = null
    ){

    open fun print(){
        println(person)
        println("ID: $id")
        println("First Name: $firstName")
        println("Last Name: $lastName")
    }
}