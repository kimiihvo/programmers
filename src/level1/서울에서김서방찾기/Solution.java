package level1.���￡���輭��ã��;

class Solution {
    public String solution(String[] seoul) {
        int count = 0;

        for (String s : seoul) {
            if (s.contains("Kim")) {
                break;
            }
            count++;
        }

        return "�輭���� " + count + "�� �ִ�";
    }
}