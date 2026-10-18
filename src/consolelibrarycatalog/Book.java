package consolelibrarycatalog;

public class Book extends LibraryItem {

    private String author;
    private String isbn;

    public Book(
            int id,
            String title,
            int year,
            String author,
            String isbn
    ) {
        super(id, title, year);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int getLoanPeriod() {
        return 14;
    }

    @Override
    public String getDetails() {
        int id = getId();
        String title = getTitle();
        int year = getYear();
        int loanPeriod = getLoanPeriod();
        return "ID: " + id + "\nTitle: " + title
                + "\nYear: " + year + "\nAuthor: "
                + author + "\nISBN: " + isbn
                + "\nLoan Period: " + loanPeriod;
    }
}
