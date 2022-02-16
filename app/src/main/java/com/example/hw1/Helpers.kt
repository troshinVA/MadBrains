package com.example.hw1

import java.text.NumberFormat
import java.util.*

fun getFormattedPrice(price: Double): String {
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.maximumFractionDigits = 2
    format.currency = Currency.getInstance("EUR")

    return format.format(price)
}

fun printPublicationInfo(publication: Publication) {
    println("${publication::class.simpleName}'s type: ${publication.getType()}")
    println("${publication::class.simpleName}'s price: ${getFormattedPrice(publication.price)}")
    println("${publication::class.simpleName}'s word quantity: ${publication.wordCount} \n")
}