public class BallFall{
    static int[] ballFall(int mat[][]){
        int row = mat.length, col = mat[0].length;
        int res[]=new int[col];
        for(int i=0;i<col;i++){
        int j=0;
        int k=i;
        boolean check = false;
        while(j<row && k<col){
            if(mat[j][k]==1){
                if((k<col-1 && mat[j][k+1]==-1 ) || k==col-1){
                    check = true;
                    break;
                }
                j++;
                k++;

            }
            
            else{
                if((k>0 && mat[j][k-1]==1) || k==0 ){
                    check = true;
                    break;
                }
                j++;
                k--;
    
            }
        }
        if(check== false){
            res[i]=k;

        }else{
            res[i]=-1;

        }
    }

        return res;
    }
    public static void main(String[] args) {
      // int mat[][]={{1,1,1,-1,-1},{1,1,1,-1,1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
       int mat[][]=new int[][]{{-1}};

       int res[]=ballFall(mat);
       for(int i=0;i<mat[0].length;i++){
        System.out.print(res[i]+" ");

       }
    }
}
