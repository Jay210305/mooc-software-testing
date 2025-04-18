package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

//    public void find(int[] nums) {
//        for(int n : nums) {
//
//            if(n < smallest)
//                smallest = n;
//            else if (n > largest)
//                largest = n;
//
//        }
//    }

    public void find(int[] nums) {
        for(int n : nums) {
            if(n < smallest)
                smallest = n;
            if(n > largest)  // <-- Se cambia 'else if' por 'if'
                largest = n;
        }
    }


    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
