package consolelibrarycatalog;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        if (item == null) {
            System.out.println("Cannot add null item.");
            return;
        }
        items.add(item);
        System.out.println("Item added.");
    }

    public void removeItem(int id) {
        LibraryItem itemFound = findItemById(id);
        if (itemFound == null) {
            System.out.println("Item not found.");
            return;
        }
        items.remove(itemFound);
        System.out.println("Item removed.");
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void listAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in library.");
            return;
        }
        for (LibraryItem item : items) {
            System.out.println(item.getDetails());
        }
    }

    public List<LibraryItem> findItemsByTitle(String title) {
        List<LibraryItem> matches = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public int countItems() {
        return items.size();
    }

    public void printItems(List<LibraryItem> itemsToPrint) {
        if (itemsToPrint == null || itemsToPrint.isEmpty()) {
            System.out.println("Nothing to print.");
            return;
        }
        for (LibraryItem item : itemsToPrint) {
            System.out.println(item.getDetails());
        }
    }
}
