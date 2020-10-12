import java.util.*;

public class TwoD_array {
    public static void main(String[] args) {
        Random rand = new Random();// initialization and Instantiation
        int num_of_students = 5;
        int[][] scores = new int[num_of_students][3];

        for (int i = 0; i < num_of_students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < num_of_students; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}