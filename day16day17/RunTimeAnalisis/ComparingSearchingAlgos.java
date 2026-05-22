package day16day17.RunTimeAnalisis;

public class ComparingSearchingAlgos {
    public static int findIndex(int target, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int linearSearch(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {

            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = i + 1;
            }

            int target = size;

            long linearStart = System.nanoTime();

            int linearResult = linearSearch(target, array);

            long linearEnd = System.nanoTime();

            long binaryStart = System.nanoTime();

            int binaryResult = findIndex(target, array);

            long binaryEnd = System.nanoTime();

            double linearTime = (linearEnd - linearStart) / 1_000_000.0;
            double binaryTime = (binaryEnd - binaryStart) / 1_000_000.0;

            System.out.println("\nDataset Size : " + size);

            System.out.println("Linear Search Time  : " + linearTime + " ms");

            System.out.println("Binary Search Time  : " + binaryTime + " ms");
        }
    }
}
