package level2.두큐합같게만들기;

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

        // 합이 홀수라면 불가능
        if ((sum1 + sum2) % 2 != 0) {
            return -1;
        }

        int count1 = queue1.length;
        int count2 = queue2.length;
        int popped = 0;

        while (!q1.isEmpty() && !q2.isEmpty()) {
            // 합이 같다면 return
            if (sum1 == sum2)
                return answer;

            // sum이 큰 쪽의 원소를 작은 쪽으로 insert
            if (sum1 > sum2) {
                // queue1의 이동 횟수--
                count1--;
                // 빼!
                popped = q1.poll();
                // 넣어!
                q2.offer(popped);
                // 합 갱신해!
                sum1 -= popped;
                sum2 += popped;

            } else {
                // queue2의 이동 횟수--
                count2--;
                // 빼!
                popped = q2.poll();
                // 넣어!
                q1.offer(popped);
                // 합 갱신해!
                sum2 -= popped;
                sum1 += popped;
            }

            // 두 큐의 pop count가 모두 큐의 length만큼 돈다면,
            // 서로의 위치가 바뀌어도 합이 같아지지 않으므로 불가능
            if (count1 <= 0 && count2 <= 0) {
                return -1;
            }

            answer++;
        }

        return -1;
    }
}