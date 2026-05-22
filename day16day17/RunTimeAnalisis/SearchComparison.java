package day16day17.RunTimeAnalisis;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SearchComparison {

    public static int linearSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
      return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int size : sizes) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 1; i <= size; i++) {
                arrayList.add(i);
                hashSet.add(i);
                treeSet.add(i);
            }
            int target = size;
            long arrayStart = System.nanoTime();
            int arrayResult = linearSearch(arrayList, target);
            long arrayEnd = System.nanoTime();
            long hashStart = System.nanoTime();
            boolean hashResult = hashSet.contains(target);
            long hashEnd = System.nanoTime();
            long treeStart = System.nanoTime();
            boolean treeResult = treeSet.contains(target);
            long treeEnd = System.nanoTime();
            double arrayTime =(arrayEnd - arrayStart) / 1_000_000.0;
            double hashTime =(hashEnd - hashStart) / 1_000_000.0;
            double treeTime =(treeEnd - treeStart) / 1_000_000.0;
            System.out.println("\nDataset Size : " + size);
            System.out.println("Array Search Time   : " +arrayTime + " ms");
            System.out.println("HashSet Time  : " +hashTime + " ms");
            System.out.println("TreeSet Time : " + treeTime + " ms");
        }
    }
}
