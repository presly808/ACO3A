package week1.day2;

import week1.day1.Human;

public class Hotel {
  private Human[] visitors = new Human[10];
  private int size;

  public void addVisitor(Human visitor){
    if(size > visitors.length){
      System.out.println("Sorry, Mario. Your princess in another castle");
    }
    else {
      visitors[size] = visitor;
      size++;
    }
  }

  public void showVisitors(){
    for(int i = 0; i < size; i++){
      System.out.println(visitors[i].asString());
    }
  }
}
