package day16day17.RunTimeAnalisis;
public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
      if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
    if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
      for (int i = 2; i <= n; i++) {
         sum = a + b;
     a = b;

      b = sum;
        }

        return b;
    }

    public static void main(String[] args) {

        int[] values = {10, 30, 40};

        for (int n : values) {
            long recursiveStart = System.nanoTime();
            int recursiveResult = fibonacciRecursive(n);
            long recursiveEnd = System.nanoTime();
            long iterativeStart = System.nanoTime();
            int iterativeResult = fibonacciIterative(n);
           long iterativeEnd = System.nanoTime();

            double recursiveTime =
                    (recursiveEnd - recursiveStart) / 1_000_000.0;

            double iterativeTime =
                    (iterativeEnd - iterativeStart) / 1_000_000.0;

            System.out.println("\nFibonacci Value : " + n);

            System.out.println("Recursive Time   : " +
                    recursiveTime + " ms");

            System.out.println("Iterative Time   : " +
                    iterativeTime + " ms");
        }
    }
}
