package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student shawn = new Student("Shawn");
        shawn.addGrade(100);
        shawn.addGrade(90);
        shawn.addGrade(98);
        Student wilson = new Student("Wilson");
        wilson.addGrade(66);
        wilson.addGrade(70);
        wilson.addGrade(77);
        Student jason = new Student("Jason");
        jason.addGrade(80);
        jason.addGrade(70);
        jason.addGrade(83);

        students.put("sb-son", shawn);
        students.put("wil-son", wilson);
        students.put("json", jason);

        Input in = new Input();
        String userIn;
        System.out.println("Welcome!\nHere are the Github usernames of our students:\n");

        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
                System.out.print("|" + entry.getKey() + "| ");
        }
        System.out.println();

        do {
            System.out.println("What student would you like to see more information on?");
            userIn = in.getString();
            if (students.containsKey(userIn)) {
                System.out.printf("Student name: \"%s\";%nStudent Github Username: \"%s\";%nStudent GPA: %.2f;%n", students.get(userIn).getName(), userIn, students.get(userIn).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the Github username of %s", userIn);
            }
//            for (HashMap.Entry<String, Student> entry : students.entrySet()) {
//                if (userIn.equals(entry.getKey()) || userIn.equals(entry.getValue().getName().toLowerCase())) {
//                    System.out.println(entry.getKey() + " | " + entry.getValue().getName());
//                }
//            }
            System.out.println("Would you like to see another student?");
        } while (in.yesNo());
    }
}
