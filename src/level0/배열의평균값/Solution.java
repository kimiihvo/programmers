package level0.�迭����հ�;

class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        for (int n : numbers) {
            answer += n;
        }

        return (double) answer / numbers.length;
    }
}