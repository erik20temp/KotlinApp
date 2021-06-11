package com.erik.learnkotlin.controllers

import com.erik.learnkotlin.models.Author
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("authors")
class AuthorController {

    @GetMapping
    fun getAuthor() : Author = Author(
        1,
        "Tom",
        "Clancy")
}