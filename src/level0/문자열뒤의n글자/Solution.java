package level0.문자열뒤의n글자;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}