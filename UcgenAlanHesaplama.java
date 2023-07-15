

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Kullanıcıdan alınan değer.

        System.out.print("Birinci kenarın uzunluğunu girin: ");
        double a = input.nextDouble();

        System.out.print("İkinci kenarın uzunluğunu girin: ");
        double b = input.nextDouble();

        System.out.print("Hipotenüs uzunluğunu girin: ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2 ; //Üçgenin çevresi 2U.
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)); //Üçgenin alanını verir.

        System.out.println("Üçgenin Alanı: " + alan); //Üçgenin alanını yazdırır.






    }
}
