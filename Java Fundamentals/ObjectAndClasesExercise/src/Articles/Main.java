package Articles;

import Articles.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        String[] inputArr = input.split(",\\s+");

        Articles article = new Articles(inputArr[0], inputArr[1], inputArr[2]);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] currentCommands = scan.nextLine().split(": ");
            String command = currentCommands[0];

            if ("Edit".equals(command)){
                article.Edit(currentCommands[1]);
            }else if ("ChangeAuthor".equals(command)){
                article.ChangeAuthor(currentCommands[1]);
            }else if ("Rename".equals(command)){
                article.Rename(currentCommands[1]);
            }
        }
        System.out.println(article.ToString());
    }
}
