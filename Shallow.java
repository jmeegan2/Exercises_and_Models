

import java.util.Arrays;

public class Shallow {

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
 }
