package hr.fer.oop.labosi.samostalnilabos;

public class ZajednickaZnamenka {
    static boolean common_digit(int twoDigitNum1, int twoDigitNum2){
        if(twoDigitNum1/10 == 0 || twoDigitNum1/100 != 0 || twoDigitNum2/10 == 0 || twoDigitNum2/100 != 0)
            return false;
        else return (twoDigitNum1 % 10) == (twoDigitNum2 % 10) || (twoDigitNum1 / 10) == (twoDigitNum2 / 10) || (twoDigitNum1 / 10) == (twoDigitNum2 % 10) || (twoDigitNum1 % 10) == (twoDigitNum2 / 10);
    }
}
