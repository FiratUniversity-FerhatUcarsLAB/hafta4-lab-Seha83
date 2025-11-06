/*
 * Ad Soyad: [İbrahim Seha DOĞAN]
 * Ogrenci No: [250541021]
 * Tarih: [06.11.2025]
*/
import java.util.Locale;
import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        final double PI = 3.14159;

        System.out.print("Dairenin yarıçapını giriniz : ");
        double r = input.nextDouble();

        double daireAlani = PI * Math.pow(r, 2);
        double daireCevresi = 2 * PI * r;
        double daireCap = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

        System.out.println("\n===== GEOMETRİK HESAPLAMA SONUÇLARI =====");
        System.out.printf(Locale.US, "%-25s : %.2f\n", "Daire Alanı", daireAlani);
        System.out.printf(Locale.US, "%-25s : %.2f\n", "Daire Çevresi", daireCevresi);
        System.out.printf(Locale.US, "%-25s : %.2f\n", "Daire Çapı", daireCap);
        System.out.printf(Locale.US, "%-25s : %.2f\n", "Küre Hacmi", kureHacmi);
        System.out.printf(Locale.US, "%-25s : %.2f\n", "Küre Yüzey Alanı", kureYuzeyAlani);

        input.close();
    }
}
