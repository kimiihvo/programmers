
package level1.�ڸ������ϱ�;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // ��Ʈ������ ��ȯ
        String[] nList = String.valueOf(n).split("");

        // ������ ���ϱ�
        for (String i : nList) {
            answer += Integer.parseInt(i);
        }

        return answer;
    }
}
