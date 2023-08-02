package level1.콜라츠추측;

class Solution {
    public int solution(int num) {
        long longNum = (long) num;
        int maxCount = 500;
        int count = 0;

        if (num == 1) {
            return 0;
        }

        while (true) {
            // 1이 되면
            if (longNum == 1) {
                break;
                // 짝수
            } else if (longNum % 2 == 0) {
                longNum = longNum / 2;
                // 홀수
            } else {
                longNum = longNum * 3 + 1;
            }

            count++;

            // 500번 까지 1이 안되면
            if (count == maxCount) {
                return -1;
            }

        }

        return count;
    }
}