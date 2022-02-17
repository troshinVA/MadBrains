package com.example.hw1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
data class User(
    val id: Int = 1,
    val name: String = "John",
    var age: Int = 15,
    val type: Type = Type.DEMO,
) {
    val startTime: String by lazy {
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }
}

fun User.isAdult() {
    if (this.age < 18) {
        throw Exception("ERROR: User too young")
    }
    println("User is adult")
}
