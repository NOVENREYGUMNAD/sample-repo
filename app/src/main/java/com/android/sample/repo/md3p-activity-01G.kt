package com.android.sample.repo

fun main() {
    println("Enter a string:")
    val input = readLine()!!

    var isPalindrome = true
    for (i in 0 until input.length / 2) {
        if (input[i] != input[input.length - i - 1]) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        println("Palindrome")
    } else {
        println("Not a palindrome")
    }
}
