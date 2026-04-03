import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Map<String, Double> studentGpaMap = new HashMap<>();
        studentGpaMap.put("Mahmud", 3.12);
        studentGpaMap.put("Turan", 3.05);
        studentGpaMap.put("Umid", 3.24);
        studentGpaMap.put("Sitara", 3.49);
        double maxGpa = Collections.max(studentGpaMap.values());
        System.out.println("Maximum GPA: " + maxGpa);
        System.out.println("Students with the maximum GPA:");
        for (Map.Entry<String, Double> entry : studentGpaMap.entrySet()) {
            if (entry.getValue() == maxGpa) {
                System.out.println(entry.getKey());
            }
        }
        double sum = 0.0;
        for (double gpa : studentGpaMap.values()) {
            sum += gpa;
        }
        double averageGpa = sum / studentGpaMap.size();
        System.out.println("Average GPA: " + averageGpa);
        int countBelowAverrage = 0;
        for (double gpa : studentGpaMap.values()) {
            if (gpa < averageGpa) {
                countBelowAverrage++;
            }
        }
        System.out.println("Number of students with GPA below average: " + countBelowAverrage);
    }
}
