package level0.n개간격의원소들;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[len];

        for (int i = 0,j = 0; i < num_list.length; i += n, j++ ){
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}