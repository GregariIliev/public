import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double coin = Double.parseDouble(scan.nextLine()) * 100;
        int stotinki = 0;
        double allCoins = 0;
        while (coin > allCoins){
            if (coin >= 200){
                coin = coin % 200;
                stotinki += 1;
            }else if (coin >= 100){
                coin = coin % 100;
                stotinki += 1;
            }else if (coin >= 50){
                coin = coin % 50;
                stotinki += 1;
            }else if (coin >= 20){
                coin = coin % 20;
                stotinki += 1;
            }else if (coin >= 10){
                coin = coin % 10;
                stotinki += 1;
            }else if (coin >= 5){
                coin = coin % 5;
                stotinki += 1;
            }else if (coin >= 2){
                coin = coin % 2;
                stotinki += 1;
            }else if (coin >= 1){
                coin = coin % 1;
                stotinki += 1;
            }

        }
        System.out.println(stotinki);

    }
}
