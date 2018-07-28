package leetcode.easy;

/**
 * @link https://leetcode-cn.com/problems/to-lower-case/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/7/27 下午6:44
 */
public class ToLowerCase {

    public static String toLowerCase(String str) {
        // 换用 StringBuilder 去构造也可以，不过性能会差一些
        char[] lower = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            lower[i] = c;
        }
        return new String(lower);
    }

}
