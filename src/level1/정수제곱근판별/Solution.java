package level1.�����������Ǻ�;

class Solution {
    public long solution(long n) {

        double sqrt = Math.sqrt(n);

        return (sqrt == (int) sqrt) ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}