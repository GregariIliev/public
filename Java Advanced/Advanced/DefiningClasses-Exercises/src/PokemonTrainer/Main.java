package PokemonTrainer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!"Tournament".equals(input)){
            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = new Trainer(trainerName);

            if (!trainerMap.containsKey(trainerName)){
                trainerMap.put(trainerName, trainer);
            }
            trainerMap.get(trainerName).addPokemon(pokemon);

            input = scan.nextLine();
        }

        input = scan.nextLine();
        while (!"End".equals(input)){
            String elementToChek = input;

            for (Trainer trainer : trainerMap.values()) {
                if (trainer.chekTrainerContainsPokemonWhitElement(elementToChek)){
                    trainer.increaseBadge();
                }else {
                    trainer.reduceHp();
                    trainer.chekToDeadPokemon();
                }
            }

            input =  scan.nextLine();
        }

        trainerMap
                .entrySet()
                .stream()
                .sorted((l, r) ->{
                    return Integer.compare(r.getValue().getNumberOfBadge(), l.getValue().getNumberOfBadge());
                }).forEach(trainer ->{
            System.out.println(trainer.getValue().toString());
        });
    }
}
