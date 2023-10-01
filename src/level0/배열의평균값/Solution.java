package level0.배열의평균값;

class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        for (int n : numbers) {
            answer += n;
        }

        return (double) answer / numbers.length;
    }
}