import java.util.Arrays;
import java.util.Comparator;
class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

public Book binarySearchByTitle(String title) {
    // Ensure books array is sorted by title
    Arrays.sort(books, Comparator.comparing(Book::getTitle));

    int left = 0;
    int right = books.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        int comparison = books[mid].getTitle().compareToIgnoreCase(title);

        if (comparison == 0) {
            return books[mid];
        } else if (comparison < 0) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return null;
}

