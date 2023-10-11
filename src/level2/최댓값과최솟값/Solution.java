package level2.ÃÖ´ñ°ª°úÃÖ¼Ú°ª;

class Solution {
    public static String solution(String s) {
        String[] sList = s.split(" ");
        int[] iList = new int[sList.length];
        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < sList.length; i++) {
            iList[i] = Integer.parseInt(sList[i]);
            max = Math.max(max, iList[i]);
            min = Math.min(min, iList[i]);
        }

        return String.valueOf(min) + " " + String.valueOf(max);
    }
}