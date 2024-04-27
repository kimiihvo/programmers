package level0.문자열바꿔서찾기;

class Solution {
    public int solution(String myString, String pat) {
        String[] strList = myString.split("");

        for (int i = 0; i < strList.length; i++) {
            strList[i] = strList[i].equals("A") ? "B" : "A";
        }

        return String.join("", strList).contains(pat) ? 1 : 0;
    }
}