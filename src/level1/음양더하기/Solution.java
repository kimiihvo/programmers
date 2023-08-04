package level1.음양더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] *= -1;
            }

            answer += absolutes[i];
        }

        return answer;
    }
}