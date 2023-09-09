package level1.���ڿ���������������ϱ�;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> {
            String[] parts1 = s1.split("");
            String[] parts2 = s2.split("");
            int compareResult = parts1[n].compareTo(parts2[n]);

            if (compareResult == 0) {
                return s1.compareTo(s2);
            } else {
                return compareResult;
            }
        });

        return strings;
    }
}