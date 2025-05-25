/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometri;


import java.util.Scanner;
/**
 *
 * @author farhannivta
 */
public class Geometri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Hitung Bangun Datar (2D)");
            System.out.println("2. Hitung Bangun Ruang (3D)");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    menuBangunDatar(input);
                    break;
                case 2:
                    menuBangunRuang(input);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program.");
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }

    public static void menuBangunDatar(Scanner input) {
        System.out.println("\n=== MENU BANGUN DATAR ===");
        System.out.println("1. Segitiga");
        // Tambahkan opsi lain di sini
        System.out.print("Pilih bangun datar (1): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi 1: ");
                double sisi1 = input.nextDouble();
                System.out.print("Masukkan sisi 2: ");
                double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                Segitiga segitiga = new Segitiga(sisi1, sisi2, alas, tinggi);
                System.out.println("Nama: " + segitiga.getNama());
                System.out.println("Luas: " + segitiga.hitungLuas());
                System.out.println("Keliling: " + segitiga.hitungKeliling());
                break;
            // Tambahkan case 2 - 10 sesuai dengan bangun datar lainnya
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void menuBangunRuang(Scanner input) {
        System.out.println("\n=== MENU BANGUN RUANG ===");
        System.out.println("1. Prisma Segitiga");
        // Tambahkan opsi lainnya di sini
        System.out.print("Pilih bangun ruang (1): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi 1: ");
                double sisi1 = input.nextDouble();
                System.out.print("Masukkan sisi 2: ");
                double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = input.nextDouble();
                System.out.print("Masukkan tinggi prisma: ");
                double tinggiPrisma = input.nextDouble();

                PrismaSegitiga prisma = new PrismaSegitiga(tinggiPrisma, sisi1, sisi2, alas, tinggiSegitiga);
                System.out.println("Nama: " + prisma.getNama());
                System.out.println("Volume: " + prisma.hitungVolume());
                System.out.println("Luas Permukaan: " + prisma.hitungLuas());
                break;
            // Tambahkan case 2 - 21 sesuai dengan bangun ruang lainnya
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
