package com.erik.learnkotlin.repositories

import com.erik.learnkotlin.models.Bank

interface BankRepository {

    fun getBanks(): Collection<Bank>
}