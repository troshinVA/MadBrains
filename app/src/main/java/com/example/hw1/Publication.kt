package com.example.hw1

interface Publication {
    var price: Double
    var wordCount: Int

    fun getType(): String
}