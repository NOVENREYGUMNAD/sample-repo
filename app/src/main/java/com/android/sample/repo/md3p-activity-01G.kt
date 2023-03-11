package com.android.sample.repo

fun main() {

    println("Please enter a string to test if it's a Palindrome or Not:")

    val input = readLine()!!.lowercase()

    var isPalindrome = true
    for (i in 0 until input.length / 2) {
        if (input[i] != input[input.length - i - 1].lowercaseChar()) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        println("You entered a Palindrome!")
    } else {
        println("Oh, no! This is not a palindrome!")
    }

}