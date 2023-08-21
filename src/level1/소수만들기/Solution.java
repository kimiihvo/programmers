package level1.소수만들기;

import java.io.IOException;

public class Solution {

    public static boolean[] visited;
    public static int answer = 0;

    public static int solution(int[] nums) {
        visited = new boolean[nums.length];

        // 시작
        for (int i = 0; i < nums.length; i++) {
            visited[i] = true;

            // 1개 담겼으니 i 담고, cnt 1로 재귀
            dfs(i, nums, 1);
            visited[i] = false;
        }
        return answer;
    }

    public static void dfs(int d, int[] nums, int cnt) {

        // 3개다 !
        if (cnt == 3) {
            int sum = 0;
            // 방문한 곳만 찾아서 sum
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    sum += nums[i];
                }
            }
            isPrime(sum);
            return;
        }

        // 파라미터 i 기준으로 시작
        for (int i = d; i < nums.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                dfs(i, nums, cnt + 1);

                visited[i] = false;
            }
        }

    }

    /**
     * 소수 찾는 함수
     * 
     * @param sum
     */
    public static void isPrime(int sum) {
        for (int j = 2; j < sum; j++) {
            // 소수가 아니면 멈추기
            if (sum % j == 0)
                break;
            // 마지막까지 갔는데 나눠지는 값이 없으면 소수
            if (j == sum - 1)
                answer++;
        }
    }

    public static void main(String[] args) throws IOException {
        // int[] nums = {1,2,7,6,4};
        int[] nums = { 1, 2, 3, 4 };

        System.out.println(solution(nums));

    }

}
