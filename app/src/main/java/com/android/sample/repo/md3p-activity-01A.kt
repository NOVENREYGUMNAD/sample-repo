package com.android.sample.repo

// Name of students and their ratings

fun main(args: Array<String>) {
    val welcome: String = "MD3P STUDENT RATING"
    val nameOfStudents: String = "List Of Students"
    println(welcome)
    println(nameOfStudents)

/*ginamit ko po  sa line 15-23 ang listOf function to create a list of strings
 with the names and then loops through each name using
 forEach and prints it to the console.
 */
    val names = listOf("Andrew Bustos", "Faith Mariano", "Felix Navarro", "Gee Quero", "Jaramillo Hanz",
        "Jeffrey Laroya", "Jeje Elenzano", "Joe Mari Ubay", "John Chris Macaraig Bolanio",
        "Jun Zon", "KI NG KL Lopez", "Kram Krad", "Lander Pelagio", "Ley De",
        "Marie Fe Dela Peña", "Paolo Luzares", "Raii Ichinose", "Riz Caser", "Seong Phl",
        "Vanchan Navidad", "Vic Ama", "Xandrei Xhou", "Yer Bravo Toilas")

    names.forEach { name ->
        println(name)
    }
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
        val studentName = readLine()
        if (studentName.isNullOrBlank()) {
            break
        }

        val student = studentDirectory[studentName]
        if (student == null) {
            println("Student not found.")
            continue
        }

        println("Enter student rating (pass/fail): ")
        val rating = readLine()
        if (rating.isNullOrBlank()) {
            continue
        }
        if (rating == "pass") {
            student.pass()
            break
        } else if (rating == "fail") {
            student.fail()
            break
        } else {
            println("Invalid rating.")
            continue
        }
    }
    println("Current student ratings:")
    for ((name, student) in studentDirectory) {
        println("$name rating: ${if (student.passed) "pass" else "fail"}")
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
