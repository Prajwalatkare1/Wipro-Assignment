package Coding_Questions;

public class Third {

    public static int calculateGirlsWithGradeA(int totalStudents, int totalBoys, int gradeAStudents, int gradeABoys) {
        int gradeAGirls = gradeAStudents - gradeABoys;
        return gradeAGirls;
    }

    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int gradeAStudents = totalStudents / 2; 
        int gradeABoys = 20;

        int gradeAGirls = calculateGirlsWithGradeA(totalStudents, totalBoys, gradeAStudents, gradeABoys);
        System.out.println("Total number of girls getting grade 'A': " + gradeAGirls);
    }
}
