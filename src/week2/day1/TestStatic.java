package week2.day1;

import week1.library.Book;

public class TestStatic {
  public static void main(String[] args) {
    Book book1 = new Book("Title1", "Author1");
    Book book2 = new Book("Title1", "Author1");

//    System.out.println(book1.getCountOfBooks());
    System.out.println(Book.getCountOfBooks());
  }
}
