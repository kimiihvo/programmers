package level2.올바른괄호;

import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }

        }
        return stack.isEmpty();
    }
}