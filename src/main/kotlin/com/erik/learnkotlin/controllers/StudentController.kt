package com.erik.learnkotlin.controllers

import com.erik.learnkotlin.models.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("students")
class StudentController {

    @GetMapping
    fun getStudent() : Student = Student(
        1,
        "John",
        "Doe",
        LocalDate.of(1965,10, 20))


}