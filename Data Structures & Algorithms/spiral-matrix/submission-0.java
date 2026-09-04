class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0) return ans;
        int rowLower = 0;
        int rowUpper = matrix.length-1;
        int colLower = 0;
        int colUpper = matrix[0].length-1;
        while(rowLower <= rowUpper && colLower <= colUpper) {
            for(int i = colLower; i <= colUpper; i++) {
                ans.add(matrix[rowLower][i]);
            }
            rowLower++;
            for(int i = rowLower; i <= rowUpper; i++) {
                ans.add(matrix[i][colUpper]);
            }
            colUpper--;
            if(rowLower > rowUpper || colLower > colUpper) {
                break;
            } 
            for(int i = colUpper; i >= colLower; i--) {
                ans.add(matrix[rowUpper][i]);
            }
            rowUpper--;
            for(int i = rowUpper; i >= rowLower; i--) {
                ans.add(matrix[i][colLower]);
            }
            colLower++;
        }
        return ans;
    }
}
