package level3.이중우선순위큐;

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
                // 최솟값 삭제
                pq.poll();
            } else if (s.equals("D 1")) {
                if (!pq.isEmpty()) {
                    // 최댓값 삭제를 위한 pq copy
                    reversedPq.addAll(pq);
                    // 최댓값 가져오기
                    max = reversedPq.poll();
                    // 최댓값 삭제
                    pq.remove(max);
                    reversedPq.clear();

                }
            } else if (s.startsWith(i)) {
                // 숫자 삽입하기
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