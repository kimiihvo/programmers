package level1.햄버거만들기;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] ingredient) {
        int answer = 0;

        String ham = "1231";
        // 숫자만 남기기 << 이거 주석 지우면 실패
        StringBuffer sb = new StringBuffer(Arrays.toString(ingredient).replaceAll("[^0-9]", ""));
        while (sb.indexOf(ham) > -1) {
            int idx = sb.indexOf(ham);
            sb.delete(idx, idx + 4);
            answer++;
        }

        return answer;
    }
}
