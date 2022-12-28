package sunsetViews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SunsetView2 {

    public static void main(String[] args) {
        int[] buildings= {2,1,3,1};
        System.out.println(sunsetView(buildings, "west"));
    }
    public static List<Integer> sunsetView(int[] buildings, String direction){

        Stack<Integer> stack = new Stack<>();
        int i = 0;  //default values
        int step = 1;

        if (direction.equalsIgnoreCase("west")){
            i = buildings.length-1;
            step =-1;
        }

        while (i >= 0 && i < buildings.length) {

            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }
        if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);
        return new ArrayList<>(stack);


    }

}
