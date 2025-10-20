class inv_ryt{
    public static void main(String args[]){
        int i,j,rows=5;
    /*  * * * * *
        * * * *
        * * *
        * *
        *
    */ 
        for (i=0;i<rows;i++){
            for (j=0;j<rows-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}