package level2.��ɰ���;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int idx = 0;

        // int[]progresses�� ť�� ��ȯ
        Queue<Integer> queue = new LinkedList<>();
        for (int num : progresses) {
            queue.offer(num);
        }

        while (!queue.isEmpty()) {
            for (int j = 0; j < progresses.length; j++) {

                // 100�̸��� ���� �߰�
                if (progresses[j] < 100) {
                    progresses[j] += speeds[j];
                }
            }

            if (progresses[idx] >= 100) {

                // �Ǿ� ����
                queue.poll();
                count++;

                // ���������� 100 �ִ��� Ȯ��
                for (int k = idx + 1; k < progresses.length; k++) {

                    if (progresses[k] >= 100) {
                        // �Ǿ� ����
                        queue.poll();
                        count++;

                    } else {
                        System.out.println(k);
                        idx = k;
                        break;
                    }

                }
                // �ѹ��� � �����ߴ��� add
                result.add(count);
                // �ʱ�ȭ
                count = 0;
            }

        }
        System.out.println(result);

        // List<Integer> -> int[]�� ��ȯ
        return result.stream().mapToInt(i -> i).toArray();
    }
}