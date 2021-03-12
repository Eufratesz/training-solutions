package extrapractice.array;

public class ArrayOfArrayMain {





    public int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; i++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;

    }




        public void printArrayOfArrays(int[][] a){
            for (int i[] : a) {
                for (int j : i) {
                    if (j < 10) {
                        System.out.print("  ");
                    } else if (j < 100) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        ArrayOfArrayMain am = new ArrayOfArrayMain();

        am.printArrayOfArrays(am.multiplicationTable(4));
    }


    }
