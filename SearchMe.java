
import java.util.Scanner;

public class SearchMe {
    public static void main(String[] args) {
        SearchMe search = new SearchMe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String lostStudent = sc.nextLine();

        boolean found = search.findStudentRecord(lostStudent);
        System.out.println("was the student: " + lostStudent + " found = " + found);
    }

    public boolean findStudentRecord(String lostStudent) {

        String[] students= this.getStudentList();
        for (String Student : students) {
            if (Student.equalsIgnoreCase(lostStudent))
                return true;

        }

        return false;
    }

    public String[] getStudentList() {

        String[] Students = {"Allen", "Bob", "Clara", "Davros", "Ethan", "Frank", "Goth", "Hank", "Ivan", "Jeremiah", "Kate"};
        for (String student : Students) {
            System.out.println("student= " + student);
        }
        return Students;
    }
}