package level1.�ݶ���;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;

        while (n >= a) {
            // �� ������
            tmp = n / a;

            // ���� �ݶ� ���
            n = n - (tmp * a) + (tmp * b);

            // �ٲ۰� ����
            answer += (tmp * b);

            // �ʱ�ȭ
            tmp = 0;
        }

        return answer;
    }
}