package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n < 2) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
