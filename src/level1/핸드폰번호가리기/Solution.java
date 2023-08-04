package level1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int sbLen = phone_number.length();

        String sb = phone_number.substring(sbLen - 4);

        for (int i = 1; i <= sbLen - 4; i++) {
            answer += "*";
        }

        return answer + sb;
    }
}