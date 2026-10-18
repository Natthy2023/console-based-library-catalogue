package consolelibrarycatalog;

public class Magazine extends LibraryItem {

    private int issueNumber;
    private String publisher;

    public Magazine(
            int id,
            String title,
            int year,
            int issueNumber,
            String publisher
    ) {
        super(id, title, year);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int getLoanPeriod() {
        return 3;
    }

    @Override
    public String getDetails() {
        int id = getId();
        String title = getTitle();
        int year = getYear();
        int loanPeriod = getLoanPeriod();
        return "ID: " + id + "\nTitle: " + title
                + "\nYear: " + year + "\nIssue Number: "
                + issueNumber + "\nPublisher: " + publisher
                + "\nLoan Period: " + loanPeriod;
    }
}
