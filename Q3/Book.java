package Q3;

abstract class Book {

    // data memebrs
    private String title;
    private String author;
    private String translator;
    private String publication;
    private String ISBN;
    private int publishedYear;

    // constructors (default + parameterized)
    public Book() {}

    public Book(
        String title,
        String author,
        String translator,
        String publication,
        String ISBN,
        int publishedYear
    )

    {
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.publication = publication;
        this.ISBN = ISBN;
        this.publishedYear = publishedYear;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    // getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTranslator() {
        return this.translator;
    }

    public String getPublication() {
        return this.publication;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }
}
