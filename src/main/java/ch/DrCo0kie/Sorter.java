package ch.DrCo0kie;

import java.util.Random;

public class Sorter {

    public void bubbleSort(int[] data) {
        if (data != null) {
            boolean finished = false;
            int size = data.length;
            while (!finished) {
                finished = true;
                for (int i = 0; i < size - 1; ++i) {
                    if (data[i] > data[i + 1]) {
                        swap(data, i, i + 1);
                        finished = false;
                    }
                }
                --size;
            }
        }
    }

    public void quickSort(int[] data, int first, int last) {
        while (first < last) {
            //Random pivot selection
            int pivot = first + generator.nextInt(0, distance(first, last));
            swap(data, last - 1, pivot);

            //Pivot index of the partitioned array
            int i = partition(data, first, last);

            //Tail recursion optimization:
            // If left part is smaller, recursion for left, iteration for right
            if (distance(i, first) < distance(last, i)) {
                quickSort(data, first, i);
                first = i + 1;
            } else {
                quickSort(data, i + 1, last);
                last = i;
            }
        }
    }

    private int partition(int[] data, int first,
                          int last) {
        int i = first - 1, j = last;
        do {
            do {
                ++i;
            } while (data[i] < data[last - 1]);

            do {
                --j;
            } while (j > first && data[last - 1] < data[j]);

            if (i >= j)
                break;
            swap(data, i, j);
        } while (true);
        swap(data, i, last - 1);
        return i;
    }

    private void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private int distance(int a, int b) {
        return Math.abs(a - b);
    }

    private final Random generator = new Random();
}
