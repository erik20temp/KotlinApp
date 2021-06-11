package com.erik.learnkotlin.models


import com.erik.learnkotlin.models.inherits.Person
import java.time.LocalDate
import java.time.Period
import javax.persistence.*

@Entity
class Student(
    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    override var id: Long?,
    @Column(length = 30)
    override var firstName: String?,
    @Column(length = 30)
    override var lastName: String?,
    @Column
    var dob: LocalDate
    ) : Person( id = id, firstName = firstName, lastName = lastName, person = "STUDENT") {

    @Column
    var age : Int = Period.between( this.dob, LocalDate.now() ).years


    fun printStudent(){
        println("Date of birth: $dob")
        println("Age: $age")
    }
}


