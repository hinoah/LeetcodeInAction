package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode-cn.com/problems/subsets/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/7/28 下午2:38
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        // todo
        List<List<Integer>> subsets = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> base = new LinkedList<>();
            base.add(nums[i]);
            subsets.add(base);
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> subset = new LinkedList<>(base);
                subset.add(nums[i]);
                subsets.add(subset);
            }
        }
        return subsets;
    }

}
