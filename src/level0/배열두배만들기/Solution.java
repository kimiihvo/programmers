package level0.�迭�ι踸���;

class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += numbers[i];
        }
        return numbers;
    }
}