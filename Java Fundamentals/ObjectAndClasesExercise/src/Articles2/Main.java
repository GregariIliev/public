package Articles2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Articles2> articles2List = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split(",\\s+");

            Articles2 article = new Articles2(inputArr[0], inputArr[1], inputArr[2]);
            articles2List.add(article);
        }
        String command = scan.nextLine();
        if ("title".equals(command)){
            articles2List.sort(Comparator.comparing(Articles2::getTitle));
            articles2List.forEach(Articles2::ToString);
        }else if ("content".equals(command)){
            articles2List.sort(Comparator.comparing(Articles2::getContent));
            articles2List.forEach(Articles2::ToString);
        }else if ("author".equals(command)){
            articles2List.sort(Comparator.comparing(Articles2::getAuthor));
            articles2List.forEach(Articles2::ToString);
        }
    }
}