package level1.���������������������ϱ�;

import java.util.*;

class Solution {
    public long solution(long n) {

        // String �迭�� �����
        String[] arr = String.valueOf(n).split("");

        // ������������ ����
        Arrays.sort(arr, Collections.reverseOrder());

        // join���� ���̱�
        String str = String.join("", arr);

        return Long.parseLong(str);
    }
}