package Google;

public class Parents {
    private String name;
    private String birthday;

    public Parents(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public static Parents createParents(String[] tokens) {
        String name = tokens[2];
        String birthday = tokens[3];

        return new Parents(name, birthday);
    }

    @Override
    public String toString(){
        return String.format("%s %s",this.name, this.birthday);
    }
}