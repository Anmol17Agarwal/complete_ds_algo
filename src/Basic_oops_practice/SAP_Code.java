package Basic_oops_practice;


class SAP_Code
{
    public static int[] cellCompete(int[] cells, int days)
    {
        int oldCell[]=new int[cells.length];
        for (Integer i = 0; i < cells.length ; i++ ){
            oldCell[i] = cells[i];
        }
        for (Integer k = 0; k < days ; k++ ){
            for (Integer j = 1; j < oldCell.length - 1 ; j++ ){
                if ((oldCell[j-1] == 1 && oldCell[j+1] == 1) || (oldCell[j-1] == 0 && oldCell[j+1] == 0)){
                    cells[j] = 0;
                } else{
                    cells[j] = 1;
                }

            }
            if (oldCell[1] == 0){
                cells[0] = 0;
            } else{
                cells[0] = 1;
            }
            if (oldCell[6] == 0){
                cells[7] = 0;
            } else{
                cells[7] = 1;
            }
            for (Integer i = 0; i < cells.length ; i++ ){
                oldCell[i] = cells[i];
            }
        }
        return cells;
    }

    public static void main(String[] args) {
        int days=2;
        int cells[]={1,1,1,0,1,1,1,1};
        cellCompete(cells,days);
        for (int i = 0; i < cells.length ; i++) {
            System.out.print(cells[i]+" ");
        }
    }
}