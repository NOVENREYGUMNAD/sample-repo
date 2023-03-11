package com.android.sample.repo

//activity F = union of unique characters

fun main() {
    print("Enter the first string: ")
    val str1 = readLine()?.lowercase() ?: ""

    print("Enter the second string: ")
    val str2 = readLine()?.lowercase() ?: ""

    val uniqueChars = mutableSetOf<Char>()

    for (char in str1 + str2) {
        if (!uniqueChars.contains(char)) {
            uniqueChars.add(char)
        }
    }

    println("Union of unique characters in both strings: ")
    println(uniqueChars.joinToString(""))
}