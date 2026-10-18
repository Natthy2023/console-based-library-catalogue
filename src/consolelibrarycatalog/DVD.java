package consolelibrarycatalog;

public class DVD extends LibraryItem {

    private String director;
    private int durationMinutes;

    public DVD(
            int id,
            String title,
            int year,
            String director,
            int durationMinutes
    ) {
        super(id, title, year);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int getLoanPeriod() {
        return 7;
    }

    @Override
    public String getDetails() {
        int id = getId();
        String title = getTitle();
        int year = getYear();
        int loanPeriod = getLoanPeriod();
        return "ID: " + id + "\nTitle: " + title
                + "\nYear: " + year + "\nDirector: "
                + director + "\nDuration: " + durationMinutes
                + "\nLoan Period: " + loanPeriod;
    }
}
