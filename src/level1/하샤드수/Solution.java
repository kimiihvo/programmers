package level1.ÇÏ»þµå¼ö;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;

        String[] sList = String.valueOf(x).split("");

        for (String s : sList) {
            sum += Integer.parseInt(s);
        }

        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }
}
