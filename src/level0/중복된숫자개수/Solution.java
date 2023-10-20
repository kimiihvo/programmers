package level0.중복된숫자개수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int a : array) {
            answer = (a == n) ? answer + 1 : answer;
        }
        return answer;
    }
}