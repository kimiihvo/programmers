package level1.����ǰ����͵���;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        // left���� right���� �ݺ�
        for (int i = left; i <= right; i++) {
            // �ʱ�ȭ
            int count = 0;
            // �Ű������� ���ã��
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // ¦���� +, Ȧ���� -
            answer += (count % 2 == 0) ? i : i * -1;
        }

        return answer;
    }
}