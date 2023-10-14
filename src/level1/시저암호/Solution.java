package level1.시저암호;

class Solution {
    public String solution(String s, int n) {
        char[] cList = s.toCharArray();

        for (int i = 0; i < cList.length; i++) {

            if (cList[i] == 32) {
                continue;
            }

            cList[i] += n;

            // A - Z : 65 - 90, a - z : 97 - 122
            if (Character.isUpperCase(s.charAt(i)) && cList[i] > 90
                    || (Character.isLowerCase(s.charAt(i)) && cList[i] > 122)) {
                cList[i] -= 26;
            }
        }

        return new String(cList);
    }
}