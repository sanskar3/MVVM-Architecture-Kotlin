package com.sanskar.mvvmbasics.ui.quotes

import androidx.lifecycle.ViewModel
import com.sanskar.mvvmbasics.data.Quote
import com.sanskar.mvvmbasics.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository):ViewModel(){


    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote ) = quoteRepository.addQuote(quote)
}