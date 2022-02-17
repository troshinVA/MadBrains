package com.example.hw1

import java.text.NumberFormat
import java.util.*

// Part 1
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

fun buy(publication: Publication?) {
    println("The purchase is complete. The purchase amount was ${publication?.price}.")
}


// Part 2
inline fun auth(user: User, crossinline updateCache: () -> Unit) {
    try {
        user.isAdult()
        updateCache()
        authCallback.authSuccess()
    } catch (e: Exception) {
        println(e.message)
        authCallback.authFailed()
    }
}

fun updateCache() {
    println("Cache is updated")
}

fun doAction(action: Action) {
    when (action) {
        is Action.Registration -> {
            println("Registration started")
        }
        is Action.Login -> {
            println("Login started")
            auth(action.user, ::updateCache)
        }
        is Action.Logout -> {
            println("Logout started \n")
        }
    }
}