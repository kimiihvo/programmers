package level0.외계행성의나이;

class Solution {
    public String solution(int age) {
        char[] arr = String.valueOf(age).toCharArray();
        StringBuilder answerBuilder = new StringBuilder();
        
        char alphabet;
        
        for (char ch : arr){
            alphabet = (char) (97 + Character.getNumericValue(ch));
            answerBuilder.append(alphabet);
        }
        
        return answerBuilder.toString();
    }
}
