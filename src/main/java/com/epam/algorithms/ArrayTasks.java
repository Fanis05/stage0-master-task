package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasons = new String[4];
        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] generateNumbers = new int[length];
        int count = 1;
        for (int i =0; i<length; i++){
            generateNumbers [i] = count;
            count++;
        }
        return generateNumbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String temp;
        int length = arr.length;
        for (int i = 0; i< arr.length /2; i++){
            temp = arr[i];
            arr[i] = arr[length -1 - i];
            arr[length - 1 -i] = temp;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int numOfArr=0;
        int[] tempArr = new int[arr.length];
        int[] positiveArray;
        int length = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > 0) {
                tempArr[numOfArr] = arr[i];
                numOfArr++;
                length++;
            }
        }
        positiveArray = new int[length];
        System.arraycopy(tempArr, 0, positiveArray, 0, length);

        return positiveArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] result = new int[arr.length][1];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = arr[i].length;
            for (int k = 0; k < arr[i].length; k++) {
                for (int j = k + 1; j < arr[i].length; j++) {
                    if (arr[i][k] > arr[i][j]) {
                        int tmp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i][0] > result[j][0]) {
                    int tmp = result[i][0];
                    result[i][0] = result[j][0];
                    result[j][0] = tmp;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (result[i][0] == arr[j].length) {
                    result[i] = arr[j];
                    arr[j] = new int[0];
                    break;
                }
            }
        }
        return result;
    }

}
