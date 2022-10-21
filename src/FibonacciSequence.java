/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/22/2022, Saturday
 * @project : dynamic-programming-tabulation-fibonacci-sequence
 **/
public class FibonacciSequence {

    public static long fib(int num) {
        long[] arr = new long[num + 1];
        arr[1] = 1;
        for (int i = 0; i < arr.length; i++) {
            long current = arr[i];
            if ((i + 1) < arr.length)
                arr[i + 1] += current;
            if ((i + 2) < arr.length)
                arr[i + 2] += current;
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(50));
    }
}
