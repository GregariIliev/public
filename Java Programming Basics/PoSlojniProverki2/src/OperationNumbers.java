import java.util.Scanner;

public class OperationNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numb1 = Integer.parseInt(scan.nextLine());
        int numb2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        int result = 0;
        double result2 = 0.0;
        double number1 = numb1;
        double number2 = numb2;

        if(operator.equals("+")){
            result = numb1 + numb2;{
                if (result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",numb1 ,operator ,numb2 ,result);
                }else {
                    System.out.printf("%d %s %d = %d - odd",numb1 ,operator ,numb2, result);
                }
            }
        }else if(operator.equals("-")){
            result = numb1 - numb2;
            if (result % 2 == 0){
                System.out.printf("%d %s %d = %d - even",numb1 ,operator ,numb2 ,result);
            }else {
                System.out.printf("%d %s %d = %d - odd",numb1 ,operator ,numb2 ,result);
            }
        }else if(operator.equals("*")){
            result = numb1 * numb2;
            if (result % 2 == 0){
                System.out.printf("%d %s %d = %d - even",numb1 ,operator ,numb2 ,result);
            }else {
                System.out.printf("%d %s %d = %d - odd",numb1 ,operator ,numb2 ,result);
            }
        }else if(operator.equals("/")){
            if (numb1 == 0){
                System.out.printf("Cannot divide %d by zero",numb2);
            }else if(numb2 == 0){
                System.out.printf("Cannot divide %d by zero",numb1);
            }else {
                result2 = number1 / number2;
                System.out.printf("%d %s %d = %.2f",numb1 ,operator ,numb2 ,result2);
            }
        }else if(operator.equals("%")){
            if (numb1 == 0){
                System.out.printf("Cannot divide %d by zero",numb2);
            }else if(numb2 == 0){
                System.out.printf("Cannot divide %d by zero",numb1);
            }else {
                result = numb1 % numb2;
                System.out.printf("%d %s %d = %d",numb1 ,operator ,numb2 ,result);
            }
        }
    }
}