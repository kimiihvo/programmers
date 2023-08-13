package level1.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String[] sList = s.split(" ", -1);

        for (int j = 0; j < sList.length; j++) {

            String tmp = "";

            for (int i = 0; i < sList[j].length(); i++) {

                tmp += (i % 2 == 0 || i == 0) ? Character.toUpperCase(sList[j].charAt(i))
                        : Character.toLowerCase(sList[j].charAt(i));
            }

            sList[j] = tmp;
        }

        return String.join(" ", sList);
    }
}