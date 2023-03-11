package com.android.sample.repo

//activity d = 5 monetary amount

fun main() {
    val monetaryAmounts = mutableListOf<Double>()
    var inputCount = 0
    var divisor = 0
    var total = 0.0


    while (inputCount < 5) {
        print("Enter monetary amount ${inputCount+1}: ")
        val amount = readLine()?.toDoubleOrNull() ?: continue
        monetaryAmounts.add(amount)
        total += amount
        inputCount++
    }


    while (divisor == 0) {
        print("Divide the total by how many? ")
        val divisorStr = readLine() ?: continue
        divisor = divisorStr.toIntOrNull() ?: continue
    }


    val average = total / divisor
    println("The average of the ${monetaryAmounts.size} monetary amounts is: $average")
}