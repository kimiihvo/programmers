package level0.¦��Ȧ������;

class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;

        for (int n : num_list) {
            odd = (n % 2 != 0) ? ++odd : odd;
        }

        int[] answer = { num_list.length - odd, odd };

        return answer;
    }
}