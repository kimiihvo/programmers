package level1.ũ���������̱����;

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        int lastIdx = 0;

        Stack<Integer>[] stacks = new Stack[board.length];
        Stack<Integer> answer = new Stack<>();

        for (int i = 0; i < board.length; i++) {
            stacks[i] = new Stack<>();

            for (int j = board[i].length; j > 0; j--) {

                if (board[j - 1][i] != 0) {
                    stacks[i].push(board[j - 1][i]);
                }

            }

        }

        for (int i = 0; i < moves.length; i++) {

            // moves[i] ���� ���� ���� ����ִ��� Ȯ��
            if (!stacks[moves[i] - 1].isEmpty()) {

                // ������ ��������
                lastIdx = stacks[moves[i] - 1].peek();

                // ���������� ��
                stacks[moves[i] - 1].pop();

                // result stack ����ִ��� Ȯ��
                if (answer.isEmpty()) {
                    // ��������� �׳� �ֱ�
                    answer.push(lastIdx);

                } else {
                    // �ߺ��̸� pop() �� count �ø���
                    if (lastIdx == answer.peek()) {
                        answer.pop();
                        count += 2;

                        // �ߺ��� �ƴ϶�� push()
                    } else {
                        answer.push(lastIdx);
                    }
                }

            }

        }

        return count;
    }

}
