package level1.x��ŭ�������ִ�n���Ǽ���;

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long tmp = x;

        // x���� �����Ͽ� x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� ����

        for (int i = 0; i < n; i++) {
            answer[i] = tmp;
            tmp += x;
        }

        return answer;
    }
}