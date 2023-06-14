package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
     public  String toString(){
        return this.getTopic() + "is taught by" + this.getInstructor() + "and has the following students enrollrd:" +
                this.getEnrolledStudents();
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(topic, course.topic) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, enrolledStudents);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

}
