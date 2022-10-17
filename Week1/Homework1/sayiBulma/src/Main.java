public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean listedeVarMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                listedeVarMi = true;
                break;
            }
        }

        if (listedeVarMi) {
            System.out.println(aranacak + " sayısı listede var.");
        } else {
            System.out.println(aranacak + " sayısı listede bulunamadı.");
        }
    }
}