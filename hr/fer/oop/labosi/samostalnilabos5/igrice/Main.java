package hr.fer.oop.labosi.samostalnilabos5.igrice;

class Main {
    public static void main(String[] args) {
        Game g1 = Factory.createGame("Super Mario", 90);
        Game g2 = Factory.createGame("Heroes", 80);
        MyPlayer p = new MyPlayer("Mario");
        p.addGameScore(g1, 300);
        p.addGameScore(g1, 400);
        p.addGameScore(g2, 50);
        p.addGameScore(g1, 200);
        p.addGameScore(g1, 400);
        p.addGameScore(g2, 70);
        for(Game g : p) {
            System.out.println(g);
            for(int score : p.getScores(g)) {
                System.out.println(score);
            }
            System.out.println();
        }
    }
}
