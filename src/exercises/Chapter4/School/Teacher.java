package exercises.Chapter4.School;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearTeaching;
     public Teacher(String firstName,String lastName,String subject,int yearTeaching){
         this.firstName = firstName;
         this.lastName = lastName;
         this.subject = subject;
         this.yearTeaching = yearTeaching;
     }
     public String getFirstName(){
         return firstName;
     }
     private void setFirstName(String aFirstName){
         this.firstName = aFirstName;
     }
     public String getLastName(){
         return lastName;
     }
     public void setLastName(String aLastName){
         this.lastName = aLastName;
     }
     public String getSubject(){
         return subject;
     }
     public void setSubject(String aSubject){
         this.subject = aSubject;
     }
     public int getYearTeaching(){
         return yearTeaching;
     }
     public void setYearTeaching(int aYearTeaching){
         this.yearTeaching = aYearTeaching;
     }
    }


