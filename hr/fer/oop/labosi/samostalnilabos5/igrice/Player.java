package hr.fer.oop.labosi.samostalnilabos5.igrice;

abstract class Player {
    private String name;

    protected Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void addGameScore(Game game, int score);

    abstract Iterable<Integer> getScores(Game game);
}
