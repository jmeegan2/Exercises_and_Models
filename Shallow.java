import java.lang.reflect.Array;
import java.util.Arrays;

public class Shallow {

    public static int[] data;

    public Shallow(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    //Driver
    public static void main(String[] args) {
        int[] values = {3,7,9};
        Shallow shallowCopy = new Shallow(values);
        shallowCopy.showData();
        values[0] = 3213434;
        shallowCopy.showData();



//        //code from top of head under 5 mins to make one mistake which was not passing values in method parameter
//
//    //int array declared
//    static private int[] data;
//
//    //shallow copy method
//    public Shallow(int[] values){
//        data = values;
//    }
//
//    public void showData() {
//        System.out.println(Arrays.toString(data));
//    }
//
//    public static void main(String[] args) {
//        int[] values = {22,2,4};
//        Shallow shallowCopy = new Shallow(values);
//        shallowCopy.showData();
//        values[0] = 13;
//        shallowCopy.showData();
//    }
//









//    //instantiate a int data array variable
//   static private int data[];
//
//    // actually shallow copy method
//   public Shallow(int[] values) {
//        data = values;
//    }
//
//
//    //method to show data
//    public void showData() {
//        System.out.println(Arrays.toString(data));
//    }
//
//    public static void main(String[] args) {
//        int[] values = {1,2,3};
//        Shallow shallowCopy = new Shallow(values);
//        shallowCopy.showData();
//        values[0] = 13;
//        shallowCopy.showData();
//
//    }



/*


    //Shallow copy example

    // integer array data declared
    static private int[] data;

    //method that takes an integer array of variables and has data copy it
    public Shallow(int[] values) {
        data = values;
    }



    //Method to show the data
    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] values = {3,7,9};
        System.out.println("Original: " + values);
        //New object e in this case is copying values int array to data.
       Shallow shallowCopy = new Shallow(values);
        shallowCopy.showData();
        //showing that a change to int value array will affect the data
        values[0] = 13;
        shallowCopy.showData();

    }

 */
 }}
