package level0.�ڸ������ϱ�;

class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] strList = String.valueOf(n).split("");

        for (String str : strList) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }
}