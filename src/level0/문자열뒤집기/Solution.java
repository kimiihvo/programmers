package level0.문자열뒤집기;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += String.valueOf(my_string.charAt(i));
        }

        return answer;
    }
}