package level1.�������ڴ½Ⱦ�;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Empty ����
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        // ������ array�� ��ȯ
        int[] answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}