package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {


private String name;
private ArrayList<Integer> grades;
private double average;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }


    public double getGradeAverage() {
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void showAllGrades() {
        for(int grade : grades) {
            System.out.print(grade + "\t");
        }
    }

    public String toString() {
        return name + " earned an average grade of " + getGradeAverage() + ".";
    }

}
