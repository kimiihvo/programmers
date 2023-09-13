package level0.머쓱이보다키큰사람;

import java.util.*;

class Solution {
    public int solution(int[] array, int height) {

        int answer = 0;

        for (int i : array) {
            answer += i > height ? 1 : 0;
        }

        return answer;
    }
}