import java.util.Scanner;

public class SortedArray {

    private static Scanner scan = new Scanner(System.in);


    // get the integers that the user has inserted
    public int[] getIntegers(int toInsert) {

        // toInsert is the number of integers that a user can write
        int[] values = new int[toInsert];
        System.out.println("Please insert " + toInsert + " integer numbers below \r");

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();

        }

        return values;
    }

    // Sort the inserted numbers in descending order
    public int[] sortIntegers(int[] insertedArr) {

        // create a new array that equals the inserted array
        int[] toSort = insertedArr;
        // a temporal variable where the value will be stored
        int temp;
        // a boolean for breaking out of the loop
        boolean sorted;

        do {
            sorted = false;

            // sort in descending order
            // by checking whether the current variable i is less than the next one
            for (int i = 0; i < toSort.length - 1; i++) {
                if (toSort[i] < toSort[i + 1]) {
                    // swap the places of two variables if the current one is less than the i+1
                    temp = toSort[i];
                    toSort[i] = toSort[i + 1];
                    toSort[i + 1] = temp;
                    sorted = true;
                }
            }

            // when it won't be anything to sort, break out of the loop
            // the program will assign true if something was swapped in this pass
        } while (sorted);

        return toSort;
    }

    public void printIntegers(int[] sortedInt){

        // Print the integers after sorting
        System.out.println("Your numbers after sorting in descending order: ");
        for(int i = 0; i < sortedInt.length; i++){
            System.out.print(sortedInt[i] + " ");
        }
    }
}
