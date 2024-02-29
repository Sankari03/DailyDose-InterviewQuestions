public class FibonacciTriangle {
    public static void main(String[] args) {
        fiboTriangle(7);
    }
    public static void fiboTriangle(int n){
        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = 1;
            for (int j = 0; j < i; j++) {
                int c = a+b;
                System.out.print(c);
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
