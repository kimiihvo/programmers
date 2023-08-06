package level1.제일작은수제거하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {

        // 배열을 List로 변환
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list1.remove(Collections.min(list1));

        if (list1.isEmpty()) {
            int[] answer = { -1 };
            return answer;
        } else {
            int[] answer = list1.stream().mapToInt(i -> i).toArray();
            return answer;
        }
    }
}