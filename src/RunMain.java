import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        int nc;
        String sea;
        String next;

        System.out.printf("1. Input student\n" +
                "2. Show all list student .\n" +
                "3. Displays the average score of the gradual list of students\n" +
                "4. Search course of all student\n" +
                "5. Search and show id of a student\n" +
                "6. Exit\n");

        while (true) {
            System.out.printf("Enter the option: \n");
            nc = scanner.nextInt();
            switch (nc) {
                case 1:
                    do {
                        Student st = new Student();
                        st.inputStudent();
                        studentList.add(st);
                        do {
                            System.out.print("Enter a next Student(Y/N)?: ");
                            next = scanner.next().trim();
                            next = next.toLowerCase();
                        } while (!((next.equals("y")) || (next.equals("n"))));


                    } while (next.equals("y"));
                    break;

                case 2:
                    for (Student student : studentList)
                        student.printStudent();
                    break;

                case 3:
                    System.out.printf("Displays the average score of the gradual list of students: ");
                    for (Student student : studentList)
                        System.out.printf(student.getCourse() + "/n");
                    break;

                case 4:
                    System.out.printf("Search course of all student: ");
                    sea = scanner.next().trim();

                    for (Student student : studentList)
                        if (sea.equals(student.getCourse()))
                            student.printStudent();
                    break;

                case 5:
                    sea = null;
                    System.out.printf("Search course of all student: ");
                    sea = scanner.next().trim();

                    for (Student student : studentList)
                        if (sea.equals(student.getId()))
                            student.printStudent();
                    break;

                default:
                    System.out.println("Thanh you.");
            }

            if (nc > 5)
                break;
        }
    }

}
