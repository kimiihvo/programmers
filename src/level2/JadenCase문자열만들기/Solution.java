package level2.JadenCase문자열만들기;

class Solution {
    public String solution(String s) {

        String[] sList = s.split(" ", -1);

        for (int j = 0; j < sList.length; j++) {

            String[] ssList = sList[j].split("");

            for (int i = 0; i < ssList.length; i++) {
                if (i == 0) {
                    ssList[i] = ssList[i].toUpperCase();
                } else {
                    ssList[i] = ssList[i].toLowerCase();
                }
            }

            sList[j] = String.join("", ssList);
        }
        return String.join(" ", sList);
    }
}