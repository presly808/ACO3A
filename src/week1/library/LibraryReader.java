package week1.library;

public class LibraryReader {
  private String name;
  private long id;
  private Book[] books = new Book[3];
  private int booksCounter;

  public LibraryReader(String name, long id) {
    this.name = name;
    this.id = id;
  }

  public void takeBook(Book book) {
    if (booksCounter >= books.length) {
      return;
    }
    books[booksCounter++] = book;
  }

  public void showBooks() {
    for (int i = 0; i < booksCounter; i++) {
      System.out.println(books[i].asString());
    }
  }

  public String asString() {
    return "Name=" + name + ", id=" + id;
  }
}
