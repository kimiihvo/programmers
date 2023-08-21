package level1.�Ҽ������;

import java.io.IOException;

public class Solution {

    public static boolean[] visited;
    public static int answer = 0;

    public static int solution(int[] nums) {
        visited = new boolean[nums.length];

        // ����
        for (int i = 0; i < nums.length; i++) {
            visited[i] = true;

            // 1�� ������� i ���, cnt 1�� ���
            dfs(i, nums, 1);
            visited[i] = false;
        }
        return answer;
    }

    public static void dfs(int d, int[] nums, int cnt) {

        // 3���� !
        if (cnt == 3) {
            int sum = 0;
            // �湮�� ���� ã�Ƽ� sum
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    sum += nums[i];
                }
            }
            isPrime(sum);
            return;
        }

        // �Ķ���� i �������� ����
        for (int i = d; i < nums.length; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                dfs(i, nums, cnt + 1);

                visited[i] = false;
            }
        }

    }

    /**
     * �Ҽ� ã�� �Լ�
     * 
     * @param sum
     */
    public static void isPrime(int sum) {
        for (int j = 2; j < sum; j++) {
            // �Ҽ��� �ƴϸ� ���߱�
            if (sum % j == 0)
                break;
            // ���������� ���µ� �������� ���� ������ �Ҽ�
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
