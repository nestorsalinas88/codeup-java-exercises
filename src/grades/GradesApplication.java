package grades;

import util.Input;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;

public class GradesApplication {
    private static Input input = new Input();
    private static  HashMap<String, Student> students;



    public static void main(String[] args) {
        System.out.println("Welcome to the Grades Application");
        students = getStudents();

        do {
            showStudents(students);

            System.out.println("Enter the name for student's grades ");
            String choice = input.getString();

            if (students.containsKey(choice)){
                Student student = students.get(choice);
                System.out.println(student);

                promptForGradeDetail(student);


            } else {
                System.out.println(choice + " was not found in our system.");
                promptToAddNewStudent();
            }


        } while (input.yesNo("Would you like info on differnt student? press y/n"));

        if (input.yesNo("See all ? y/n ")){
            showAllStudentsAndGrades(students);
        }
        System.out.println("ADIOS");
    }
    protected static void showAllStudentsAndGrades(HashMap<String, Student> students) {
        students.forEach((key, student) -> {
            System.out.println(key + "'s" + " grade average is a " + student.getGradeAverage());
        });
    }
    protected static void promptToAddNewStudent() {
        System.out.println("Would you like to add a new student?");

        if(input.yesNo("Press y or yes")) {
            addStudent(); // addStudent makes a new student object and adds it to the HashMap
        }
    }


    protected static void promptForGradeDetail(Student student) {
        if(input.yesNo("Would you like to see all their grades? Yes or y to continue.")) {
            student.showAllGrades();
        }
    }
    protected static Student makeStudent() {
        String name = input.getString("What is the student's name? ");

        Student student = new Student(name);

        int grade;

        do {
            System.out.println("Input a grade for the student");

            grade = input.getInt();

            student.addGrade(grade);

        } while(input.yesNo("Do you want to add more grades for " + name + "?"));

        return student;
    }



    protected static void addStudent() {
        String username = input.getString("What is the student's GitHub username?");

        Student student = makeStudent();

        students.put(username, student); // add the student object w/ their username key to the students HashMap.

    }

    protected static void showStudents(HashMap<String, Student> students){
        for (String student : students.keySet()){
            System.out.println(" | " + student);
        }
    }

    protected static HashMap<String, Student> getStudents(){
        HashMap<String, Student> students = new HashMap<>();


        Student nestor = new Student("Nestor");
        nestor.addGrade(100);
        nestor.addGrade(90);
        nestor.addGrade(95);


        Student monica = new Student("Monica");
        monica.addGrade(90);
        monica.addGrade(99);
        monica.addGrade(100);


        Student ryan = new Student("Ryan");
        ryan.addGrade(50);
        ryan.addGrade(50);
        ryan.addGrade(50);

        students.put("noob-developer", nestor);
        students.put("awesome-peer", monica);
        students.put("cool-instructor", ryan);

        return students;
    }


}
