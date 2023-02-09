package com.android.sample.repo

// Name of students and their grades(average)
fun main(args: Array<String>) {
    val welcome: String = "MD3P STUDENTS RATING"
    println(welcome)

    val studentDirectory = mutableMapOf<String, Student>()
    val studentList = arrayOf("Andrew Bustos", "Faith Mariano", "Felix Navarro", "Gee Quero", "Jaramillo Hanz",
        "Jeffrey Laroya", "Jeje Elenzano", "Joe Mari Ubay", "John Chris Macaraig Bolanio", "Jun Zon", "KI NG KL Lopez",
        "Kram Krad", "Lander Pelagio", "Ley De", "Marie Fe Dela Peña", "Noven Rey Gumnad", "Paolo Luzares",
        "Raii Ichinose", "Riz Caser", "Seong Phl", "Vanchan Navidad", "Vic Ama", "Xandrei Xhou", "Yer Bravo Toilas")

    for (studentName in studentList) {
        val student = Student(studentName)
        studentDirectory[student.name] = student
    }

    while (true) {
        println("Please enter student name: ")
        val studentName = readLine() ?: break
        val student = studentDirectory[studentName]
        if (student == null) {
            println("Student not found.")
            continue
        }

        println("Enter student rating (pass/fail): ")
        val rating = readLine()
        if (rating == "pass") {
            student.pass()
        } else if (rating == "fail") {
            student.fail()
        } else {
            println("Invalid rating.")
            continue
        }
        println("Student $studentName rating updated to $rating.")
        println("Current student ratings:")
        for ((name, student) in studentDirectory) {
            println("$name rating: ${if (student.passed) "pass" else "fail"}")
        }
    }
}

class Student(val name: String) {
    var passed: Boolean = false

    fun pass() {
        passed = true
    }

    fun fail() {
        passed = false
    }
}
