package numbers;

public class Fibonacci {

    public static void main(String[] args) {

        int num = 21;
        allFib(21);


    }
    public static int fibonacci(int n){

        if (n < 0) return 0;
        if (n==1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void allFib(int n){

        for (int i = 0; i < n; i++) {
            System.out.println(i+":"+ fibonacci(i)+" ");
        }
    }
}
