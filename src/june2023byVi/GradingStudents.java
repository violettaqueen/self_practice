package june2023byVi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>(Arrays.asList(73,67,38,33));
        gradingStudents(grades);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) >= 0 && grades.get(i) <= 100) {

                if (grades.get(i) < 38) {
                    grades.set(i, grades.get(i));
                }
                else if ((grades.get(i) + 1) % 5 == 0) {
                    grades.set(i, grades.get(i) + 1);
                } else if ((grades.get(i) + 2) % 5 == 0) {
                    grades.set(i, grades.get(i) + 2);
                }
            }
        }
        return grades;
    }

}



