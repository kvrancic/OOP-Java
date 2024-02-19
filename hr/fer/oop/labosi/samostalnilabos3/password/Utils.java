package hr.fer.oop.labosi.samostalnilabos3.password;

class Utils {
    public static int checkPassword(String information)
    {
        int passwordLength = information.length();
        int digitCount = 0;
        int bigLetterCount = 0;
        int grade;
        //int digitCount = information.replaceAll("\\D", "").length();
        for(int i = 0; i < passwordLength; i++){
            if(Character.isDigit(information.charAt(i)))
                digitCount++;
        }
        for(int i = 0; i < passwordLength; i++){
            if(Character.isUpperCase(information.charAt(i)))
                bigLetterCount++;
        }
        grade = passwordLength + digitCount*3 + bigLetterCount*2;
        if(passwordLength < 6)
            throw new IllegalArgumentException();
        if(grade < 10)
            throw new SecurityException();

        return grade;
    }

    public static void main(String[] args) {
        checkPassword("1234");
    }
}
