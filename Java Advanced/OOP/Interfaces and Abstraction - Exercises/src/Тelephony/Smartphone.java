import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls){
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String url : urls) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(url);

            if (matcher.find()){
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
                continue;
            }
            stringBuilder.append(String.format("Browsing: %s!%n",url));
        }

        return stringBuilder.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String number : numbers) {
            Pattern pattern = Pattern.compile("[^0-9]+");
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()){
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
                continue;
            }
            stringBuilder.append(String.format("Calling... %s%n",number));
        }

        return stringBuilder.toString().trim();
    }
}
//private static List<String> filterValuesByPattern(Pattern pattern, List<String> list) {
//        List<String> listResult = new ArrayList<>();
//
//        for (String text : list) {
//            Matcher matcher = pattern.matcher(text);
//            if (matcher.find()){
//                continue;
//            }
//            listResult.add(text);
//        }
//        return listResult;
//    }