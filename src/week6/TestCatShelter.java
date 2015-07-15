package week6;

import week5.day1.Cat;

/**
 * Created by serhii on 13.07.15.
 */
public class TestCatShelter{

    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();

        shelter.addCat(new Cat("Vasia"));
        shelter.addCat(new Cat("Barsik"));
        shelter.addCat(new Cat("Murchik"));

        shelter.showCats();

        try {
            shelter.getCat("Vas");
        } catch (CatShelter.NoSuchCatException e) {
            System.out.println(e.getMessage());
        }


    }
}
