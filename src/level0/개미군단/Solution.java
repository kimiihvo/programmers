package level0.개미군단;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int power = 5;
        
        while (hp != 0){
            answer += hp / power;
            hp %= power;
            power -= 2;
        }
        
        return answer;
    }
}