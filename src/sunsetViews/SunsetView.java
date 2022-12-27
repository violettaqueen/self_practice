package sunsetViews;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SunsetView {

    public static void main(String[] args) {

        int[] buildings = {3,5,4,4,3,1,3,2};
        System.out.println(sunsetViews(buildings, "EAST"));
    }
    public static List<Integer> sunsetViews(int[] buildings, String direction){

        //stack to hold building indexes that can see sunset  {3,5,4,4,3,1,3,2}
        Stack<Integer> stack = new Stack<>();

        //run through array of buildings
        for (int i = 0; i < buildings.length; i++) {

            //run this loop until building at [i] taller than last in stack
            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
        }
        return new ArrayList<Integer>(stack);

    }


}
