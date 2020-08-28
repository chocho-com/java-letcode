package 初级算法.数组.删除排序数组中的重复项;

/**
 * int len = removeDuplicates(nums);
 *
 * 题目分析：
 * 题目需要实现两个步骤
 * （1）找到重复的元素
 * 遍历数组进行对比即可实现，这里的区别是，记录的标志是'重复的元素'还是'第一个不重复的元素'；
 * 显然，前一种是最容易想到的，但是时间复杂度较大。后者，可以时间复杂度较小。
 * （2）删除元素
 * 根据标志的意义不同，则删除方案也不同。
 * 第一种是将重复的删除，容易想到移动元素进行删除（传统的删除元素的办法），但是时间复杂度较高。
 * 第二种是将'第一个不重复的元素'移动到'开始重复'的第一个元素，可以大大降低时间复杂度。
 *
 * 解决方案：
 *（1）找到重复元素：遍历，记录'第一个不重复的元素'的位置
 * （2）删除元素：采用第二种方案
 */
public class Main {
    public static void main(String[] args) {
        int n[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicates(n);
        for(int i = 0; i < len; i++){
            System.out.print(n[i] + " ");
        }
    }

    /**
     * @param nums
     * @return
     */
    static int removeDuplicates(int []nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
