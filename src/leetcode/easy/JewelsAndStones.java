package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode-cn.com/problems/jewels-and-stones/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/7/27 下午4:18
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int jLength = J.length();
        int sLength = S.length();
        int jewelNum = 0;
        Map<Character, Integer> stoneMap = new HashMap<>();
        for (int i = 0; i < jLength; i++) {
            char j = J.charAt(i);
            if (!stoneMap.containsKey(j)) {
                stoneMap.put(j, 1);
            }
        }
        for (int k = 0; k < sLength; k++) {
            char s = S.charAt(k);
            if (stoneMap.containsKey(s)) {
                jewelNum++;
            }
        }
        return jewelNum;
    }

}
