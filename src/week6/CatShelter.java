package week6;

import week5.day1.Cat;
import week5.day1.MyArrayList;
import week5.day1.MyList;
/*
* SOLID
*
* S - Single Responsibility
* O - Open-Closed
* L - barbara liskov
* I - Interface Segregation Principle
* D - Dependency principle
*
* */



//
public class CatShelter {
    //     |
    // D - Dependency Inversion Principle
    private MyList list;

    private String address;

    public CatShelter() {
        list = new MyArrayList();
    }

    public void addCat(Cat cat){
        list.add(cat);
    }

    public void showCats(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public Cat getCat(String name) throws NoSuchCatException {

        for (int i = 0; i < list.size(); i++) {
            Cat cat = (Cat) list.get(i);
            if(cat.getName().equals(name)){
                return cat;
            }
        }

        throw new NoSuchCatException("No cat with name " + name);
    }

    public static class NoSuchCatException extends Exception {

        public NoSuchCatException(String message) {
            super(message);
        }
    }

}
