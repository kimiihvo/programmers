package level0.문자열정렬하기1;

import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] strList = my_string.replaceAll("[^0-9]", "").split("");

        int[] answer = new int[strList.length];

        for (int i = 0; i < strList.length; i++) {
            answer[i] = Integer.parseInt(strList[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}