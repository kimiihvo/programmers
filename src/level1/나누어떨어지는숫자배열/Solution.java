package level1.����������¼��ڹ迭;

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
            // ��������
            Collections.sort(arrList);

            answer = arrList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        return answer;
    }
}