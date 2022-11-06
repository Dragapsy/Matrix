public class SquareMatrix {

    int dimension;
    int[][] matrix;
    int firstRow, lastRow;
    int firstColumn, lastColColumn;

    public SquareMatrix(int i,int lineOne,int lineLast,int columnOne,int [][] matrix) {
        firstRow=lineOne;
        lastRow =lineLast;
        firstColumn=columnOne;
        lastColColumn =columnOne+lineLast-lineOne;
        this.dimension = i;
        this.matrix = matrix;
    }

    public int getMatrixDimension() {
        return dimension;
    }

    public int get(int row,int col){
        return matrix[firstRow+row][firstColumn+col];
    }
    public void set(int row,int col,int value){
        matrix[firstRow+row][firstColumn+col]=value;
    }

    public int getSubMatrixDimension(){
        return lastRow-firstRow+1;
    }

    public void sum(SquareMatrix matx){
        int sumd = getMatrixDimension();
        for(int i=0;i<sumd;i++){
            for(int j=0;j<sumd;j++){
                set(i,j,get(i,j)+matx.get(i,j));
            }
        }
    }


}
