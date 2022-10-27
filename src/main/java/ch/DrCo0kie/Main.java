package ch.DrCo0kie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = new int[]{1, 42, -77, 11223344, 11223345, 11223343, -42, 0};
        System.out.println("Before quickSort = " + Arrays.toString(array));
        sorter.quickSort(array, 0, array.length);
        System.out.println("After quickSort = " + Arrays.toString(array));

        int[] array2 = new int[]{1, 42, -77, 11223344, 11223345, 11223343, -42, 0};
        System.out.println("Before bubbleSort = " + Arrays.toString(array2));
        sorter.bubbleSort(array2);
        System.out.println("After bubbleSort = " + Arrays.toString(array2));
    }
}