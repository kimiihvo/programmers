package level1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = 0;

        // 누가 더 큰 수인지 찾아서 b로 바꾸기
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        } else if (a == b) {
            return a;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}