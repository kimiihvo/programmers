package level3.��ũ��Ʈ�ѷ�;

import java.util.*;

public class Solution {
    static PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[1], o2[1]); // �� ��° ��(index 1)�� �������� �������� ����
        }
    });

    static List<int[]> jobsList = new ArrayList<int[]>();

    static List<Integer> result = new ArrayList<Integer>();

    public static int solution(int[][] jobs) {

        // jobs copy
        for (int[] row : jobs) {
            jobsList.add(row);
        }
        // ����
        jobsList.sort((arr1, arr2) -> {
            // index 0��°�� �������� ��
            int compareResult = Integer.compare(arr1[0], arr2[0]);

            // index 0���� ���� �� index 1���� �������� ��
            if (compareResult == 0) {
                return Integer.compare(arr1[1], arr2[1]);
            }

            return compareResult;
        });
        // ù��°�� ������ ���� ���ϱ� ù��° ���� ó���ϱ�
        // ù��° ���� �ð� ���ϱ� (����ð�)
        int now = jobsList.get(0)[0] + jobsList.get(0)[1];
        // �ҿ�ð� add
        result.add(jobsList.get(0)[1]);
        // ó�������� remove
        jobsList.remove(0);

        // ����ð�
        getReqList(now, 0);

        int average = (int) (result.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0));

        System.out.println(average);

        return average;
    }

    public static void getReqList(int now, int idx) {

        if (jobsList.size() == 0) {
            return;
        }

        // ���� ������ �۾��� ��û�Ǿ��ִ� �͵� ��������
        for (; idx < jobsList.size(); idx++) {
            if (jobsList.get(idx)[0] <= now) {
                pq.add(jobsList.get(idx));
            } else {
                break;
            }
        }

        // pq�� ���� �� = ��� ���� �� => ���� job �����;���
        if (pq.isEmpty()) {
            // ���� job ��û�ð� ��������
            getReqList(jobsList.get(0)[0], idx);
        } else {
            // �� �߿� �ҿ�ð��� ���� ���� �� ó���ϱ�
            int[] min = pq.poll();

            // ���ð� + �ҿ�ð� ���
            // (����ð� - ��û�ð�) + �ҿ�ð�
            int time = (now - min[0]) + (min[1]);
            // ����ð� ����
            now += min[1];

            result.add(time);
            jobsList.remove(min);

            getReqList(now, idx - 1);
        }

    }
}