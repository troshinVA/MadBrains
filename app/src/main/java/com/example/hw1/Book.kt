package com.example.hw1

class Book(override var price: Double = 50.00, override var wordCount: Int = 2000) : Publication {

    override fun getType(): String {
        return when {
            wordCount < 1000 -> {
                "Flash Fiction"
            }
            wordCount > 7500 -> {
                "Novel"
            }
            else -> {
                "Short Story"
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        println("Link equals: ${this === other}")
        println("Super equals: ${super.equals(other)}")

        return super.equals(other)
    }
}