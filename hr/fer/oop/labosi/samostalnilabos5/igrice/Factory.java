package hr.fer.oop.labosi.samostalnilabos5.igrice;

class Factory extends Game{

    public Factory(String name) {
        super(name);
    }

    public static Game createGame(String name, int score){
        Game game = new Factory(name);
        game.setRating(score);

        return game;
    }
}
