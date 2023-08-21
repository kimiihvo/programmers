package level1.콜라문제;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;

        while (n >= a) {
            // 몫만 가져와
            tmp = n / a;

            // 남은 콜라병 담어
            n = n - (tmp * a) + (tmp * b);

            // 바꾼거 더해
            answer += (tmp * b);

            // 초기화
            tmp = 0;
        }

        return answer;
    }
}