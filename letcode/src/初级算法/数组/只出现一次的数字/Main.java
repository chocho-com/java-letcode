package 初级算法.数组.只出现一次的数字;

/**
 * int singleNumber(int[] nums);
 *
 * 题目分析：
 * 由于对时间复杂度要求是O(1)，因此不能使用常规的遍历等方法，只能使用运算。
 * 分析题目，数字间关系只有两种情况：相同或者不同，在运算中，异或运算是可以
 * 判断两个数字是否相同的。再由公式推导，可以得到那个是只出现一次的数。
 */
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
