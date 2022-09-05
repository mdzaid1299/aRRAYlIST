import java.util.*;

public class Impl {
    public static void main(String[] args) {
        class StudentIMPL {
            public static void main(String[] args) {
                List<Student> studentList = Arrays.asList(new Student("AJ", 234),
                        new Student("Priya", 564),
                        new Student("Komal", 784),
                        new Student("Basu", 267), new Student("Arijit", 456));
                Comparator<Student> Comparator = (s1, s2) -> s2.getMarks() - s1.getMarks();
                studentList.sort(Comparator);
                for (Student name : studentList) {
                    System.out.println("name = " + name);
                }
                System.out.println("------------------------------------");
                Comparator<Student> comparator = (s1, s2) -> s1.getMarks() - s2.getMarks();
                studentList.sort(comparator);
                for (Student marks : studentList) {
                    System.out.println("marks = " + marks);
                }
            }
        }

    }
}