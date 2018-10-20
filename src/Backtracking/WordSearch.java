package Backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                if (exist(board, w, row, col, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, char[] word, int row, int col, int i){
        if (i == word.length)
            return true;
        if(row < 0 || col < 0 || row == board.length || col == board[row].length)
            return false;
        if (board[row][col] != word[i])
            return false;
        board[row][col] ^= 256;
        boolean exist = exist(board, word, row, col+1, i+1) ||
                        exist(board, word, row, col-1, i+1) ||
                        exist(board, word, row-1, col, i+1) ||
                        exist(board, word, row+1, col, i+1);
        board[row][col] ^= 256;
        return exist;
    }

    public static void main(String[] args) {
        char[][] chars = new char[2][3];
        System.out.println(chars.length);
        System.out.println(chars[0].length);
        System.out.println('Z');
        System.out.println((char)('Z' ^ 256));
        System.out.println((char)('Z' ^ 256 ^ 256));
    }
}
