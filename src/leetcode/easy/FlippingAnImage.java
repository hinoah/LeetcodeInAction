package leetcode.easy;

/**
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 *
 * @link https://leetcode-cn.com/problems/flipping-an-image/description/
 * @date 2018/8/4 下午2:16
 */
public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] temp = new int[A[i].length];
            for (int j = 0; j < temp.length; j++) {
                temp[temp.length - 1 - j] = A[i][j];
            }
            A[i] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] ^ 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipAndInvertImage(A);
    }

}
