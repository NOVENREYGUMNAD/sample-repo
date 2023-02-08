package com.android.sample.repo

// Name of students and their grades(average)
fun main() {
    val studentGrades = mapOf(
        "rey" to 85,
        "andrew" to 89,
        "gee" to 80,
        "riz" to 90,
        "joe" to 87,
        "ley" to 82
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
