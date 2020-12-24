package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadge;
    private List<Pokemon> pokemonList;


    public Trainer(String name) {
        this.name = name;
        this.numberOfBadge = 0;
        this.pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public boolean chekTrainerContainsPokemonWhitElement(String elementToChek) {
        boolean contains = false;

        for (int i = 0; i < this.pokemonList.size(); i++) {
            Pokemon pokemon = this.pokemonList.get(i);
            String element = pokemon.getElement();
            if (elementToChek.equals(element)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int getNumberOfBadge() {
        return this.numberOfBadge;
    }

    public int pokemonListSize() {
        return this.pokemonList.size();
    }

    public void increaseBadge() {
        this.numberOfBadge++;
    }


    public void reduceHp() {
        for (int i = 0; i < this.pokemonList.size(); i++) {
            Pokemon pokemon = this.pokemonList.get(i);
            pokemon.setHealth(pokemon.getHealth() - 10);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.numberOfBadge, this.pokemonList.size());
    }

    public void chekToDeadPokemon() {
        for (int i = this.pokemonList.size() - 1; i >= 0; i--) {
            Pokemon pokemon = this.pokemonList.get(i);
            if (pokemon.getHealth() <= 0) {
                this.pokemonList.remove(i);
            }
        }
    }
}