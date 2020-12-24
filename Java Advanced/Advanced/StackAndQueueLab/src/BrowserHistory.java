import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String URL = scan.nextLine();
        String current = "";

        ArrayDeque<String> history = new ArrayDeque<>();

        while (!URL.equals("Home")){
            if (URL.equals("back")){
                if (history.isEmpty()){
                    System.out.println("no previous URLs");
                    URL = scan.nextLine();
                    continue;
                }else {
                    current = history.pop();
                }

            }else {
                if (!current.equals("")){
                    history.push(current);
                }
                current = URL;
            }
            System.out.println(current);
            URL = scan.nextLine();
        }
    }
}
