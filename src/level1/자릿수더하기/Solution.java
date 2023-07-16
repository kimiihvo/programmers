
package level1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 스트링으로 변환
        String[] nList = String.valueOf(n).split("");

        // 돌려서 더하기
        for (String i : nList) {
            answer += Integer.parseInt(i);
        }

        return answer;
    }
}
