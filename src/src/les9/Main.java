package les9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static class Student {

        enum UniqueCourse {
            JAVA, DEVOPS, QA, IOS
        }

        private String name;
        private int age;
        private UniqueCourse course;
        private int uniqueCourse;


        public Student(String name, int age, UniqueCourse course, int uniqueCourse) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.uniqueCourse = uniqueCourse;
        }





    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Игорь", 22, Student.UniqueCourse.DEVOPS, 2));
        students.add(new Student("Алексей", 23, Student.UniqueCourse.JAVA, 1));
        students.add(new Student("Петр", 21, Student.UniqueCourse.QA, 3));
        students.add(new Student("Николай", 22, Student.UniqueCourse.QA, 3));
        students.add(new Student("Александр", 22, Student.UniqueCourse.QA, 3));
        students.add(new Student("Михаил", 21, Student.UniqueCourse.IOS, 2));



        Stream<Object> getAllUniqueCourses = students.stream().map(student -> student.course.name());
        getAllUniqueCourses.forEach(System.out::println);


        List<Integer> uniqueCourseOfStudent = students.stream()
                .filter(student -> student.course == student.course.QA)
                .map((Function<Student, Integer>) student -> student.uniqueCourse)
                .collect(Collectors.toList());
        System.out.println(uniqueCourseOfStudent);


        List<String> StudentGoTheUniqueCourse= students.stream()
                .filter(student -> student.course == Student.UniqueCourse.QA)
                .map((Function<Student, String>) student -> student.name)
                .collect(Collectors.toList());
        System.out.println(StudentGoTheUniqueCourse);













    }
}




