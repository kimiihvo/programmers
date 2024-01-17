package level0.ÇÇÀÚ³ª´²¸Ô±â3;

class Solution {
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : (int) Math.ceil(n / slice) + 1;
    }
}