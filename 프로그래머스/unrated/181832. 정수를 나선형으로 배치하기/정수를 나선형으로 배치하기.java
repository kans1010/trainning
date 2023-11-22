class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        int rotate = 0;
        
        while(num<=n*n){
            answer[row][col] = num++;
            if(rotate == 0){
                if (col == n-1 || answer[row][col+1] != 0){
                    rotate = 1; row++;
                }else{
                    col++;
                }
            }else if(rotate == 1){
                if (row == n-1 || answer[row+1][col] != 0){
                    rotate = 2; col--;
                }else{
                    row++;
                }
            }else if(rotate == 2){
                if (col==0 || answer[row][col-1] != 0){
                    rotate = 3; row--;
                }else{
                    col--;
                }
            }else if(rotate == 3){
                if (row==0 || answer[row-1][col] != 0){
                    rotate = 0;col++;
                }else{
                    row--;
                }
            }
        }
        return answer;
    }
}