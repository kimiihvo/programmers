package level0.����������;

class Solution {
    public String solution(String rsp) {
        String[] rspList = rsp.split("");
        String answer = "";

        for (String r : rspList) {
            answer += r.equals("2") ? "0" : r.equals("0") ? "5" : "2";
        }

        return answer;
    }
}