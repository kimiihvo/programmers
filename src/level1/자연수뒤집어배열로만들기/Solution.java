package level1.�ڿ���������迭�θ����;

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