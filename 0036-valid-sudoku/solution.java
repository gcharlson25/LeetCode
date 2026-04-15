class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] colSet = new HashSet[9];
        HashSet<Character>[] cubeSet = new HashSet[9]; 
        for(int i = 0; i<9; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            cubeSet[i] = new HashSet<>();
        }
        for(int row = 0; row<board.length; row++) {                       
            for(int col = 0; col<board[0].length; col++) {
                if(board[row][col] == '.' || board[row][col] == ',') {
                    continue;
                }
                if(rowSet[row].contains(board[row][col]) || colSet[col].contains(board[row][col]) || cubeSet[(row/3)*3 + col/3].contains(board[row][col])) {
                    return false;
                }
                else {
                    rowSet[row].add(board[row][col]);
                    colSet[col].add(board[row][col]);                    
                    cubeSet[(row/3)*3 + col/3].add(board[row][col]);
                }
            }
        }
        return true;        
               

    }
}
