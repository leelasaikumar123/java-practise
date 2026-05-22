package day16day17.RunTimeAnalisis;

import java.util.Random;

public class SortingComparison {

    public static void bubbleSortLogic(int[] var0) {
        for (int var1 = 0; var1 < var0.length - 1; ++var1) {
            for (int var2 = 0; var2 < var0.length - 1 - var1; ++var2) {
                if (var0[var2] > var0[var2 + 1]) {
                    int var3 = var0[var2];
                    var0[var2] = var0[var2 + 1];
                    var0[var2 + 1] = var3;
                }
            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = findPivot(array, low, high);

            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static int findPivot(int[] array, int low, int high) {

        int i = low - 1;
        int pivot = array[high];

        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {

                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void mergeSort(int[] array, int l, int r) {

        if (l < r) {

            int mid = (l + r) / 2;

            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);

            merging(array, l, mid, r);
        }
    }

    public static void merging(int[] array, int l, int mid, int r) {

        int[] lArray = new int[mid - l + 1];
        int[] rArray = new int[r - mid];

        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = array[l + i];
        }

        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = array[mid + 1 + i];
        }

        int k = l;
        int i = 0;
        int j = 0;

        while (i < lArray.length && j < rArray.length) {

            if (lArray[i] <= rArray[j]) {
                array[k] = lArray[i];
                i++;
                k++;
            } else {
                array[k] = rArray[j];
                j++;
                k++;
            }
        }

        while (i < lArray.length) {
            array[k] = lArray[i];
            i++;
            k++;
        }

        while (j < rArray.length) {
            array[k] = rArray[j];
            j++;
            k++;
        }
    }

    public static int[] generateArray(int size) {

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }

        return array;
    }

    public static int[] copyArray(int[] original) {

        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000};

        for (int size : sizes) {

            int[] original = generateArray(size);

            int[] bubbleArray = copyArray(original);
            int[] mergeArray = copyArray(original);
            int[] quickArray = copyArray(original);

            long bubbleStart = System.nanoTime();

            bubbleSortLogic(bubbleArray);

            long bubbleEnd = System.nanoTime();

            long mergeStart = System.nanoTime();

            mergeSort(mergeArray, 0, mergeArray.length - 1);

            long mergeEnd = System.nanoTime();

            long quickStart = System.nanoTime();

            quickSort(quickArray, 0, quickArray.length - 1);

            long quickEnd = System.nanoTime();

            double bubbleTime = (bubbleEnd - bubbleStart) / 1_000_000.0;
            double mergeTime = (mergeEnd - mergeStart) / 1_000_000.0;
            double quickTime = (quickEnd - quickStart) / 1_000_000.0;

            System.out.println("\nDataset Size : " + size);

            System.out.println("Bubble Sort Time : " + bubbleTime + " ms");

            System.out.println("Merge Sort Time  : " + mergeTime + " ms");

            System.out.println("Quick Sort Time  : " + quickTime + " ms");
        }
    }
}
