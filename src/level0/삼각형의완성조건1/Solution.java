package level0.�ﰢ���ǿϼ�����1;

import java.util.*;

class Solution {
    public int solution(int[] sides) {

        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}