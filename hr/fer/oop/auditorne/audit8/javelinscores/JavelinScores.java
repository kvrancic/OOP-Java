package hr.fer.oop.auditorne.audit8.javelinscores;

import java.util.LinkedList;
import java.util.List;

public class JavelinScores {
    List<Score> scoreList;

    public JavelinScores() {
        this.scoreList = new LinkedList<>();
    }

    public void add(String name, double score){
        Score s = new Score(name, score);
        int i;
        for(i = 0; i < scoreList.size(); i++){
            if(score > scoreList.get(i).getScore())
                break;
        }
        scoreList.add(i, s);
    }

    public void print()
    {
        for(Score s : scoreList)
            System.out.println(s);
    }
}
