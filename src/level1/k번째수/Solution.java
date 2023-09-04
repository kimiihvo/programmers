package level1.k¹øÂ°¼ö;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int answerIdx = 0;

        for (int[] com : commands) {

            int len = com[1] - com[0] + 1;

            int[] tmpList = new int[len];

            for (int i = com[0] - 1, idx = 0; i < com[1]; i++, idx++) {
                tmpList[idx] = array[i];
            }

            Arrays.sort(tmpList);

            answer[answerIdx] = tmpList[com[2] - 1];
            answerIdx++;
        }

        return answer;
    }
}