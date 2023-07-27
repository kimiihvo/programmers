package level1.x만큼간격이있는n개의숫자;

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long tmp = x;

        // x부터 시작하여 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴

        for (int i = 0; i < n; i++) {
            answer[i] = tmp;
            tmp += x;
        }

        return answer;
    }
}