package hr.fer.oop.labosi.lab2;

public class DoubleQuestion extends Question{
    private double correctanswer;
    private double answer;

    public DoubleQuestion(String text, double correctanswer) {
        super(text);
        this.correctanswer = correctanswer;
        super.numCorrect = 0;
        super.numTries = 0;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    @Override
    public Boolean evaluate() {
        super.numTries++;
        if (Math.abs(answer - correctanswer) < 1E-8)
        {
            super.numCorrect++;
            return true;
        }
        else {
            return false;
        }
    }
}
