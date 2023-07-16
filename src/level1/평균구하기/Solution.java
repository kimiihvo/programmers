package level1.Æò±Õ±¸ÇÏ±â;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        answer = answer / arr.length;

        return answer;
    }
}