package level1.�ݶ�������;

class Solution {
    public int solution(int num) {
        long longNum = (long) num;
        int maxCount = 500;
        int count = 0;

        if (num == 1) {
            return 0;
        }

        while (true) {
            // 1�� �Ǹ�
            if (longNum == 1) {
                break;
                // ¦��
            } else if (longNum % 2 == 0) {
                longNum = longNum / 2;
                // Ȧ��
            } else {
                longNum = longNum * 3 + 1;
            }

            count++;

            // 500�� ���� 1�� �ȵǸ�
            if (count == maxCount) {
                return -1;
            }

        }

        return count;
    }
}