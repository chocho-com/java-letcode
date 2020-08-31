package 初级算法.数组.存在重复元素;

import java.util.HashSet;
import java.util.Set;

/**
 * boolean containsDuplicate(int[] nums);
 *
 * 题目分析：
 * 判断是否有重复的（出现两次以上）的元素，只需要检查元素是否出现2次即可。
 * 基本思路是遍历整个数组，将第一次出现的值加入到另一个集合中，若值已经存在，则存在重复元素。
 * 需要注意的是：这里使用ArrayList会超时，导致时间复杂度为O(n^2)，不满足题意；使用HashSet即可满足。
 */
public class Main {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Set map = new HashSet();
        for(int i = 0; i < nums.length;i++){
            if(map.contains(nums[i])){
                return true;
            }else{
                map.add(nums[i]);
            }
        }
        return false;
    }
}
