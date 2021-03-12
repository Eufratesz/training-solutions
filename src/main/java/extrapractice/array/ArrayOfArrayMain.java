package extrapractice.array;

public class ArrayOfArrayMain {

    public int[][]multiplicationTable(int size){
        int[][] table = new int[size][size];
        for(int i =0; i< size; i++){
            for (int j=0; i< size; i++){
                table[i][j] = (i+1)* (j+1);
            }
        }
        return table;

    }


}
