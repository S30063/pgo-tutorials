import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Dzianis", "T", "S30063", "asf@gmail.com", "Ulryh");
//    s1.grades = new ArrayList<>();
//    s1.grades.add(3.5);
    s1.addGrade(new ArrayList<>(Arrays.asList(3.5, 4.5, 5.0)));


        Student s2 = new Student("Tom", "Shelby", "S30000", "sh@gmail.com", "Bingergham");
        s2.addGrade(new ArrayList<>(Arrays.asList(3.5, 4.5, 5.0)));

        StudentGroup group = new StudentGroup();
        group.nameGroup= "Shelby";

        group.addStudent(s2);
        s2.CalculateAverage();


    }
}