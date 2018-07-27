package leetcode.easy;

/**
 * 136. Single Number
 *
 * @link https://leetcode.com/problems/single-number/description/
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2017/12/19 下午4:04
 */
public class SingleNumber {

    public Integer singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( 100 ^ 100 ^ 101 ^ 101);
    }


}




















//    public int climbStairs(int n) {

//    }