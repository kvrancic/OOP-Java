package hr.fer.oop.labosi.samostalnilabos4.pokemon;

import java.util.*;

public class Trainer {
    List<Pokemon> pokemonList = new ArrayList<>();
    Map<Pokemon, Move> pokemonStrongestMoves = new LinkedHashMap<>();


    void catchPokemon(Pokemon pokemon){
        pokemonList.add(pokemon);
        TreeSet<Move> sortedMoveSet = new TreeSet<>(pokemon.getMoveset());
        if(!pokemonStrongestMoves.containsKey(pokemon)){
            pokemonStrongestMoves.put(pokemon, sortedMoveSet.first());
        }
        else if(pokemonStrongestMoves.get(pokemon).getPower() < sortedMoveSet.first().getPower())
            pokemonStrongestMoves.replace(pokemon, sortedMoveSet.first());
    }

    List<Pokemon> getTeamByPokedexNumber(){
        List<Pokemon> pokedexOrder = new ArrayList<>(pokemonList);
        Collections.sort(pokedexOrder, new Comparator<Pokemon>() {
            @Override
            public int compare(Pokemon o1, Pokemon o2) {
                return Integer.compare(o1.getPokedexNumber(), o2.getPokedexNumber());
            }
        });
        return pokedexOrder;
    }

    Map<Pokemon, Move> getStrongestMoves(){
        return pokemonStrongestMoves;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer();

        Set<Move> pikachuMoveset = new HashSet<>();
        pikachuMoveset.add(new Move("Quick Attack", 40));
        pikachuMoveset.add(new Move("Thunderbolt", 90));
        Pokemon pikachu = new Pokemon("Pikachu", 25, pikachuMoveset);

        Set<Move> charmanderMoveset = new HashSet<>();
        charmanderMoveset.add(new Move("Ember", 40));
        charmanderMoveset.add(new Move("Fire Fang", 65));
        Pokemon charmander = new Pokemon("Charmander", 4, charmanderMoveset);

        Set<Move> squirtleMoveset = new HashSet<>();
        squirtleMoveset.add(new Move("Water Gun", 40));
        squirtleMoveset.add(new Move("Water Pulse", 60));
        Pokemon squirtle = new Pokemon("Squirtle", 7, squirtleMoveset);

        trainer.catchPokemon(pikachu);
        trainer.catchPokemon(charmander);
        trainer.catchPokemon(squirtle);

        System.out.println("Trainer's Pokemon sorted by Pokedex numbers:");
        for (Pokemon pokemon: trainer.getTeamByPokedexNumber())
            System.out.println(pokemon.getPokedexNumber() + ": " + pokemon.getName());

        System.out.println("\nTrainer's Pokemon and their strongest moves:");
        for(Map.Entry<Pokemon, Move> entry: trainer.getStrongestMoves().entrySet())
            System.out.println(entry.getKey().getName() + ": " + entry.getValue().getName());
    }
}
