import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        double finalEvaluation = 0;
        int count = 0;
        while (!name.equals("Finish")){
            double resultEvaluation = 0;
            for (int i = 1; i <= people ; i++) {
                double evaluation = Double.parseDouble(scan.nextLine());
                count++;
                finalEvaluation += evaluation;
                resultEvaluation +=evaluation;
            }
            double result = resultEvaluation / people;
            System.out.printf("%s - %.2f.%n",name ,result);
            name = scan.nextLine();
        }
        double finalResult = finalEvaluation /  count;
        System.out.printf("Student's final assessment is %.2f.",finalResult);


    }
}