package hr.fer.oop.labosi.lab2;

public abstract class Question {
    private String text;
    protected int numTries = 0;
    protected int numCorrect = 0;

    public Question(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public abstract Boolean evaluate();

    public String toString() {
        return "Text: " + this.getText()
                +  ", number of tries: " + numTries
                + ", number of correct answers: " + numCorrect;
    }
}
