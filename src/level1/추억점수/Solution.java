package level1.추억점수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int sum = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int j = 0; j < photo.length; j++) {
            for (String str : photo[j]) {
                sum += map.getOrDefault(str, 0);
            }
            answer[j] = sum;
            sum = 0;
        }

        return answer;
    }
}