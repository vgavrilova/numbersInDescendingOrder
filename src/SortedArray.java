import java.util.Scanner;

public class SortedArray {

    private static Scanner scan = new Scanner(System.in);
    private int toInsert;
    private int[] toSort;

    // constructor
    public SortedArray(int toInsert) {
        this.toInsert = toInsert;
        this.toSort = getIntegers(toInsert);
    }

    // get the integers that the user has inserted
    private int[] getIntegers(int toInsert) {

        // toInsert is the number of integers that a user can write
        int[] values = new int[toInsert];
        System.out.println("Please insert " + toInsert + " integer numbers below \r");

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();

        }

        return values;
    }

    // Sort the inserted numbers in descending order
    private int[] sortIntegers(int[] insertedArr) {


        // a temporal variable where the value will be stored
        int temp;
        // a boolean for breaking out of the loop
        boolean sorted;

        do {
            sorted = false;

            // sort in descending order
            // by checking whether the current variable i is less than the next one
            for (int i = 0; i < insertedArr.length - 1; i++) {
                if (insertedArr[i] < insertedArr[i + 1]) {
                    // swap the places of two variables if the current one is less than the i+1
                    temp = insertedArr[i];
                    insertedArr[i] = insertedArr[i + 1];
                    insertedArr[i + 1] = temp;
                    sorted = true;
                }
            }

            // when it won't be anything to sort, break out of the loop
            // the program will assign true if something was swapped in this pass
        } while (sorted);

        return insertedArr;
    }

    public void printIntegers() {
        // get the value from the method sortIntegers()
        int[] sorted = sortIntegers(this.toSort);

        // Print the integers after sorting
        System.out.println("Your numbers after sorting in descending order: ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
