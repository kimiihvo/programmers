package level1.없는숫자더하기;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i <= 9; i++) {

            int j = i;

            if (!IntStream.of(numbers).anyMatch(a -> a == j)) {
                answer += j;
            }
        }

        return answer;
    }
}