package hr.fer.oop.labosi.samostalnilabos5.igrice;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class MyPlayer extends Player implements Iterable<Game>{

    private Map<Game, List<Integer>> gameScores = new TreeMap<>((a, b) -> a.getName().compareTo(b.getName()));

    protected MyPlayer(String name) {
        super(name);

    }

    @Override
    void addGameScore(Game game, int score) {
        if(!gameScores.containsKey(game))
            gameScores.put(game, new LinkedList<>());

        gameScores.get(game).add(score);
    }

    @Override
    Iterable<Integer> getScores(Game game) {
        return gameScores.get(game);
    }

    @NotNull
    @Override
    public Iterator<Game> iterator() {
        return gameScores.keySet().iterator();
    }
}
