import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] myInput = { 1, 2, 4, 3, 5 };
        int iteration_ctr = 1;
        System.out.println("Before:");
        System.out.println(Arrays.toString(myInput));
        for (int i = 0; i < myInput.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < myInput.length - 1; j++) {
                if (myInput[j] > myInput[j + 1]) {
                    // swap
                    int temp = myInput[j];
                    myInput[j] = myInput[j + 1];
                    myInput[j + 1] = temp;
                    isSorted = false;
                }
                iteration_ctr++;
            }
            if(isSorted==true) break;
        }
        System.out.println("After:");
        System.out.println(Arrays.toString(myInput));
        System.out.println("Total iterations: "+iteration_ctr);
    }
}
