package com.erik.learnkotlin.controllers

import com.erik.learnkotlin.models.Bank
import com.erik.learnkotlin.services.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("banks")
class BankController(
    private val bankService: BankService
    ) {

    @GetMapping
    fun getBanks(): Collection<Bank> = bankService.getBanks()

}