package level1.���ڿ��ٷ��⺻;

class Solution {
    public boolean solution(String s) {

        return ((s.length() == 4 || s.length() == 6) && s.matches("-?\\d+(\\.\\d+)?")) ? true : false;

    }
}