package com.android.sample.repo

// Name of students and their grades(average)
fun main() {
    val studentGrades = mapOf(
        "John" to 85,
        "Jane" to 89,
        "Jim" to 80,
        "Jill" to 90,
        "Jack" to 87,
        "Joe" to 82
    )

    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    print("Enter a student name: ")
    val name = readLine()!!

    val grade = studentGrades[name]
    if (grade != null) {
        println("$name has a grade of $grade")

        if (grade >= 80) {
            println("$name passed the class.")
        } else {
            println("$name did not pass the class.")
        }

        print("Enter a day of the week: ")
        val day = readLine()!!
        if (day in daysOfWeek) {
            println("Today is $day.")
        } else {
            println("Invalid day entered.")
        }
    } else {
        println("$name is not in the list of students")
    }
}
