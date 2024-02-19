package hr.fer.oop.labosi.samostalnilabos3.keyvalue;

public class XY extends SingleTypeKeyValue<Double>{
    public XY(double key, double value) {
        super(key, value);
    }

    public static boolean isIncreasingFunction(XY[] data)
    {
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                if(data[i].getKey() > data[j].getKey() && data[i].getValue() < data[j].getValue())
                return false;
            }
        }
        return true;
    }
}
