package level1.크레인인형뽑기게임;

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

            // moves[i] 값의 스택 안이 비어있는지 확인
            if (!stacks[moves[i] - 1].isEmpty()) {

                // 있으면 가져오기
                lastIdx = stacks[moves[i] - 1].peek();

                // 가져왔으니 팝
                stacks[moves[i] - 1].pop();

                // result stack 비어있는지 확인
                if (answer.isEmpty()) {
                    // 비어있으면 그냥 넣기
                    answer.push(lastIdx);

                } else {
                    // 중복이면 pop() 후 count 올리기
                    if (lastIdx == answer.peek()) {
                        answer.pop();
                        count += 2;

                        // 중복이 아니라면 push()
                    } else {
                        answer.push(lastIdx);
                    }
                }

            }

        }

        return count;
    }

}
