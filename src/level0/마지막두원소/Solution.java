package level0.마지막두원소;

class Solution {
    public int[] solution(int[] num_list) {

        int newElement = num_list[num_list.length - 1] > num_list[num_list.length - 2]
                ? num_list[num_list.length - 1] - num_list[num_list.length - 2]
                : num_list[num_list.length - 1] * 2;

        int[] newArr = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, newArr, 0, num_list.length);
        newArr[newArr.length - 1] = newElement;

        return newArr;

    }
}