import java.lang.reflect.Array;
import java.util.Arrays;

public class Deep {

    //instantiate int data array
    private int[] data;

    //method to make deep copy
    public Deep(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] values = {44,33,22};
        //new obj for deep copy and deep copy method called
        Deep deepCopy = new Deep(values);
        deepCopy.showData();
        //show that a change to original obj wont affect deep copy obj
        values[0] = 3314123;
        deepCopy.showData();
        System.out.println("Original after change: " + Arrays.toString(values));
    }

}

//    //instantiate data array to be used later
//    private int[] data;
//
//    //method to make the deep copy
//    public Deep(int[] values) {
//        //assign data array same length as values length
//        data = new int[values.length];
//        //go through values array and assign same values based on index to corresponding data array
//        for (int i = 0; i < values.length; i++) {
//            data[i] = values[i];
//        }
//    }
//
//        //method to show the data
//        public void showData() {
//            System.out.println(Arrays.toString(data));
//        }
//
//    public static void main(String[] args) {
//        int[] values = {3,7,8};
//        //make the deep copy by initializing new obj and calling the method
//        Deep deepCopy = new Deep(values);
//        //show the data
//        deepCopy.showData();
//        //show that change to original obj wont affect new one
//        values[0] = 23;
//        deepCopy.showData();
//    }
//
//
//
//    }



    /*
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
     */



