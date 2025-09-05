import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter name.");
        String name = in.next();
        System.out.println("Please enter he total number of studio sessions attended.");
        int studiosAttended = in.nextInt();
        System.out.println("The average grade on all quizzes after the two lowest quiz grades have been dropped.");
        double averageQuizGrade = in.nextDouble();
        System.out.println("The average grade on all exams.");
        double averageExamGrade = in.nextDouble();

        double weightedStudio = studiosAttended / (double)8 * 15;
        double weightedQuiz = averageQuizGrade * 0.25;
        double weightedExam = averageExamGrade * 0.60;
        double total = weightedExam + weightedQuiz + weightedStudio;

        System.out.println("CSE 131 Grade for : " + name);
        System.out.println("Numbers of Studio attended : " + studiosAttended);
        System.out.println("Weighted studio grade (out of 15): " + weightedStudio);
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 25): " + weightedQuiz);
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 60): " + weightedExam);
        System.out.println("Total Grade: " + total);
        in.close();
        
    }


}
