package level1.�Ҽ������;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int count = 0;

                    for (int m = 2; m <= sum; m++) {
                        // �Ҽ��� �ƴϸ�
                        if (sum % m == 0) {
                            // ���߱�
                            break;
                        }
                        count++;

                        // ���������� ���µ� �������� ���� ������ �Ҽ�
                        if (count == sum - 3) {
                            answer++;
                        }
                    }

                }
            }
        }

        return answer;
    }
}
