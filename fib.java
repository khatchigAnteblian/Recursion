public class fib {
    public static void main(String[] args) {
        fibonacci(0, 1, 100);
    }

    public static boolean fibonacci(int start, int second, int limit) {
        int a = start;
        int b = second;
        if (a >= limit) {
            return true;
        }
        System.out.println(a);
        return fibonacci(b, a+b, limit);
        
    }
}
