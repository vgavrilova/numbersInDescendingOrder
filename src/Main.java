import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SortedArray arr = new SortedArray();

        // check the sorting
        int[] insertedArr = arr.getIntegers(5);
        int[] sortedArr = arr.sortIntegers(insertedArr);
        arr.printIntegers(sortedArr);



    }
}
