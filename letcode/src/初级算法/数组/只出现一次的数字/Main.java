package 初级算法.数组.只出现一次的数字;

public class Main {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}
