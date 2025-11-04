import java.util.Scanner;

public class BiayaPengirimanLAUKL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan berat paket (kg): ");
        int berat = input.nextInt();

        System.out.print("Masukkan jarak tempuh (km): ");
        int jarak = input.nextInt();

        System.out.print("Masukkan panjang paket (cm): ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar paket (cm): ");
        int lebar = input.nextInt();

        System.out.print("Masukkan tinggi paket (cm): ");
        int tinggi = input.nextInt();


        int volume = panjang * lebar * tinggi;


        int biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }


        int biayaUtama = berat * biayaPerKg;


        int biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }


        int totalBiaya = biayaUtama + biayaVolume;


        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat paket     : " + berat + " kg");
        System.out.println("Jarak tempuh    : " + jarak + " km");
        System.out.println("Volume paket    : " + volume + " cm3");
        System.out.println("Biaya per kg    : Rp " + biayaPerKg);
        System.out.println("Biaya utama     : Rp " + biayaUtama);
        System.out.println("Biaya volume    : Rp " + biayaVolume);
        System.out.println("----------------------------------");
        System.out.println("Total biaya     : Rp " + totalBiaya);
    }
}
