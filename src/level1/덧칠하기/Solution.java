package level1.��ĥ�ϱ�;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int tmp = section[0] + m - 1;
        
        for (int i = 0; i < section.length; i++){
            if ( section[i] > tmp ){
                answer++;
                tmp = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}