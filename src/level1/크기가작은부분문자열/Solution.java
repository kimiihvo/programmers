package level1.ũ�Ⱑ�����κй��ڿ�;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp = "";
        for (int i = 0 ; i < t.length(); i++){
            
            if(i+p.length()-1 >= t.length()){
                break;
            }
            
            tmp = t.substring(i , i + p.length());
            if (Long.parseLong(tmp) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}