import com.sun.source.tree.WhileLoopTree;
import javafx.beans.binding.When;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        boolean isTrue = false;
        for (int i = 1111; i <= 9999 ; i++) {
            int currentNumb = i;
            while (currentNumb > 0) {
                    int numb = currentNumb % 10;
                    if (numb == 0){
                        isTrue = false;
                        break;
                    }else if (n % numb == 0) {
                        isTrue = true;
                    } else {
                        isTrue = false;
                        break;
                    }
                    currentNumb = currentNumb / 10;


            }
            if (isTrue) {
                System.out.printf("%d ", i);
            }
        }
    }
}
