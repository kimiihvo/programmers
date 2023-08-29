package level3.���߿켱����ť;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public static int[] solution(String[] operations) {
        int[] answer = { 0, 0 };
        String i = "I ";
        int max = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> reversedPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : operations) {
            if (s.equals("D -1")) {
                // �ּڰ� ����
                pq.poll();
            } else if (s.equals("D 1")) {
                if (!pq.isEmpty()) {
                    // �ִ� ������ ���� pq copy
                    reversedPq.addAll(pq);
                    // �ִ� ��������
                    max = reversedPq.poll();
                    // �ִ� ����
                    pq.remove(max);
                    reversedPq.clear();

                }
            } else if (s.startsWith(i)) {
                // ���� �����ϱ�
                int num = Integer.parseInt(s.replace(i, ""));
                pq.add(num);

            }
        }

        if (!pq.isEmpty()) {
            answer[1] = pq.poll();
            reversedPq.addAll(pq);

            answer[0] = reversedPq.poll();
        }

        return answer;
    }
}