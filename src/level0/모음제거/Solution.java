package level0.��������;

class Solution {
    public String solution(String my_string) {
        String regex = "[aeiouAEIOU]";
        return my_string.replaceAll(regex, "");
    }
}