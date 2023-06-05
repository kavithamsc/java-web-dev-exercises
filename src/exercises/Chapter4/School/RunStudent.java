package exercises.Chapter4.School;

import exercises.Chapter4.School.Student;

public class RunStudent {
    public static void main(String[] args){
        Student myStudent = new Student("Kavi",1, 1, 4.0 );
        System.out.println(myStudent.getName());
        System.out.println(myStudent.getStudentID());
        System.out.println(myStudent.getNumberOfCredits());
        System.out.println(myStudent.getGpa());
    }
}
