import java.lang.reflect.Array;
import java.util.Arrays;

public class Deep {

    private int[] data;

    //method that takes in int array values makes a deep copy
    public Deep(int[] values) {
        // data deep object copy, assigns proper length
        data = new int[values.length];
        //goes through and assign the proper value to each place in data
        //this makes a full copy instead of just a refrence copy
        //this will make it so the inner properties are not affecting each other
        //in the event one is changed
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }

    //method to print the data
    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] values = {3,7,9};
        Deep deepCopy = new Deep(values);
        deepCopy.showData();
        //to show that change to original object will not affect deep copy
        values[0] = 13;
        deepCopy.showData();
    }

}
