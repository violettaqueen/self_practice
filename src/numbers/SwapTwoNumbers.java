package numbers;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 0;

        z = y;
        y = x;
        x = z;

        System.out.println(x);
        System.out.println(y);

        int a = 10;
        int b = 20;

        a = a + b; // 30
        b = a - b; // 30 - 20
        a = a - b; //

        System.out.println(a);
        System.out.println(b);


    }

}
