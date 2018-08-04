package leetcode.easy;

/**
 * @link https://leetcode-cn.com/problems/flipping-an-image/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/8/4 下午2:16
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = A;
        for (int i = 0; i < A.length; i++) {
            int[] temp = new int[A[i].length];
            for (int j = 0; j < temp.length; j++) {
                temp[temp.length - 1 - j] = A[i][j];
            }
            B[i] = temp;
        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = B[i][j] ^ 1;
            }
        }
        return B;
    }

}
