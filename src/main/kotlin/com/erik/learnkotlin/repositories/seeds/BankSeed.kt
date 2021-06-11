package com.erik.learnkotlin.repositories.seeds

import com.erik.learnkotlin.models.Bank
import com.erik.learnkotlin.repositories.BankRepository
import org.springframework.stereotype.Repository

@Repository
class BankSeed : BankRepository {

    val banks = listOf(
        Bank("abc1234", 0.0, 1),
        Bank("def5678", 1.0, 2)
    )
    override fun getBanks(): Collection<Bank> = banks

}