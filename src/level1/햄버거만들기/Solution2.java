package level1.�ܹ��Ÿ����;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] ingredient) {
        int answer = 0;

        String ham = "1231";
        // ���ڸ� ����� << �̰� �ּ� ����� ����
        StringBuffer sb = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]", ""));
        while (sb.indexOf(ham) > -1) {
            int idx = sb.indexOf(ham);
            sb.delete(idx, idx + 4);
            answer++;
        }

        return answer;
    }
}
