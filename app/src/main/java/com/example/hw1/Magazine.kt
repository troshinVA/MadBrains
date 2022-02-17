package com.example.hw1

class Magazine(override var price: Double = 30.00, override var wordCount: Int = 300) :
    Publication {
    override fun getType(): String {
        return "Magazine"
    }

}