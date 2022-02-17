package com.example.hw1

sealed class Action {
    object Registration : Action()
    class Login(val user: User) : Action()
    object Logout : Action()
}
