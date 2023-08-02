package level1.서울에서김서방찾기;

class Solution {
    public String solution(String[] seoul) {
        int count = 0;

        for (String s : seoul) {
            if (s.contains("Kim")) {
                break;
            }
            count++;
        }

        return "김서방은 " + count + "에 있다";
    }
}