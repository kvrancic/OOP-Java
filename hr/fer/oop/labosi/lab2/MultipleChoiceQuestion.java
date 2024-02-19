package hr.fer.oop.labosi.lab2;

public class MultipleChoiceQuestion extends Question{
    private String choice1;
    private String choice2;
    private String choice3;
    private int correctanswer;
    private int answer;

    public MultipleChoiceQuestion(String text, String choice1, String choice2, String choice3, int correctanswer) {
        super(text);
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.correctanswer = correctanswer;
        super.numCorrect = 0;
        super.numTries = 0;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public Boolean evaluate() {
        super.numTries++;
        if (correctanswer == answer)
        {
            super.numCorrect++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Text: " + this.getText()
                +  ", number of tries: " + numTries
                + ", number of correct answers: " + numCorrect;
    }

    @Override
    public String getText() {
        return super.getText() + ", A: " + choice1 + ", B: " + choice2 + ", C: " + choice3;
    }

    public static void main(String[] args) {
        DoubleQuestion q1 = new DoubleQuestion("What is the value of number Pi, rounded to three decimal places", 3.141);
        System.out.println(q1.getText());      // What is the value of number Pi, rounded to three decimal places
        q1.setAnswer(3.0);
        q1.evaluate();                         // false
        q1.evaluate();                         // false
        q1.evaluate();                         // false

        q1.setAnswer(4.0);
        q1.evaluate();                         // false

        q1.setAnswer(3.141);
        q1.evaluate();                         // true
        q1.evaluate();                         // true

        System.out.println(q1);                // Text: What is the value of number Pi, rounded to two decimal
        // places, number of tries: 6, number of correct answers: 2

        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Calculate 2 to the power of 5", "16", "32", "64", 2);
        System.out.println(q2.getText());     // Calculate 2 to the power of 5, A: 16, B: 32, C: 64
        q2.setAnswer(1);
        q2.setAnswer(2);
        q2.setAnswer(3);
        q2.evaluate();                         // false

        q2.setAnswer(2);
        q2.evaluate();                         // true

        q2.setAnswer(2);
        q2.evaluate();                         // true

        System.out.println(q2);                // Text: Calculate 2 to the power of 5, A: 16, B: 32, C: 64,
        // number of tries: 3, number of correct answers: 2
    }
}
