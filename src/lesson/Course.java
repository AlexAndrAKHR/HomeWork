package lesson;

public class Course<team> extends Team{

    public Course(String surname, String name, String patronymic, int age, boolean goTheDistance) {
        super(surname, name, patronymic, age, goTheDistance);
    }

    public static void main(String[] args) {
        String[] course = new String[2];
        course[0] = "Run";
        course[1] = "Jump";

        for (int i = 0; i < 2; i++) {
            System.out.println(course[i]);
        }




    }





}
