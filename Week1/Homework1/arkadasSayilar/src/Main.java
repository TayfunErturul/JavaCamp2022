public class Main {
    public static void main(String[] args) {
        //Arkadaş sayılar kendileri hariç pozitif tam bölen sayıların toplamı birbirine eşit olan sayılara denir. Yani 220'nin pozitif tam bölenleri 284'e 284'ün pozitif tam bölenlerin toplamı 220'ye eşittir.

        int numberA = 220;
        int numberB = 284;
        int totalA = 0;
        int totalB = 0;
        for (int i = 1; i < numberA; i++) {
            if (numberA % i == 0) {
                totalA += i;
            }
        }

        for (int j = 1; j < numberB; j++) {
            if (numberB % j == 0) {
                totalB += j;
            }
        }

        if (totalA == numberB && totalB == numberA) {
            System.out.println(numberA + " ve " + numberB + " arkadaş sayıdır.");
        } else {
            System.out.println(numberA + " ve " + numberB + " arkadaş sayı değildir.");
        }
    }
}