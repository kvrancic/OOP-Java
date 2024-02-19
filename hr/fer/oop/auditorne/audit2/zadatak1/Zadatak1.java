package hr.fer.oop.auditorne.audit2.zadatak1;


public class Zadatak1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(";");
        }

        String s1 = new String();
        String text = sb.toString();
        separation(text);
        FirstAndLAstSymbol(';', text);
        Substring(';', text);
    }

        // a) Separacija znakovnog niza - vrati kako je bilo
        public static void separation(String text)
        {
            String[] splits = text.split(";");
            for (String split : splits) {
                System.out.println(split);
            }
        }

        //b) FirstAndLastSymbol
        public static void FirstAndLAstSymbol(char symbol, String text)
        {
            int FirstIndex = text.indexOf(symbol);
            int LastIndex = text.lastIndexOf(symbol);
            System.out.println("The first index of the given symbol is at the location "+ FirstIndex);
            System.out.println("The last index of the given symbol is at the location "+ LastIndex);
        }

        //c)Substring
        public static void Substring(char symbol, String text)
        {
            int FirstIndex = text.indexOf(symbol);
            int LastIndex = text.lastIndexOf(symbol);
            String substring = text.substring(FirstIndex + 1, LastIndex);
            System.out.println(substring);
        }

}
