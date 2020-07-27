import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int evaluationCount = Integer.parseInt(scan.nextLine());

        String name = scan.nextLine();
        int countProblemsEvaluation = 0;
        int countEvaluaions = 0;
        double midEvaluation = 0;
        String lastProblem = name;
        while (!name.equals("Enough")){
            int evaluation = Integer.parseInt(scan.nextLine());
            midEvaluation += evaluation;
            if (evaluation <= 4){
                countProblemsEvaluation += 1;
            }
            if (countProblemsEvaluation == evaluationCount){
                break;
            }
            countEvaluaions += 1;
            lastProblem = name;
            name = scan.nextLine();
        }
        midEvaluation = midEvaluation / countEvaluaions;
        if(countProblemsEvaluation == evaluationCount){
            System.out.printf("You need a break, %d poor grades.",evaluationCount);
        }else {
            System.out.printf("Average score: %.2f%n", midEvaluation);
            System.out.println("Number of problems: " + countEvaluaions);
            System.out.println("Last problem: " + lastProblem);
        }

    }
}
