package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
private String name;
private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);

    }
    // returns the average of the students grades
    public int getGradeAverage(){
    this.grade.size();

    int sum = 0;

    for(int item: grade){
        sum += item;
    }

    return (int) (sum / this.grade.size());
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("Nestor", new Student("Nesto"));
        System.out.println(students);

        students.get("Nestor").addGrade(95);
        students.get("Nestor").addGrade(5);
        students.get("Nestor").addGrade(20);

    }
}
