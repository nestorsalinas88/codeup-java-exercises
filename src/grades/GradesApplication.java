package grades;

import util.Input;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;

public class GradesApplication {
    private static Input input = new Input();
    private static  HashMap<String, Student> students;


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
