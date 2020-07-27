import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        List<Integer> pokemonList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int numb = Integer.parseInt(input[i]);

            pokemonList.add(i , numb);
        }

        int sum = 0;

        while (!pokemonList.isEmpty()) {

            int index = Integer.parseInt(scan.nextLine());
            int numbInIndex = 0;
            if (index < 0) {
                index = 0;
                sum += pokemonList.get(index);
                numbInIndex = pokemonList.get(index);
                pokemonList.remove(index);
                pokemonList.add(index, pokemonList.get(pokemonList.size() - 1));
            } else if (index > pokemonList.size() - 1) {
                index = pokemonList.size() - 1;
                sum += pokemonList.get(index);
                numbInIndex = pokemonList.get(index);
                pokemonList.remove(index);
                pokemonList.add(index, pokemonList.get(0));
            } else {
                sum += pokemonList.get(index);
                numbInIndex = pokemonList.get(index);
                pokemonList.remove(index);
            }

            for (int i = 0; i < pokemonList.size(); i++) {
                if (pokemonList.get(i) <= numbInIndex){
                    pokemonList.set(i, pokemonList.get(i) + numbInIndex);
                }else {
                    pokemonList.set(i, pokemonList.get(i) - numbInIndex);
                }
            }
        }
        System.out.println(sum);
    }
}
