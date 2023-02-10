package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.*;

class Student {
    private final String name;
    private final int age;
    private final Double gpa;

    Student(String name, int age, Double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public Double getgpa() {
        return gpa;
    }

}
public class StudentTest implements Comparator<Student>{
    public int compare(Student a,Student b){
        return b.getgpa().compareTo(a.getgpa());
    }
    public static void main(String[] args) {
        Logger l= Logger.getLogger("com.api.jar");
        Student s1 = new Student("arun", 20, 4.0);
        Student s2 = new Student("vino", 20, 3.5);
        Student s3 = new Student("bala", 20, 4.5);
        ArrayList<Student> lst = new ArrayList<>();
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        l.info("Students List");
        for (Student st : lst) {
            l.log(Level.INFO,() ->st.getname() + " " + st.getage() + " " + st.getgpa());

        }
        lst.sort(new StudentTest());
        l.info("Students List ordered by Grade from highest to lowest");
        for (Student st : lst) {
            l.log(Level.INFO ,() ->st.getname()+ "\t" +st.getgpa());


        }
    }
}
