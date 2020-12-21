package com.sanskar.mvvmbasics.data

data class Quote(val qouteText: String, val author: String) {
    override fun toString(): String {
        return "$qouteText - $author "
    }
}