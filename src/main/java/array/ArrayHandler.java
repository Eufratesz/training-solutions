package array;

public class ArrayHandler {


    public boolean contains(int[] source, int itemToFind) {
        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }


    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int [] favouriteNumbers = {8, 7, 21, 13};

        System.out.println("Contains? " + arrayHandler.contains(favouriteNumbers, 13));
        System.out.println("Contains? " +  arrayHandler.contains(favouriteNumbers, 10));

        System.out.println();

        System.out.println("Index: ");
        System.out.println(arrayHandler.find(favouriteNumbers, 13));
        System.out.println(arrayHandler.find(favouriteNumbers, 20));

    }
}




