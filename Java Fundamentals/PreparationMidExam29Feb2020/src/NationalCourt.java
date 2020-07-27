import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstEmployeesHelpPeoplePerHour = Integer.parseInt(scan.nextLine());
        int secondEmployeesHelpPeoplePerHour = Integer.parseInt(scan.nextLine());
        int thirdEmployeesHelpPeoplePerHour = Integer.parseInt(scan.nextLine());

        int totalPeopleCount = Integer.parseInt(scan.nextLine());

        int timeInHoursNeeded = 0;

        while (totalPeopleCount > 0){

            totalPeopleCount = totalPeopleCount - firstEmployeesHelpPeoplePerHour;
            totalPeopleCount = totalPeopleCount - secondEmployeesHelpPeoplePerHour;
            totalPeopleCount = totalPeopleCount - thirdEmployeesHelpPeoplePerHour;
            timeInHoursNeeded ++;

            if (timeInHoursNeeded % 4 == 0){
                timeInHoursNeeded++;
            }
        }
        System.out.printf("Time needed: %dh.",timeInHoursNeeded);

    }
}
