package level2.�Ǻ���ġ��;

class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        // n���� ���ϰ���ϰ���ϰ���ϰ���ϰ�
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;

        }

        return arr[n] % 1234567;
    }
}