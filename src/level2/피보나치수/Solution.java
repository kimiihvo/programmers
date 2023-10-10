package level2.피보나치수;

class Solution {
    public int solution(int n) {
        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        // n까지 더하고더하고더하고더하고더하고
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;

        }

        return arr[n] % 1234567;
    }
}