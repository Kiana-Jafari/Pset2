package Q3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        AvailableBooks b1 = new AvailableBooks();
        Date d1 = new Date(1, 3, 1989);

        // what they don't teach you at harvard business school
        b1.setBookID("B1984");
        b1.setTitle("What They Don't Teach You at Harvard Business School");
        b1.setAuthor("Mark McCormack");
        b1.setTranslator("Mahmood Toloo");
        b1.setISBN("9789643175443");
        b1.setPublication("Rasa");
        b1.setPublishedYear(1984);
        b1.setEnterDate(d1);
        b1.setPurchasePrice(340000);
        b1.setSalePrice(389000);
        b1.setQuantity(16);

        // display book info
        b1.display();

        // Book info:
        // BookID: B1984
        // book title: What They Don't Teach You at Harvard Business School
        // book author: Mark McCormack
        // translator: Mahmood Toloo
        // publication: Rasa
        // ISBN: 9789643175443
        // publication year: 1984
        // enter date: 1-3-1989 (dd/mm/yyyy)
        // purchased price (original): 340000.0
        // sale price: 389000.0
        // quantity: 16

        // AvailableBooks b2 = new AvailableBooks();
        // b2.getInput();
        // b2.display();

        // Enter the book's info:
        // BookID:B2018
        // book title:Atomic Habits
        // author name:James Clear
        // translator name:Hadi Bahmani
        // publication(s):Novin
        // ISBN:9789353816414
        // year of publication:2018
        // enter date:
        // day: 16
        // month:8
        // year:2019
        // purchased price:390000
        // sale price:475000
        // book's quantity:3


        // Book info:
        // BookID: B2018
        // book title: Atomic Habits
        // book author: James Clear
        // translator: Hadi Bahmani
        // publication: Novin
        // ISBN: 9789353816414
        // publication year: 2018
        // enter date: 16-8-2019 (dd/mm/yyyy)
        // purchased price (original): 390000.0
        // sale price: 475000.0
        // quantity: 3

        Store store = new Store();
        
        store.addBook(scanner);

        int q;

        String bookID = "B2018";
        q = store.returnQuantity(bookID);
        System.out.println("There are " + q + " books available with ID " + bookID + " "); // should print 3
        
        store.sale(bookID, 2);
        q = store.returnQuantity(bookID);
        System.out.println("There are " + q + " book(s) available with ID " + bookID + " "); // should print 1

        try {
            store.returnQuantity("B2012");
        }

        catch (Exception e) {
            System.out.println(e.getMessage()); // No book with ID B2012
        }
        
        try {
            store.sale("B2018", 4);
        }

        catch (Exception e) {
            System.out.println(e.getMessage()); // Current quantity: 1; requested quantity: 4
        }

        store.changePrice(bookID, 498000);

        store.getInfo(scanner); // add three more books
        
        store.save(); // save to files

        scanner.close(); // close the Scanner object to avoid data leakage
    }
}
