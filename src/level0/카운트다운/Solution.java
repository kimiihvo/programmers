package level0.ī��Ʈ�ٿ�;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

        for (int i = start, idx = 0; i >= end_num; i--, idx++) {
            answer[idx] = i;
        }

        return answer;
    }
}