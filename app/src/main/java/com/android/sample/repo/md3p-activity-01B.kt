package com.android.sample.repo

fun main() {
    val word = "School Library"
    val separator = "=".repeat(word.length + 6)
    println(separator)
    println("  $word  ")
    println(separator)
    println("What's Inside")
    var repeat = true
    while (repeat) {
        println("B - Books\nM - Magazines\nN - Newspapers")
        println("Please select a CHARACTER(B,M,N): ")
        val input = readLine().toString()

        when (input) {
            "B" -> {

// val/s for Book 1
                val title1A = "The Great Gatsby"
                val author1A = "F. Scott Fitzgerald"
                val publisher1A = "Charles Scribner's Sons"
                val numberOfPages1A = 180
                val rating1A = 4.5
// val/s for Book 2
                val title2A = "To Kill a Mockingbird"
                val author2A = "Harper Lee"
                val publisher2A = "J. B. Lippincott & Co."
                val numberOfPages2A = 281
                val rating2A = 4.6
// val/s for Book 3
                val title3A = "Pride and Prejudice"
                val author3A = "Jane Austen"
                val publisher3A = "T. Egerton, Whitehall"
                val numberOfPages3A = 279
                val rating3A = 4.7
// separator design for BOOKS
                val word = "BOOKS"
                val separator = "=".repeat(word.length + 6)
                println(separator)
                println("  $word  ")
                println(separator)
// Books selection
                println("You selected BOOKS: ")
                println("1.The Great Gatsby by F. Scott Fitzgerald")
                println("2.To Kill a Mockingbird by Harper Lee")
                println("3.Pride and Prejudice by Jane Austen")
                println("Select your BOOK: CHOOSE A NUMBER ABOVE(1,2,3): ")
                val book = readLine().toString()
                when (book) {
                    "1" -> println("You selected Book1\nTitle: $title1A\nWriter: $author1A\nPublisher: $publisher1A\nPages: $numberOfPages1A\nRating: $rating1A")
                    "2" -> println("You selected Book2\nTitle: $title2A\nWriter: $author2A\nPublisher: $publisher2A\nPages: $numberOfPages2A\nRating: $rating2A")
                    "3" -> println("You selected Book3\nTitle: $title3A\nWriter: $author3A\nPublisher: $publisher3A\nPages: $numberOfPages3A\nRating: $rating3A")
                    else -> println("Invalid selection. Please try again.")
                }
                repeat = false
            }
            "M" -> {
// val/s for magazine 1
                val title1= "Time"
                val author1 = "Henry Luce"
                val publisher1 = "Time Inc."
                val numberOfPages1 = 100
                val rating1 = 4.5
// val/s for magazine 2
                val title2= "National Geographic"
                val author2 = "Melvil Dewey"
                val publisher2 = "National Geographic Society"
                val numberOfPages2 = 120
                val rating2 = 4.6
// val/s for magazine 3
                val title3= "Sports Illustrated"
                val author3 = "Henry Luce"
                val publisher3 = "Time Inc."
                val numberOfPages3 = 80
                val rating3 = 4.7
// separator design for Magazine
                val word = "MAGAZINES"
                val separator = "=".repeat(word.length + 6)
                println(separator)
                println("  $word  ")
                println(separator)
// Magazine selection println/s readline().toString
                println("You selected MAGAZINES: ")
                println("1.Time by Henry Luce")
                println("2.National Geographic by Melvil Dewey")
                println("3.Sports Illustrated by Henry Dewey")
                println("Select your MAGAZINE: CHOOSE A NUMBER ABOVE(1,2,3): ")
                val magazine = readLine().toString()
                when (magazine) {
                    "1" -> println("You selected Magazine1\nTitle: $title1\nWriter: $author1\nPublisher: $publisher1\nPages: $numberOfPages1\nRating: $rating1 ")
                    "2" -> println("You selected Magazine2\nTitle: $title2\nWriter: $author2\nPublisher: $publisher2\nPages: $numberOfPages2\nRating: $rating2")
                    "3" -> println("You selected Magazine3\nTitle: $title3\nWriter: $author3\nPublisher: $publisher3\nPages: $numberOfPages3\nRating: $rating3")
                    else -> println("Invalid selection. Please try again.")
                }
                repeat = false
            }
            "N" -> {

// val/s for NEWSPAPER 1
                val title1B= "The New York Times"
                val author1B = "Adolph Ochs"
                val publisher1B = "The New York Times Company"
                val numberOfPages1B = 40
                val rating1B = 4.8
// val/s for NEWSPAPER 2
                val title2B = "The Washington Post"
                val author2B = "Eugene Meyer"
                val publisher2B = "The Washington Post Company"
                val numberOfPages2B = 60
                val rating2B = 4.9
// val/s for NEWSPAPER 3
                val title3B = "The Wall Street Journal"
                val author3B = "Charles Dow"
                val publisher3B = "Dow Jones & Company"
                val numberOfPages3B = 80
                val rating3B = 4.3
// separator design for NEWSPAPER
                val word = "NEWSPAPERS"
                val separator = "=".repeat(word.length + 6)
                println(separator)
                println("  $word  ")
                println(separator)
// Magazine selection println/s readline().toString
                println("You selected NEWSPAPERS: ")
                println("1.The New York Times by Adolph Ochs")
                println("2.The Washington Post by Eugene Meyer")
                println("3.The Wall Street Journal by Dow Jones & Company")
                println("Select your NEWSPAPER: CHOOSE A NUMBER ABOVE(1,2,3): ")
                val newspaper = readLine().toString()
                when (newspaper) {
                    "1" -> println("You selected Newspaper1\nTitle: $title1B\nWriter: $author1B\nPublisher: $publisher1B\nPages: $numberOfPages1B\nRating: $rating1B")
                    "2" -> println("You selected Newspaper2\nTitle: $title2B\nWriter: $author2B\nPublisher: $publisher2B\nPages: $numberOfPages2B\nRating: $rating2B")
                    "3" -> println("You selected Newspaper3\nTitle: $title3B\nWriter: $author3B\nPublisher: $publisher3B\nPages: $numberOfPages3B\nRating: $rating3B")
                    else -> println("Invalid selection. Please try again.")
                }
                repeat = false
            }
            else -> println("Invalid selection. Please try again.")
        }
    }
    println("Thank You, happy reading!")
}
