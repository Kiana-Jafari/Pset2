package Q3;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Store {

    private final int capacity = 1000; // maximum number of books
    private int n; // keeps track of the number of books
    private AvailableBooks[] booksList = new AvailableBooks[capacity];

    // constructor to initialize n
    public Store() {
        n = 0;
    }

    // function to return the quantity of a book using bookID if the book is found
    public int returnQuantity(String bookID) {

        for (int i = 0; i < n; i++) 
        {
            if (booksList[i].getBookID().equals(bookID))
                return booksList[i].getQuantity();
        }

        throw new NoSuchElementException("No book with ID " + bookID);
    }

    // function to save the books's info in a file
    public void save() {

        // try-with-resources
        try (FileWriter booksInfo = new FileWriter("books.txt")) 
        {

            for (int i = 0; i < n; i++) 
            {
                booksInfo.write(booksList[i].getBookID());
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getTitle());
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getAuthor());
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getTranslator());
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getPublication());
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getISBN());
                booksInfo.write(" ");
                booksInfo.write(Integer.toString(booksList[i].getPublishedYear()));
                booksInfo.write(" ");
                booksInfo.write(booksList[i].getEnterDate());
                booksInfo.write(" ");
                booksInfo.write(Double.toString(booksList[i].getPurchasePrice()));
                booksInfo.write(" ");
                booksInfo.write(Double.toString(booksList[i].getSalePrice()));
                booksInfo.write(" ");
                booksInfo.write(Integer.toString(booksList[i].getQuantity()));
                booksInfo.write(" ");
                booksInfo.write("\n");
            }
        }

        catch (IOException e) {

            System.out.println("Error saving the book to the file");
        }
    }

    // function for selling `n` books
    public void sale(String bookID, int num) {

        for (int i = 0; i < n; i++) 
        {
            if (booksList[i].getBookID().equals(bookID)) 
            {
                if (booksList[i].getQuantity() >= num) 
                {
                    int value = booksList[i].getQuantity() - num;
                    booksList[i].setQuantity(value);
                    break;
                }

                else
                    throw new IllegalArgumentException(
                            "Current quantity: " + booksList[i].getQuantity() + "; requested quantity: " + num);
            }
        }
    }

    // function to change the salePrice of a book based on its ID
    public void changePrice(String bookID, double price) {

        for (int i = 0; i < n; i++) 
        {
            if (booksList[i].getBookID().equals(bookID)) 
            {
                booksList[i].setSalePrice(price);
                System.out.println("Sale price has been updated successfully!");
                break;
            }
        }
    }

    // insert a new book to the array if it is not already included
    public void addBook(Scanner scanner) {

        AvailableBooks newBook = new AvailableBooks();

        newBook.getInput(scanner); // get the book info from the user

        if (!isPresent(newBook.getBookID())) 
        {
            booksList[n] = newBook;
            n++;
        }
    }

    // get the info of N books and add them to the array
    public void getInfo(Scanner scanner) {

        int N;

        System.out.printf("\nHow many books do you want to add?: ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) 
        {
            addBook(scanner); // call the addBook function to add N books to the array
        }
    }

    // utility function to check the existence of a book
    private boolean isPresent(String bookID) {

        for (int i = 0; i < n; i++) 
        {
            if (booksList[i].getBookID().equals(bookID))
                return true;
        }

        return false;
    }

}
