package TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lights = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(scan.nextLine());

        TrafficLight trafficLight = new TrafficLight();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < lights.length; i++) {
                trafficLight.setLight(Light.valueOf(lights[i]));
                trafficLight.update();
                trafficLight.printLight();
                lights[i] = trafficLight.getLight().toString();
            }
            System.out.println();
        }
    }

//    private static void update(String[] input) {
//        for (int i = 0; i < input.length; i++) {
//            int index = Light.valueOf(input[i]).ordinal() + 1;
//            if (index == 3){
//                index = 0;
//            }
//            input[i] = Light.values()[index].toString();
//            System.out.print(input[i] + " ");
//        }
//        System.out.println();
//    }
}