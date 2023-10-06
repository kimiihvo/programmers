package level2.�ù��ް������ϱ�;

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

        // �Ѵ� �׾���� �� ���� ����
        while (!stack_deliveries.isEmpty() || !stack_pickups.isEmpty()) {

            /**
             * [0,0] [0,0] �̵����� ���� �� �̸� ó��
             */

            // 0 ���� ó��
            while (!stack_deliveries.isEmpty() && stack_deliveries.peek() == 0) {
                stack_deliveries.pop();
            }
            while (!stack_pickups.isEmpty() && stack_pickups.peek() == 0) {
                stack_pickups.pop();
            }

            // 0 ó�� �� �Ѵ� ����ٸ� �� �ʿ� ����
            if (stack_deliveries.isEmpty() && stack_pickups.isEmpty()) {
                break;
            }

            /**
             * ��¥ ��� ������
             */

            int del_cap = cap;
            int pick_cap = cap;

            // ���� �ָ��ִ� �Ÿ��� count +=
            count += stack_deliveries.size() > stack_pickups.size() ? stack_deliveries.size() * 2
                    : stack_pickups.size() * 2;

            /**
             * delivery check
             */
            // is not empty�� ���� ������ ������
            while (!stack_deliveries.isEmpty() && del_cap > 0) {

                // ���� ������ �˳��ϰų� �� ���� ��
                if (del_cap >= stack_deliveries.peek()) {
                    // �ְ�.
                    del_cap -= stack_deliveries.pop();

                    // ���� ������ ......������
                } else {
                    // �ִ��� ��Ƽ� ����
                    stack_deliveries.add(stack_deliveries.pop() - del_cap);
                    // ���� �����....
                    del_cap = 0;
                    break;
                }
            }

            /**
             * pick up check
             */
            // is not empty�� ���� ������ ������
            while (!stack_pickups.isEmpty() && pick_cap > 0) {
                // ���� ������ �˳��ϰų� �� ���� ��
                if (pick_cap >= stack_pickups.peek()) {
                    // �ְ�.
                    pick_cap -= stack_pickups.pop();
                    // ���� ������ ......������
                } else {
                    // �ִ��� ��Ƽ� ����
                    stack_pickups.add(stack_pickups.pop() - pick_cap);
                    // ���� �����....
                    pick_cap = 0;
                    break;
                }
            }
        }

        return count;
    }
}