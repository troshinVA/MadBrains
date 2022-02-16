package com.example.hw1

fun main() {
    // Part 1
    val book1 = Book(99.9, 6000)
    printPublicationInfo(book1)

    val book2 = Book(1000.12339, 8000)
    printPublicationInfo(book2)

    val magazine = Magazine(50.01, 500)
    printPublicationInfo(magazine)

    book1.equals(book2)

    val bookNotNull: Book? = Book(100.00, 500)
    val bookNull: Book? = null

    buy(bookNull)
    buy(bookNotNull)

    val sum = { a: Int, b: Int -> println(a + b) }
    sum(51, 3)

    //Part 2

}


fun buy(publication: Publication?) {
    println("The purchase is complete. The purchase amount was ${publication?.price}." )
}

