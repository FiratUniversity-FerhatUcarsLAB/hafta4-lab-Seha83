/*
 * Ad Soyad: [İbrahim Seha DOĞAN]
 * Ogrenci No: [250541021]
 * Tarih: [04.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
import java.util.Locale;
public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
         Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // Nokta ile ondalık giriş için

        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
              System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numaranızı giriniz: ");
        int numara = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00) değerini giriniz (nokta kullanın): ");
        double gpa = input.nextDouble();
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
         System.out.printf("║ Ad: %-30s║%n", ad);
        
        // Soyad
        System.out.printf("║ Soyad: %-27s║%n", soyad);
        
        // Ogrenci No
        System.out.printf("║ Numara: %-26d║%n", numara);
        
        // Yas
        
        System.out.printf("║ Yaş: %-30d║%n", yas);
        // GPA
        System.out.printf("║ GPA: %-29.2f║%n", gpa);
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
}
