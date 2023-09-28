package level0.�粿ġ;

class Solution {
    public int solution(int n, int k) {
        return n >= 10 ? 12000 * n + 2000 * (k - (n / 10)) : 12000 * n + 2000 * k;
    }
}