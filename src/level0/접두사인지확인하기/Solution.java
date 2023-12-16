package level0.접두사인지확인하기;

class Solution {
    public int solution(String my_string, String is_prefix) {
        return my_string.indexOf(is_prefix) == 0 ? 1 : 0;
    }
}