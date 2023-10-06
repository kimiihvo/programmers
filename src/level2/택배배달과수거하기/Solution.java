package level2.택배배달과수거하기;

import java.util.Stack;

class Solution {
    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long count = 0;

        Stack<Integer> stack_deliveries = new Stack<>();
        Stack<Integer> stack_pickups = new Stack<>();

        // int[] -> stack
        for (int d : deliveries) {
            stack_deliveries.push(d);
        }
        for (int p : pickups) {
            stack_pickups.push(p);
        }

        // 둘다 죽어버릴 때 까지 돌기
        while (!stack_deliveries.isEmpty() || !stack_pickups.isEmpty()) {

            /**
             * [0,0] [0,0] 이따위로 들어올 때 미리 처리
             */

            // 0 먼저 처리
            while (!stack_deliveries.isEmpty() && stack_deliveries.peek() == 0) {
                stack_deliveries.pop();
            }
            while (!stack_pickups.isEmpty() && stack_pickups.peek() == 0) {
                stack_pickups.pop();
            }

            // 0 처리 후 둘다 비었다면 갈 필요 없음
            if (stack_deliveries.isEmpty() && stack_pickups.isEmpty()) {
                break;
            }

            /**
             * 진짜 배달 가야함
             */

            int del_cap = cap;
            int pick_cap = cap;

            // 제일 멀리있는 거리로 count +=
            count += stack_deliveries.size() > stack_pickups.size() ? stack_deliveries.size() * 2
                    : stack_pickups.size() * 2;

            /**
             * delivery check
             */
            // is not empty고 담을 공간이 있으면
            while (!stack_deliveries.isEmpty() && del_cap > 0) {

                // 담을 공간이 넉넉하거나 딱 맞을 때
                if (del_cap >= stack_deliveries.peek()) {
                    // 주거.
                    del_cap -= stack_deliveries.pop();

                    // 담을 공간이 ......부족해
                } else {
                    // 최대한 담아서 가기
                    stack_deliveries.add(stack_deliveries.pop() - del_cap);
                    // 공간 없어요....
                    del_cap = 0;
                    break;
                }
            }

            /**
             * pick up check
             */
            // is not empty고 담을 공간이 있으면
            while (!stack_pickups.isEmpty() && pick_cap > 0) {
                // 담을 공간이 넉넉하거나 딱 맞을 때
                if (pick_cap >= stack_pickups.peek()) {
                    // 주거.
                    pick_cap -= stack_pickups.pop();
                    // 담을 공간이 ......부족해
                } else {
                    // 최대한 담아서 가기
                    stack_pickups.add(stack_pickups.pop() - pick_cap);
                    // 공간 없어요....
                    pick_cap = 0;
                    break;
                }
            }
        }

        return count;
    }
}