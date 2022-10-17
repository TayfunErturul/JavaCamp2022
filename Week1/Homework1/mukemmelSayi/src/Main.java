public class Main {
    public static void main(String[] args) {
        //Mükemmel sayı kendi dışındaki bölenlerinin toplamı kendine eşit olan sayıya denir.

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number){
            System.out.println("Mükemmel Sayıdır. --> " + number);
        }
        else {
            System.out.println("Mükemmel Sayı Değildir. --> " + number);
        }

    }
}