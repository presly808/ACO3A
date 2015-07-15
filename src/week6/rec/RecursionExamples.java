package week6.rec;

/**
 * Created by serhii on 14.07.15.
 */
public class RecursionExamples {


    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6};

        printArr(mas);


        printArrRec(mas,0);
    }

    public static void printArr(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    public static void printArrRec(int[] mas, int i){

        if(i == mas.length){
            return;
        }

        System.out.println(mas[i]);

        printArrRec(mas, i + 1); // way
    }


}
