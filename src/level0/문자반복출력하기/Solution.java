package level0.���ڹݺ�����ϱ�;

class Solution {
    public String solution(String my_string, int n) {
        String[] strList = my_string.split("");
        String answer = "";

        for (int i = 0; i < strList.length; i++) {
            answer += strList[i].repeat(n);
        }

        return answer;
    }
}