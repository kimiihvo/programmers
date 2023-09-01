package level1.¿¹»ê;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int idx = 0;

        Arrays.sort(d);

        while (idx < d.length && d[idx] <= budget) {
            budget -= d[idx];
            idx++;

        }

        return idx;
    }
}
