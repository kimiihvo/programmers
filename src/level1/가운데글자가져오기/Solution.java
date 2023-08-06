package level1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int sLen = s.length();

        if (sLen % 2 == 0) {
            answer = s.substring(sLen / 2 - 1, sLen / 2 + 1);
        } else {
            answer = s.substring(sLen / 2, sLen / 2 + 1);
        }

        return answer;
    }
}