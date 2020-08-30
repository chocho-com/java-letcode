package 初级算法.数组.存在重复元素;

import java.util.HashSet;
import java.util.Set;

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
