package level0.�ߺ��ȼ��ڰ���;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int a : array) {
            answer = (a == n) ? answer + 1 : answer;
        }
        return answer;
    }
}