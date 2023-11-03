package level1.푸드파이트대회;

class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            int tmp = food[i] / 2;

            while (tmp > 0) {
                answer += String.valueOf(i);
                tmp--;
            }

        }

        StringBuffer sb = new StringBuffer(answer).reverse();

        return answer + "0" + sb.toString();
    }
}
