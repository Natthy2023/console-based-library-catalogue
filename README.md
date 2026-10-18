# Library Catalog (Java OOP Practice)

A beginner-friendly, console-based Java application to manage a small library of **Books, DVDs, and Magazines**. Built as a hands-on exercise to master Object-Oriented Programming before moving on to Spring Boot.

## Features

- Add **Books**, **DVDs**, and **Magazines**
- List all items in the library
- Search items by title (case-insensitive)
- Remove an item by ID
- Count total items
- Input validation (rejects negative IDs, blank titles, invalid years)

## OOP Concepts Practiced

| Concept | Where it appears |
|---|---|
| **Abstraction** | `LibraryItem` abstract class defines the common contract (`getDetails()`). |
| **Inheritance** | `Book`, `DVD`, `Magazine` extend `LibraryItem`. |
| **Polymorphism** | `Library` stores `List<LibraryItem>` and calls overridden methods. |
| **Encapsulation** | All fields are `private`; access is controlled via validated getters/setters. |

Also covers:
- `ArrayList` and generic collections
- `Scanner` input handling (including the `nextInt()` / `nextLine()` newline quirk)
- Method decomposition (`Main` delegates to handler methods)
- Exception handling via `IllegalArgumentException`

## Project Structure

```
consolelibrarycatalog/
├── LibraryItem.java   # Abstract base class
├── Book.java          # Extends LibraryItem
├── DVD.java           # Extends LibraryItem
├── Magazine.java      # Extends LibraryItem
├── Library.java       # Manages the collection
└── Main.java          # Console menu & input handling
```

## How to Run

### NetBeans
1. Open the project in NetBeans.
2. Right-click the project → **Run**.

### Command Line (Ant project)
```bash
ant clean run
```

### Command Line (Maven project)
```bash
mvn clean compile exec:java
```

### Manual (javac + java)
```bash
javac -d out src/consolelibrarycatalog/*.java
java -cp out consolelibrarycatalog.Main
```

## Usage

When you run the program, you'll see:

```
==== Menu ====
1. Add Book
2. Add DVD
3. Add Magazine
4. List all
5. Search by title
6. Remove item
7. Count items
8. Exit
```

Type the number of the option and press **Enter**. Data is stored in memory, so it resets when you exit.

## Sample Test Walkthrough

1. Add a Book (`1`) → enter ID `1`, title `Clean Code`, year `2008`, author `Robert Martin`, ISBN `9780132350884`
2. Add a DVD (`2`) → ID `2`, title `Inception`, year `2010`, director `Christopher Nolan`, duration `148`
3. Add a Magazine (`3`) → ID `3`, title `National Geographic`, year `2024`, issue `202`, publisher `NatGeo`
4. List all (`4`) → should show **3 items** with different detail formats
5. Search by title (`5`) → `Clean Code` → should return the matching book
6. Count (`7`) → should print **3**
7. Remove item (`6`) → ID `2` → then List all (`4`) → **2 items remain**
8. Exit (`8`)

## Known Limitations

- Data is stored **in memory only** — it is lost when the program exits.
- No user authentication or persistence layer (planned for a future Spring Boot version).
- Duplicate IDs are allowed; uniqueness is not enforced.

## Roadmap / Next Steps

This project is **Phase 1** of a backend learning path:

- ✅ **Phase 1 (current):** Java OOP fundamentals
- ⏭ **Phase 2:** Collections deep-dive + Java 8 features (lambdas, streams, `Optional`)
- ⏭ **Phase 3:** Maven + SQL + JDBC
- ⏭ **Phase 4:** Spring Core (Dependency Injection)
- ⏭ **Phase 5:** Spring Boot — REST API version of this same Library Catalog (with a real database)


## License

MIT (or "For learning purposes")