package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades property
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();
}
