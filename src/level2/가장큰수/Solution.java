package level2.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static String solution(int[] numbers) {

        String[] stringArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            stringArray[i] = String.valueOf(numbers[i]);
        }

        Comparator<String> customComparator = (str1, str2) -> (str2 + str1).compareTo(str1 + str2);

        Arrays.sort(stringArray, customComparator);

        return stringArray[0].equals("0") ? "0" : String.join("", stringArray);
    }
}
