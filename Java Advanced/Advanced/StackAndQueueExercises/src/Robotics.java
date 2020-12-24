import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputRobotData = scan.nextLine().split(";");
        LinkedHashMap<String, int[]> robots = new LinkedHashMap<>();
        inputDataToMap(inputRobotData, robots);

        String startingTime = scan.nextLine();
        int clock = timeToSeconds(startingTime);

        ArrayDeque<String> products = new ArrayDeque<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            products.offer(input);
            input = scan.nextLine();
        }

        while (!products.isEmpty()){
            clock++;
            boolean isWorked = false;
            String product = products.poll();

            for (Map.Entry<String, int[]> entry : robots.entrySet()) {
                String nameRobot = entry.getKey();
                if (robots.get(nameRobot)[1] == 0 && !isWorked){
                    robots.get(nameRobot)[1] = robots.get(nameRobot)[0];
                    isWorked = true;
                    System.out.printf("%s - %s " + timeCalculator(clock), nameRobot, product);
                }
                if (robots.get(nameRobot)[1] > 0){
                    robots.get(nameRobot)[1]--;
                }
            }
            if (!isWorked){
                products.offer(product);
            }
        }
    }




    private static int timeToSeconds(String startingTime) {
        String[] timeSplit = startingTime.split(":");

        int hours = Integer.parseInt(timeSplit[0]);
        int minutes = Integer.parseInt(timeSplit[1]);
        int seconds = Integer.parseInt(timeSplit[2]);

        return seconds + minutes * 60 + hours * 3600;
    }

    private static void inputDataToMap(String[] inputRobotData, LinkedHashMap<String, int[]> robots) {
        for (int i = 0; i < inputRobotData.length; i++) {
            String[] robot = inputRobotData[i].split("-");
            String robotName = robot[0];
            int processingTime = Integer.parseInt(robot[1]);

            robots.put(robotName, new int[]{processingTime, 0});
        }
    }

    private static String timeCalculator(final int clock) {

        return String.format("[%02d:%02d:%02d]%n",
                clock / 3600 % 24,
                clock % 3600 / 60,
                clock % 60);
    }
}
