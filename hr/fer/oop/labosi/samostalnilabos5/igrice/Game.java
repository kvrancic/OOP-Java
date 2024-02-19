package hr.fer.oop.labosi.samostalnilabos5.igrice;

abstract class Game {
    private String name;
    private int rating;

    protected Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ":" + rating;
    }
}
