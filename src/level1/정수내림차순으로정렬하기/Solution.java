package level1.정수내림차순으로정렬하기;

import java.util.*;

class Solution {
    public long solution(long n) {

        // String 배열로 만들기
        String[] arr = String.valueOf(n).split("");

        // 내림차순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        // join으로 붙이기
        String str = String.join("", arr);

        return Long.parseLong(str);
    }
}