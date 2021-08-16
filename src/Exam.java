

public class Exam {

    private int count = 0;

    public static void main(String[] args){

        char[][] grid = new char[][]{ {'1', '1', '1', '1', '0'},
                                      {'1', '1', '0', '1', '0'},
                                      {'1', '1', '0', '0', '0'},
                                      {'0', '0', '0', '0', '0'}};
        Exam exam = new Exam();
        int i = exam.landsNum(grid);
        System.out.println(i);

    }

    public int landsNum(char[][] grid) {
        if(grid.length == 0 || grid[0].length ==0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count = 0;
                    toZero(grid,i,j,row,col,count);
                    //数量为8时加1
                    if (count == 8){
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private void toZero(char[][] grid,int i,int j,int row,int col,int count){

        if(i<0 || i>=row || j<0 || j>=col){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        count ++;
        grid[i][j]='0';
        toZero(grid,i+1,j,row,col,count);
        toZero(grid,i-1,j,row,col,count);
        toZero(grid,i,j+1,row,col,count);
        toZero(grid,i,j-1,row,col,count);
    }
}


