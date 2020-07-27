import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {

    private String typeList;
    private String name;
    private String time;

    public Song() {
    }

    public String getTypeList() {
        return this.typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Song> listOfSongs = new ArrayList<>();

        int numberOfSong = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfSong; i++) {
            String[] dataReceiving = scan.nextLine().split("_");
            String typeList = dataReceiving[0];
            String name = dataReceiving[1];
            String time = dataReceiving[2];

            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(name);

            listOfSongs.add(song);
        }
        String command = scan.nextLine();
        if (command.equals("all")){
            for (int i = 0; i < listOfSongs.size(); i++) {
                System.out.println(listOfSongs.get(i).getName());
            }
        }
        for (int i = 0; i < listOfSongs.size(); i++) {
            String typeCommand = listOfSongs.get(i).getTypeList();
            if (command.equals(typeCommand)){
                System.out.println(listOfSongs.get(i).getName());
            }
        }
    }
}
