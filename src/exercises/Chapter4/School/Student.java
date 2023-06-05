package exercises.Chapter4.School;

public class Student {
    private static int nextStudentID = 1;
    private String name;
    private  int studentID;
    private int numberOfCredits;
    private double gpa;
    public  Student(String name, int studentID,int numberOfCredits,double gpa) {
        this.name = name;
        this.studentID =studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public Student (String name, int studentID){
        this(name,studentID,0,0);
    }
    public Student(String name){
        this(name,nextStudentID);
        nextStudentID++;

    }
    public String studentInfo(){
        return (this.name + "has a GPA of: " + this.gpa);
    }

public String getName(){
    return name;
}
public void setName(String aName){
    name = aName;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int aStudentID){
        studentID = aStudentID;
    }
    public int getNumberOfCredits(){
        return  numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double aGpa){
        gpa = aGpa;
    }
}
