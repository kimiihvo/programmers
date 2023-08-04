package level1.나누어떨어지는숫자배열;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int[] answer;

        for (int i : arr) {
            if (i % divisor == 0) {
                arrList.add(i);
            }
        }

        if (arrList.isEmpty()) {
            arrList.add(-1);
            answer = arrList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            // 오름차순
            Collections.sort(arrList);

            answer = arrList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        return answer;
    }
}