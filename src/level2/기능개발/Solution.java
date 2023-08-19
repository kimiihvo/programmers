package level2.기능개발;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int idx = 0;

        // int[]progresses를 큐로 변환
        Queue<Integer> queue = new LinkedList<>();
        for (int num : progresses) {
            queue.offer(num);
        }

        while (!queue.isEmpty()) {
            for (int j = 0; j < progresses.length; j++) {

                // 100미만일 때만 추가
                if (progresses[j] < 100) {
                    progresses[j] += speeds[j];
                }
            }

            if (progresses[idx] >= 100) {

                // 맨앞 삭제
                queue.poll();
                count++;

                // 연속적으로 100 있는지 확인
                for (int k = idx + 1; k < progresses.length; k++) {

                    if (progresses[k] >= 100) {
                        // 맨앞 삭제
                        queue.poll();
                        count++;

                    } else {
                        System.out.println(k);
                        idx = k;
                        break;
                    }

                }
                // 한번에 몇개 배포했는지 add
                result.add(count);
                // 초기화
                count = 0;
            }

        }
        System.out.println(result);

        // List<Integer> -> int[]로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}