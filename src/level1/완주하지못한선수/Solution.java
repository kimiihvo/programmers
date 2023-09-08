package level1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }

        for (String k : map.keySet()) {
            if (map.get(k) > 0) {
                answer = k;
                break;
            }
        }

        return answer;
    }
}