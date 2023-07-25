package level1.문자열내림차순으로배치하기;

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