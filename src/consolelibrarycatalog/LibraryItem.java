package consolelibrarycatalog;

public abstract class LibraryItem {

    private int id;
    private String title;
    private int year;

    public LibraryItem(int id, String title, int year) {
        validateId(id);
        validateTitle(title);
        validateYear(year);

        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        validateId(id);
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        validateYear(year);
        this.year = year;
    }

    public int getLoanPeriod() {
        return 14;
    }

    public abstract String getDetails();

    // ---------- validation helpers ----------
    private static void validateId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException(
                    "ID must be greater than zero. Received: " + id);
        }
    }

    private static void validateTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "Title cannot be null, empty, or blank.");
        }
    }

    private static void validateYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException(
                    "Year must be greater than zero. Received: " + year);
        }
    }
}
