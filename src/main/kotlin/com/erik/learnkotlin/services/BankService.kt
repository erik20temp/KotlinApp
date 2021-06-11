package com.erik.learnkotlin.services

import com.erik.learnkotlin.models.Bank
import com.erik.learnkotlin.repositories.BankRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BankService(
    private val bankRepository: BankRepository
    ) {

    @Autowired
    fun getBanks(): Collection<Bank> = bankRepository.getBanks()

}