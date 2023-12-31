package level0.제곱수판별하기;

class Solution {
    public int solution(int n) {
        int answer = (int) Math.sqrt(n);
        return answer * answer == n ? 1 : 2;
    }
}