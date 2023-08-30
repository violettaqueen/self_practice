package generics.review;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", 101));
        students.add(new Student("Jon", 102));
        students.add(new Student("Alex", 103));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Anna", 201));
        teacherList.add(new Teacher("Kate", 202));
        print(students);
        printInfo(students);

    }

    public static void print(List<Student> studentList) {

        studentList.forEach(student -> System.out.println(student.getName() + "-" + student.getId()));
        int studentCount = studentList.size();
        System.out.println(studentCount);
    }
    public static <T> void printInfo(List<T> list){

        for (T items : list){
            System.out.println(items);
        }
        System.out.println(list.size());
    }
}
