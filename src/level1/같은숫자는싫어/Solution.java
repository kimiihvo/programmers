package level1.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Empty 방지
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        // 스택을 array로 변환
        int[] answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}