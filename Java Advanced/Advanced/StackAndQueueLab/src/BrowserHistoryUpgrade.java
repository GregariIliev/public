import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String URL = scan.nextLine();
        String current = "";

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> historyForward = new ArrayDeque<>();

        while (!URL.equals("Home")){
            if (URL.equals("back")){
                if (history.isEmpty()){
                    System.out.println("no previous URLs");
                    URL = scan.nextLine();
                    continue;
                }else {
                    historyForward.push(current);
                    current = history.pop();
                }

            }else if (URL.equals("forward")){
                if (historyForward.isEmpty()){
                    System.out.println("no next URLs");
                    URL = scan.nextLine();
                    continue;
                }else {
                    history.push(current);
                    current = historyForward.pop();
                }

            }else {
                if (!current.equals("")){
                    history.push(current);
                }
                current = URL;
                historyForward.clear();
            }
            System.out.println(current);
            URL = scan.nextLine();
        }
    }
}
