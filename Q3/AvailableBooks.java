package Q3;

import java.util.Scanner;

public class AvailableBooks extends Book {

    // data members
    private String BookID;
    private Date enterDate;
    private double purchasePrice;
    private double salePrice;
    private int quantity;

    // constructors
    AvailableBooks() {}

    AvailableBooks(
        String BookID,
        Date enterDate,
        double purchasePrice,
        double salePrice,
        int quantity,
        String title,
        String author,
        String translator,
        String publication,
        String ISBN,
        int publishedYear
    )

    {
        super(title, author, translator, publication, ISBN, publishedYear);
        this.BookID = BookID;
        this.enterDate = enterDate;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
    }

    // setters
    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public void setPurchasePrice(double purchasePrice) {

        if (purchasePrice > 0)
            this.purchasePrice = purchasePrice;

        else
            throw new IllegalArgumentException("Purchase price must be greater than 0. Got " + purchasePrice);
    }

    public void setSalePrice(double salePrice) {

        if (salePrice > 0)
            this.salePrice = salePrice;

        else
            throw new IllegalArgumentException("Sale price must be greater than 0. Got " + salePrice);
    }

    public void setQuantity(int quantity) {

        if (quantity >= 0)
            this.quantity = quantity;

        else
            throw new IllegalArgumentException("Quantity must be positive or 0. Got " + quantity);
    }

    // getters
    public String getBookID() {
        return this.BookID;
    }

    public String getEnterDate() {

        String date = this.enterDate.getDay() + "-" + this.enterDate.getMonth() + "-" + this.enterDate.getYear();

        return date;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // get book's info from the user
    public void getInput(Scanner scanner) {

        String info;

        System.out.println("\nEnter the book's info:");

        System.out.printf("BookID: ");
        info = scanner.nextLine();
        this.setBookID(info);

        System.out.printf("book title: ");
        info = scanner.nextLine();
        this.setTitle(info);

        System.out.printf("author name: ");
        info = scanner.nextLine();
        this.setAuthor(info);

        System.out.printf("translator name: ");
        info = scanner.nextLine();
        this.setTranslator(info);

        System.out.printf("publication(s): ");
        info = scanner.nextLine();
        this.setPublication(info);

        System.out.printf("ISBN: ");
        info = scanner.nextLine();
        this.setISBN(info);

        System.out.printf("year of publication: ");
        info = scanner.nextLine();
        this.setPublishedYear(Integer.parseInt(info));

        System.out.printf("enter date: ");
        System.out.printf("\nday: ");
        info = scanner.nextLine();
        int day = Integer.parseInt(info);
        System.out.printf("month: ");
        info = scanner.nextLine();
        int month = Integer.parseInt(info);
        System.out.printf("year: ");
        info = scanner.nextLine();
        int year = Integer.parseInt(info);
        Date enter = new Date(day, month, year);
        this.setEnterDate(enter);

        System.out.printf("purchased price: ");
        info = scanner.nextLine();
        this.setPurchasePrice(Double.parseDouble(info));

        System.out.printf("sale price: ");
        info = scanner.nextLine();
        this.setSalePrice(Double.parseDouble(info));

        System.out.printf("book's quantity: ");
        info = scanner.nextLine();
        this.setQuantity(Integer.parseInt(info));

        System.out.println("\n\nBook saved successfully!");
    }

    // display book's info
    public void display() {

        System.out.printf(
            "\n\nBook info:" +
            "\nBookID: " + this.getBookID() +
            "\nbook title: " + this.getTitle() +
            "\nbook author: " + this.getAuthor() +
            "\ntranslator: " + this.getTranslator() +
            "\npublication: " + this.getPublication() +
            "\nISBN: " + this.getISBN() +
            "\npublication year: " + this.getPublishedYear() +
            "\nenter date: " + this.getEnterDate() +
            "\npurchased price (original): " + this.getPurchasePrice() +
            "\nsale price: " + this.getSalePrice() +
            "\nquantity: " + this.getQuantity());
    }
}
