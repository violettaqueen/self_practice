package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String[] args) {

        String str = "()";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (Character ch : str.toCharArray())

            switch (ch) {

                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;

                case ')':
                case ']':
                case '}':

                    if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                        return false;
                    }
            }

        return stack.isEmpty();
    }
}
