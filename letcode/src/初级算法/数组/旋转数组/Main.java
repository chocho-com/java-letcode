package 初级算法.数组.旋转数组;

/**
 * void rotate(int[] nums, int k);
 *
 * 题目分析：
 * 即移动数组元素，需要注意当元素超出数组长度，则从数组0号元素开始继续移动。
 * 题目利用数学知识的mod实现这个逻辑。
 */
public class Main {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        int newNums[] = new int[nums.length];//新数组

        for(int i = 0; i < nums.length; i++){
            int j = (i+k)%nums.length;
            newNums[j] = nums[i];
        }
        for(int i = 0; i < newNums.length; i++){
            nums[i] = newNums[i];
        }
    }
}
