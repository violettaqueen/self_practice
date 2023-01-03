package numbers;

public class IntegerReversion2 {

    public int reverse(int n){

        int remainder=0;
        int reversed=0;
        while (n>0) {
            remainder=n%10;
            n=n/10;
            reversed=reversed*10+remainder;
        }
        return reversed;
    }
}
