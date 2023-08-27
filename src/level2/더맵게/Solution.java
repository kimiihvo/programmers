package level2.´õ¸Ê°Ô;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        int idx1, idx2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.peek() < k) {

            if (pq.size() < 2) {
                return -1;
            }

            idx1 = pq.poll();
            idx2 = pq.poll();

            pq.add(idx1 + (idx2 * 2));

            answer++;
        }

        return answer;
    }
}