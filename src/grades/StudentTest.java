package grades;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Brian");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(60);
        System.out.println(student1.getName());
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());




//        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);
//        System.out.println(evenNumbers);
//
//        ArrayList<Integer> evens = new ArrayList<>();
//        evens.add(2);
//        evens.add(4);
//        evens.add(6);
//        evens.add(8);
//        evens.add(10);
//        Collections.reverse(evens);
//        System.out.println(evens);
//
//        HashMap<String, Integer> evensWithWords = new HashMap<>();
//        evensWithWords.put("Two", 2);
//        evensWithWords.put("Four", 4);
//        evensWithWords.put("Six", 6);
//        evensWithWords.put("Eight", 8);
//        evensWithWords.put("Ten", 10);
//        System.out.println(evensWithWords);
//        System.out.println(evensWithWords.size());
//
//        for (HashMap.Entry<String, Integer> entry : evensWithWords.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

    }
}
