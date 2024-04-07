public class StudentGroup {
    public String nameGroup;
    public int maxNumOfStudents = 15;
    public Student[] studentsGroup;
    public static int numOfAssignedStudents = 0;


    public void addStudent(Student student){
        if (studentsGroup==null){
            studentsGroup = new Student[maxNumOfStudents];
        }

        if (numOfAssignedStudents+1>maxNumOfStudents){
            throw new IllegalArgumentException("This group is full and already has 15 students.");
        }

        studentsGroup[numOfAssignedStudents] = student;
        numOfAssignedStudents++;

        for (int i = 0; i < numOfAssignedStudents; i++) {
            if (studentsGroup[i]==studentsGroup[i+1]) {
                throw new IllegalArgumentException("You can't add the same student twice.");
            }
        }


    }


}
