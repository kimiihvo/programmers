package level1.문자열다루기기본;

class Solution {
    public boolean solution(String s) {

        return ((s.length() == 4 || s.length() == 6) && s.matches("-?\\d+(\\.\\d+)?")) ? true : false;

    }
}