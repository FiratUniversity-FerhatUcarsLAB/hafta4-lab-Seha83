/*
 * Ad Soyad: [İbrahim Seha DOĞAN]
 * Ogrenci No: [250541021]
 * Tarih: [06.11.2025]
*/
import java.util.Locale;
import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        // Locale.US: Nokta ile ondalıklı sayı girişi (örn: 25000.75)
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Bilgi girişi
        System.out.print("Çalışanın adı soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayısı: ");
        int mesaiSaati = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176.0;
        double gunlukNetKazanc = netMaas / 22.0;

        // Çıktı
        System.out.println("\n========================================");
        System.out.println("           MAAŞ BORDROSU");
        System.out.println("========================================");
        System.out.printf("%-25s : %s\n", "Ad Soyad", adSoyad);
        System.out.println("----------------------------------------");

        System.out.println(">>> GELİRLER <<<");
        System.out.printf("%-25s : %.2f TL\n", "Brüt Maaş", brutMaas);
        System.out.printf("%-25s : %.2f TL\n", "Mesai Ücreti", mesaiUcreti);
        System.out.printf("%-25s : %.2f TL\n", "Toplam Gelir", toplamGelir);

        System.out.println("\n>>> KESİNTİLER <<<");
        System.out.printf("%-25s : %.2f TL\n", "SGK (%.0f%%)", sgkKesinti, SGK_ORANI * 100);
        System.out.printf("%-25s : %.2f TL\n", "Gelir Vergisi (%.0f%%)", gelirVergisi, GELIR_VERGISI_ORANI * 100);
        System.out.printf("%-25s : %.2f TL\n", "Damga Vergisi (%.3f%%)", damgaVergisi, DAMGA_VERGISI_ORANI * 100);
        System.out.printf("%-25s : %.2f TL\n", "Toplam Kesinti", toplamKesinti);

        System.out.println("\n>>> NET HESAPLAR <<<");
        System.out.printf("%-25s : %.2f TL\n", "Net Maaş", netMaas);
        System.out.printf("%-25s : %.1f %%\n", "Kesinti Oranı", kesintiOrani);
        System.out.printf("%-25s : %.2f TL/saat\n", "Saatlik Net Kazanç", saatlikNetKazanc);
        System.out.printf("%-25s : %.2f TL/gün\n", "Günlük Net Kazanç", gunlukNetKazanc);

        System.out.println("========================================");

        input.close();
    }
}
