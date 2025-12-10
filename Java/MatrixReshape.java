public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((m*n)!=(r*c)) return mat;

        int temp[] = new int[m*n];
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                temp[count++] = mat[i][j];
            }
        }
        count = 0;
        int ans[][] = new int[r][c];
        for(int i=0; i < r; i++){
            for(int j=0; j < c; j++){
                ans[i][j] = temp[count++];
            }
        }
        return ans;
    }
}
