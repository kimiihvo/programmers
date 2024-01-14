package level0.최댓값만들기2;

import java.util.*;

class Solution {
    public int solution(int[] numbers) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                pq.add(numbers[i] * numbers[j]);
            }
        }

        return pq.poll();
    }
}