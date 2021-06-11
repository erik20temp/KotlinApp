package com.erik.learnkotlin.models

import com.erik.learnkotlin.models.inherits.Person
import javax.persistence.*

@Entity
class Author(
             @Column(name = "ID", nullable = false)
             @Id
             @GeneratedValue(strategy = GenerationType.AUTO)
             override var id: Long?,
             @Column(length = 30)
             override var firstName: String?,
             @Column(length = 30)
             override var lastName: String?
             ) : Person(id = id, firstName = firstName, lastName = lastName, person = "AUTHOR") {

}