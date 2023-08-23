package level1.소수만들기;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int count = 0;

                    for (int m = 2; m <= sum; m++) {
                        // 소수가 아니면
                        if (sum % m == 0) {
                            // 멈추기
                            break;
                        }
                        count++;

                        // 마지막까지 갔는데 나눠지는 값이 없으면 소수
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
