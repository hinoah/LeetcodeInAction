package leetcode.easy;

/**
 * 70. Climbing Stairs

 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2017/12/19 下午5:21
 */
public class ClimbingStairs {

    public int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return f(n-1) + f(n-2);
    }

}
