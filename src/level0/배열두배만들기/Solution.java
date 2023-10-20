package level0.배열두배만들기;

class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += numbers[i];
        }
        return numbers;
    }
}