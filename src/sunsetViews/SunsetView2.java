package sunsetViews;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SunsetView2 {

    public static void main(String[] args) {
        int[] buildings= {2,1,3,1};
        System.out.println(sunsetView(buildings));
    }
    public static List<Integer> sunsetView(int[] buildings){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < buildings.length; i++) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }
        return new ArrayList<>(stack);


    }

}
