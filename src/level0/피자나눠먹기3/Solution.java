package level0.���ڳ����Ա�3;

class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : (int) Math.ceil(n / slice) + 1;
    }
}