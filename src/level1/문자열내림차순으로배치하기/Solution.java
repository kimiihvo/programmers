package level1.���ڿ������������ι�ġ�ϱ�;

import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] sList = s.split("");
        String answer = Arrays.stream(sList)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
        return answer;
    }
}