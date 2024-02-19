package hr.fer.oop.labosi.samostalnilabos3.marinobrada;

public class ObradaPodataka {
    public static int obradi(){
        int sum = 0;
        for(int i = 0; i < DataSource.size(); i++) {
            int adder = 0;
            try {
                adder = DataSource.getNextNumber();
                try {
                    adder = DataProcessUtil.processNumber(adder);
                } catch (Exception e) {
                    adder = DataProcessUtil.handleException(e, adder);
                }
            } catch (Exception ignore) {
            }
            sum += adder;
        }

        return sum;
    }
}
