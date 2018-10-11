import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCollection {
    ArrayList<Integer> myList = new ArrayList<>();
    private int[] array = new int[1];
    private boolean isEmpty = true;


    public void addElement(int element) {
        if (isEmpty) {
            array[0] = element;
            isEmpty = false;
        } else {
            int[] array = new int[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++) {
                array[i] = this.array[i];
            }
            array[array.length - 1] = element;
            this.array = array;
        }
    }

    public void addElement(int index, int element){
        if (index < array.length){
            int[] firstPart = new int[index];
            int[] lastPart = new int[array.length - index];
            for (int i = 0; i < index; i++){
                firstPart[i] = array[i];
            }

            System.out.println("first part " + Arrays.toString(firstPart));

            for (int i = index; i < array.length; i++){
                lastPart[i-index] = array[i];
            }

            System.out.println("last part " + Arrays.toString(lastPart));

            System.out.println(array.length);
            System.out.println(firstPart.length);
            System.out.println(lastPart.length);

            for (int i:firstPart) {
                System.out.print(i + "  ");
            }
            System.out.println();

        } else System.err.println("Index out of bounds");
    }

//        System.out.println();
//        System.out.println("Array " + array.length);
//        for (int i : array) {
//            System.out.print(i + "  ");
//        }
//        System.out.println();

//        this.array = array;


//        array[this.array.length] = element;
//        System.out.println(this.array.length);
//        System.out.println(array.length);

    public void displayAll(){
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.print("\n");
    }
}
