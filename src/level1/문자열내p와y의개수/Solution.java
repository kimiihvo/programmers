package level1.���ڿ���p��y�ǰ���;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cnt1 = 0;
        int cnt2 = 0;

        String[] sList = s.split("");

        for (String ss : sList) {
            if (ss.equals("p") || ss.equals("P")) {
                cnt1++;
            } else if (ss.equals("y") || ss.equals("Y")) {
                cnt2++;
            }
        }

        if (cnt1 == cnt2)
            answer = true;

        return answer;
    }
}