package Google;

public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static Pokemon createPokemon(String[] tokens) {
        String name = tokens[2];
        String type = tokens[3];

        return new Pokemon(name, type);
    }

    @Override
    public String toString(){
        return String.format("%s %s",this.name, this.type);
    }
}