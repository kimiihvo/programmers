package level0.문자열곱하기;

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
        // return my_string.repeat(k); // java11부터 사용 가능
    }
}