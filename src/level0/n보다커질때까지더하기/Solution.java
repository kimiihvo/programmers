package level0.n보다커질때까지더하기;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i : numbers) {
            answer += i;
            if (answer > n)
                break;
        }

        return n > answer ? n : answer;
    }
}