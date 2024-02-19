package hr.fer.oop.labosi.samostalnilabos4.pokemon;

import java.util.Set;

public class Pokemon {
    private String name;
    private int pokedexNumber;
    private Set<Move> moveset;

    public Pokemon(String name, int pokedexNumber, Set<Move> moveset) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.moveset = moveset;
    }

    public String getName() {
        return name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public Set<Move> getMoveset() {
        return moveset;
    }
}
