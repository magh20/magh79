import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.name[0] = "Advanced Programming";
        course.unit[0] = 3;
        course.pish[0] = "Basic Programming";
        course.ham[0] = "Advanced Programming Workshop";
        course.name[1] = "Advanced Programming Workshop";
        course.unit[1] = 1;
        course.pish[1] = "Basic Programming Workshop";
        course.ham[1] = "Advanced Programming";
        course.name[2] = "Physics 2";
        course.unit[2] = 3;
        course.pish[2] = "Math 1";
        course.name[3] = "Math 2";
        course.unit[3] = 3;
        course.pish[3] = "Math 1";
        course.name[4] = "General English";
        course.unit[4] = 3;
        course.pish[4] = "Pre English";
        course.name[5] = "andishe 1";
        course.unit[5] = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String tmp = input.nextLine();
        for (int i=0 ; i<6 ; i++) {
            if (tmp.equals(course.name[i])) {
                System.out.print("Units: " + course.unit[i] + "\nPishniaz: " + course.pish[i] + "\nHamniaz: " + course.ham[i]);
                break;
            }
        }
    }
}
