package level1.정수제곱근판별;

class Solution {
    public long solution(long n) {

        double sqrt = Math.sqrt(n);

        return (sqrt == (int) sqrt) ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}