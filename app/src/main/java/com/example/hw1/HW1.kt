package com.example.hw1


import android.os.Build
import androidx.annotation.RequiresApi

val authCallback = object : AuthCallback {
    override fun authSuccess() {
        println("Auth success")
    }

    override fun authFailed() {
        println("Auth failed")
    }

}

@RequiresApi(Build.VERSION_CODES.O)
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

    val sum = { a: Int, b: Int -> println("Sum executes: ${a + b} \n\nPart 2 start") }
    sum(51, 3)

    //Part 2
    val user1 = User()
    println("Start time ${user1.startTime}")
    Thread.sleep(1000)
    println("Start time after delay ${user1.startTime} \n")

    val usersMutableList: MutableList<User> = mutableListOf(User())
    usersMutableList.apply {
        for (i in 2..5) {
            this.add(User(i, "Name_$i", (5..80).random(), Type.values().random()))
        }
    }
    println("All users: $usersMutableList")
    println("Full access users : ${usersMutableList.filter { it.type == Type.FULL }} \n")

    val nameList = usersMutableList.map { it.name }
    println("List of names: ${nameList}")
    println("First user: ${nameList.first()} \nLast user: ${nameList.last()} \n")

    for (user in usersMutableList) {
        doAction(Action.Registration)
        doAction(Action.Login(user))
        doAction(Action.Logout)
    }
}
