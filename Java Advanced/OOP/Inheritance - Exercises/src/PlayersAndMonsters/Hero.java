package hero;

public class Hero {

    private String userName;
    private int level;

    public Hero(String username, int level){
        this.userName = username;
        this.level = level;
    }

    public String getUsername() {
        return this.userName;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString(){
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());

    }
}
