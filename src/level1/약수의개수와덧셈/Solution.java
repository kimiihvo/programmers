package level1.약수의개수와덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        // left에서 right까지 반복
        for (int i = left; i <= right; i++) {
            // 초기화
            int count = 0;
            // 매개변수의 약수찾기
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // 짝수면 +, 홀수면 -
            answer += (count % 2 == 0) ? i : i * -1;
        }

        return answer;
    }
}