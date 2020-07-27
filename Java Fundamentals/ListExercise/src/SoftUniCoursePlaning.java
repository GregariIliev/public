import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] schedule = scan.nextLine().split(", ");
        List<String> initialSchedule = new ArrayList<>();

        for (int i = 0; i < schedule.length; i++) {
            initialSchedule.add(i,schedule[i]);
        }
        boolean exerciseExsist = false;
        int indexExerciseExsist = 0;
        String input = scan.nextLine();
        while (!"course start".equals(input)){
            String[] allCommands = input.split(":");
            String command = allCommands[0];
            String lessonTitle = allCommands[1];
            boolean isTrue = false;

            if (command.equals("Add")){

                if (!initialSchedule.contains(lessonTitle)){
                    initialSchedule.add(lessonTitle);
                }
            }else if (command.equals("Insert")){
                int indexToInsert = Integer.parseInt(allCommands[2]);

                if (!initialSchedule.contains(lessonTitle)){
                    initialSchedule.add(indexToInsert, lessonTitle);
                }
            }else if (command.equals("Remove")){
                isTrue = initialSchedule.contains(lessonTitle);

                if (isTrue){
                    if (exerciseExsist){
                        initialSchedule.remove(indexExerciseExsist + 1);
                    }
                    initialSchedule.remove(lessonTitle);
                }

            }else if (command.equals("Swap")){
                String secondLessonTitle = allCommands[2];
                int firstTitleIndex = 0;
                int secondTitleIndex = 0;
                String valueToChange = "";
                for (int i = 0; i < initialSchedule.size(); i++) {
                    if (initialSchedule.get(i).equals(lessonTitle)){
                        firstTitleIndex = i;
                        valueToChange = initialSchedule.get(i);
                    }
                    if (initialSchedule.get(i).equals(secondLessonTitle)){
                        secondTitleIndex = i;
                    }
                }
                if (initialSchedule.contains(lessonTitle) && initialSchedule.contains(secondLessonTitle)){
                    isTrue = true;
                }
                if (isTrue){
                    initialSchedule.set(firstTitleIndex, initialSchedule.get(secondTitleIndex));
                    initialSchedule.set(secondTitleIndex, valueToChange);
                }
                if (exerciseExsist){
                    initialSchedule.add(firstTitleIndex + 1, initialSchedule.get(indexExerciseExsist));
                    initialSchedule.remove(indexExerciseExsist + 1);
                }

            }else if (command.equals("Exercise")){
                int indexExistLessonTitle = 0;
                for (int i = 0; i < initialSchedule.size(); i++) {
                    if (initialSchedule.get(i).equals(lessonTitle)){
                        isTrue = true;
                        indexExistLessonTitle = i;
                    }
                }
                if (isTrue){
                    initialSchedule.add(indexExistLessonTitle + 1, lessonTitle + "-Exercise");
                    exerciseExsist = true;
                    indexExerciseExsist = indexExistLessonTitle;
                }else {
                    initialSchedule.add(lessonTitle);
                    initialSchedule.add(lessonTitle + "-Exercise");
                    exerciseExsist = true;
                    indexExerciseExsist = initialSchedule.size() - 1;
                }
            }

            input = scan.nextLine();
        }

        int count = 0;
        for (int i = 0; i < initialSchedule.size(); i++) {
            count ++;
            String lesson = initialSchedule.get(i);
            System.out.printf("%d.%s%n",count ,lesson);
        }
    }
}
