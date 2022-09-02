import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<Integer> studentSort = Arrays.asList(7,3,2,8,6,9,1,3);
        System.out.println(studentSort);
        Collections.sort(studentSort);
        System.out.println(studentSort);
    }
}

