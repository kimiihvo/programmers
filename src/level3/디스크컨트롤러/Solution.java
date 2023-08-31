package level3.디스크컨트롤러;

import java.util.*;

public class Solution {
    static PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[1], o2[1]); // 두 번째 열(index 1)을 기준으로 오름차순 정렬
        }
    });

    static List<int[]> jobsList = new ArrayList<int[]>();

    static List<Integer> result = new ArrayList<Integer>();

    public static int solution(int[][] jobs) {

        // jobs copy
        for (int[] row : jobs) {
            jobsList.add(row);
        }
        // 정렬
        jobsList.sort((arr1, arr2) -> {
            // index 0번째를 기준으로 비교
            int compareResult = Integer.compare(arr1[0], arr2[0]);

            // index 0번이 같을 때 index 1번을 기준으로 비교
            if (compareResult == 0) {
                return Integer.compare(arr1[1], arr2[1]);
            }

            return compareResult;
        });
        // 첫번째는 무조건 먼저 도니까 첫번째 먼저 처리하기
        // 첫번째 끝난 시간 구하기 (현재시간)
        int now = jobsList.get(0)[0] + jobsList.get(0)[1];
        // 소요시간 add
        result.add(jobsList.get(0)[1]);
        // 처리됐으니 remove
        jobsList.remove(0);

        // 현재시간
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

        // 끝난 시점에 작업이 요청되어있는 것들 가져오기
        for (; idx < jobsList.size(); idx++) {
            if (jobsList.get(idx)[0] <= now) {
                pq.add(jobsList.get(idx));
            } else {
                break;
            }
        }

        // pq가 없을 때 = 놀고 있을 때 => 다음 job 가져와야함
        if (pq.isEmpty()) {
            // 다음 job 요청시간 가져오기
            getReqList(jobsList.get(0)[0], idx);
        } else {
            // 그 중에 소요시간이 가장 적은 것 처리하기
            int[] min = pq.poll();

            // 대기시간 + 소요시간 계산
            // (현재시간 - 요청시간) + 소요시간
            int time = (now - min[0]) + (min[1]);
            // 현재시간 갱신
            now += min[1];

            result.add(time);
            jobsList.remove(min);

            getReqList(now, idx - 1);
        }

    }
}