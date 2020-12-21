package com.sanskar.mvvmbasics.utility

import com.sanskar.mvvmbasics.data.FakeDatabase
import com.sanskar.mvvmbasics.data.QuoteRepository
import com.sanskar.mvvmbasics.ui.quotes.QuotesViewModelFactory

object InjectorUtils  {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {

        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}