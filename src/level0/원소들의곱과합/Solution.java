class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int square = 1;
        
        for (int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            square *= num_list[i];
        }
        
        return (sum * sum) > square ? 1 : 0;
    }
}