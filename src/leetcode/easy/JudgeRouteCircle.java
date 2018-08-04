package leetcode.easy;

/**
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 *
 * @link https://leetcode-cn.com/problems/judge-route-circle/description/
 * @date 2018/8/4 下午1:56
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        // 分别记录横轴和纵轴的偏移量
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'R') {
                x++;
                continue;
            }
            if (move == 'L') {
                x--;
                continue;
            }
            if (move == 'U') {
                y++;
                continue;
            }
            if (move == 'D') {
                y--;
                continue;
            }

        }
        return x == 0 && y == 0;
    }

}
