package level2.��ť�հ��Ը����;

import java.util.*;

class Solution {
    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for (int q : queue1) {
            q1.offer(q);
            sum1 += q;
        }

        for (int q : queue2) {
            q2.offer(q);
            sum2 += q;
        }

        // ���� Ȧ����� �Ұ���
        if ((sum1 + sum2) % 2 != 0) {
            return -1;
        }

        int count1 = queue1.length;
        int count2 = queue2.length;
        int popped = 0;

        while (!q1.isEmpty() && !q2.isEmpty()) {
            // ���� ���ٸ� return
            if (sum1 == sum2)
                return answer;

            // sum�� ū ���� ���Ҹ� ���� ������ insert
            if (sum1 > sum2) {
                // queue1�� �̵� Ƚ��--
                count1--;
                // ��!
                popped = q1.poll();
                // �־�!
                q2.offer(popped);
                // �� ������!
                sum1 -= popped;
                sum2 += popped;

            } else {
                // queue2�� �̵� Ƚ��--
                count2--;
                // ��!
                popped = q2.poll();
                // �־�!
                q1.offer(popped);
                // �� ������!
                sum2 -= popped;
                sum1 += popped;
            }

            // �� ť�� pop count�� ��� ť�� length��ŭ ���ٸ�,
            // ������ ��ġ�� �ٲ� ���� �������� �����Ƿ� �Ұ���
            if (count1 <= 0 && count2 <= 0) {
                return -1;
            }

            answer++;
        }

        return -1;
    }
}