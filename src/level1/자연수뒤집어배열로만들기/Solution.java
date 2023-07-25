package level1.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {

        String sn = String.valueOf(n);

        int[] answer = new int[sn.length()];

        int cnt = sn.length() - 1;

        for (String s : sn.split("")) {
            answer[cnt] = Integer.parseInt(s);
            cnt--;
        }

        return answer;
    }
}