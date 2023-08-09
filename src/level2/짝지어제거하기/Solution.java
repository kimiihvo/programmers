package level2.짝지어제거하기;

import java.util.*;

class Solution {
    public int solution(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        return stack.isEmpty() ? 1 : 0;
    }
}