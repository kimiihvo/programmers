package level0.���ڿ���������;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] strList = num_str.split("");
        for (String s : strList) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}