import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Tiempo");
        students.add("Aninon");
        students.add("Chesty");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        students.remove(0);
        System.out.println("===================");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
