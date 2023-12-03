/*Library System Program*/
import java.util.Scanner

class Book(val title: String, val author: String, val publicationYear: Int) {
    var isBorrowed: Boolean = false

    override fun toString(): String {
        return "Title: $title, Author: $author, Publication Year: $publicationYear, Borrowed: $isBorrowed"
    }
}

class Library {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(title: String, author: String, publicationYear: Int) {
        val book = Book(title, author, publicationYear)
        books.add(book)
    }

    fun displayBooks() {
        println("Library Books:")
        for (book in books) {
            println(book)
        }
    }

    fun searchByAuthor(author: String) {
        println("Books by $author:")
        var found = false
        for (book in books) {
            if (book.author.equals(author, ignoreCase = true)) {
                println(book)
                found = true
            }
        }
        if (!found) {
            println("No books found by $author.")
        }
    }

    fun searchByYear(year: Int) {
        println("Books published in $year:")
        var found = false
        for (book in books) {
            if (book.publicationYear == year) {
                println(book)
                found = true
            }
        }
        if (!found) {
            println("No books found published in $year.")
        }
    }

    fun borrowBook(title: String) {
        for (book in books) {
            if (book.title.equals(title, ignoreCase = true) && !book.isBorrowed) {
                book.isBorrowed = true
                println("You have successfully borrowed: $title")
                return
            }
        }
        println("Book $title is not available for borrowing.")
    }

    fun returnBook(title: String) {
        for (book in books) {
            if (book.title.equals(title, ignoreCase = true) && book.isBorrowed) {
                book.isBorrowed = false
                println("You have successfully returned: $title")
                return
            }
        }
        println("Book $title was not borrowed from this library.")
    }
}

fun main() {
    val library = Library()
    val scanner = Scanner(System.`in`)

    var option: Int
    do {
        println("\nOptions for Library System:")
        println("1: Add a Book")
        println("2. Display Available Books")
        println("3. Search by Author")
        println("4. Search by Year")
        println("5. Borrow a Book")
        println("6. Return a Book")
        println("7. Exit")
        print("Choose any option from top level: ")

        option = scanner.nextInt()

        when (option) {
            1 -> {
                print("Enter title: ")
                val title = scanner.next()
                print("Enter author: ")
                val author = scanner.next()
                print("Enter publication year: ")
                val year = scanner.nextInt()

                library.addBook(title, author, year)
                println("Book added successfully.")
            }
            2 -> library.displayBooks()
            3 -> {
                print("Enter author's name: ")
                val author = scanner.next()
                library.searchByAuthor(author)
            }
            4 -> {
                print("Enter publication year: ")
                val year = scanner.nextInt()
                library.searchByYear(year)
            }
            5 -> {
                print("Enter title to borrow: ")
                val titleToBorrow = scanner.next()
                library.borrowBook(titleToBorrow)
            }
            6 -> {
                print("Enter title to return: ")
                val titleToReturn = scanner.next()
                library.returnBook(titleToReturn)
            }
            7 -> println("Exiting Library System. Goodbye!")
            else -> println("Invalid option. Please choose a valid option.")
        }
    } while (option != 7)

    // Close the Scanner to prevent resource leaks
    scanner.close()
}
