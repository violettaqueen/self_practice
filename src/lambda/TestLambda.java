package lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>(); // sample data
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(150, Color.GREEN));
        inventory.add(new Apple(400, Color.RED));

        ApplePredicate weightApple = apple -> apple.weight>200;
        filterApples(inventory,weightApple);


    }

    public static List<Apple> filterApples (List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();
        for (Apple each : inventory) {
            if (applePredicate.test(each)) {
                result.add(each);
            }
        }
        return result;

    }

//    public static List<Apple> prettyPrintApple(List<Apple> inventory,ApplePredicate applePredicate){
//
//
//    }
}
