package hr.fer.oop.labosi.samostalnilabos3.highlander;

public class Highlander {
    private int sequel;
    static int counter = 0;
    static int prevArg = 0;
    static Highlander old = null;


    public static Highlander callMacLeod(int argument) throws OnlyOneException {
        if(counter == 0)
        {
            prevArg = argument;
            counter++;
            old = new Highlander(argument);
            return old;
        }
        else{
            if(prevArg == argument)
            {
                return old;
            }
            else{
                throw new OnlyOneException();
            }
        }

    }

    private Highlander(int sequel) {
        if(sequel < 1 || sequel > 5)
            throw new WaitForItException();
        this.sequel = sequel;
    }

    public int getSequel() {
        return sequel;
    }

    public Highlander() throws OnlyOneException {
        throw new OnlyOneException();
    }
}
