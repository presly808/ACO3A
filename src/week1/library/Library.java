package week1.library;

public class Library {
  private Book[] books = new Book[16];
  private int booksCounter;

  private LibraryReader[] libraryReaders = new LibraryReader[16];
  private int readersCounter;


  public void addBook(Book book) {
    if(booksCounter >= books.length) {
      System.out.println("Can't add new book. Library is full");
      return;
    }
    books[booksCounter++] = book;
  }

  public void showBooks(){
    for (int i = 0; i < booksCounter; i++) {
      System.out.println(books[i].asString());
    }
  }

  public void addReader(LibraryReader libraryReader) {
    if(readersCounter >= libraryReaders.length) {
      return;
    }
    libraryReaders[readersCounter++] = libraryReader;
  }

  public void showLibraryReaders(){
    for (int i = 0; i < readersCounter; i++) {
      System.out.println(libraryReaders[i].asString());
    }
  }


}
