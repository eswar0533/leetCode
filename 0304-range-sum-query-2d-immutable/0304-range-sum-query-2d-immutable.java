class NumMatrix {
    int[][] ans;
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        ans = new int[r+1][c+1];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                ans[i+1][j+1] = matrix[i][j]+ans[i][j+1]+
                                ans[i+1][j]-ans[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return ans[row2+1][col2+1]-ans[row1][col2+1]-ans[row2+1][col1]+ans[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */