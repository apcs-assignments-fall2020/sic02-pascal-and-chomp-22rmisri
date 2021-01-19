/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int [] [] mat = new int [n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0) {
                    mat[row][col] = 1;
                }
                if (col == row) {
                    mat[row][col] = 1;
                }
                else {
                    mat[row][col] = mat[row-1][col] + mat[row-1][col-1];
                }
            }
        }
        return mat;
    }
}
