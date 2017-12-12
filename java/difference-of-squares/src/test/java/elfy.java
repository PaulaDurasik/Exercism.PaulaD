public class elfy {
    public static void main(String[] args) {

        System.out.println(numerCalc("011"));

    }

    private static int numerCalc(String number) {
        int wynik = 0;
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i);

            for (int j = 1; j < number.length(); j++) {
                int num1 = number.charAt(j);
                if (num == num1) {
                    wynik = wynik + 1;
                }
            }
        }
        return wynik;

    }


}






