import java.util.ArrayList;

public class Student {
//    public String fname;
//    public String Iname;
//    public String indexNumber;
//    public String email;
//    String address;
   ArrayList<Double> grades;

    public Student(String fname, String Iname, String indexNumber, String email, String address){
        this.grades = new ArrayList<>();

    }




    public void addGrade ( ArrayList<Double> grades) throws IllegalArgumentException, Exception {



            if (grades.isEmpty()){
                throw new IllegalArgumentException("Please, provide grades");
            }
            if (grades.size()>20){
                throw new Exception("You can't add more than 20 grades in the list");
            }
            for (Double grade : grades){

            if ((grade < 2) || (grade > 5)) {
                throw new IllegalArgumentException("The grade has to be a number between 2 and 5");
            }
                this.grades.add(grade);


//            grades.add(grade);
        }






//        if (this.grades.size() > 20){
//            throw new Exception("Size is too big");
//        }
//        if (grade < 2 || grade > 5) {
//            throw new IllegalAccessException("Please pass a grade between 2 and 5");
//        }
//        grades.add(grade);
    }

    public double CalculateAverage (){
        int sum = 0;
        int count = 0;
        double average;
        grades.addAll(grades);
        for (Double grade: grades){

            sum += grade;
            count++;


        }
        average = sum/count;


        return average;
    }



}
