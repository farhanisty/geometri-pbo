/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometri;

import java.util.Scanner;
import geometri.benda.geometri.segitiga.*;
import geometri.benda.geometri.persegi.*;
import geometri.benda.geometri.jajargenjang.*;
import geometri.benda.geometri.trapesium.*;
import geometri.benda.geometri.belahketupat.*;
import geometri.benda.geometri.layanglayang.*;
import geometri.benda.geometri.lingkaran.*;
import geometri.benda.geometri.lingkaran.bola.*;
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
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. Layang Layang");
        System.out.println("8. Lingkaran");
        System.out.print("Pilih bangun datar (1-8): ");
        int pilihan = input.nextInt();
        boolean kembali;

        if (pilihan == 1) {
            System.out.print("Masukkan sisi 1: ");
            double sisi1 = input.nextDouble();
            System.out.print("Masukkan sisi 2: ");
            double sisi2 = input.nextDouble();
            System.out.print("Masukkan sisi alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            Segitiga segitiga = new Segitiga(sisi1, sisi2, alas, tinggi);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU SEGITIGA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + segitiga.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + segitiga.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + segitiga.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 2) {
            System.out.println("Masukkan sisi:");
            double sisi = input.nextDouble();

            Persegi persegi = new Persegi(sisi);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PERSEGI ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + persegi.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + persegi.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + persegi.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 3) {
            System.out.println("Masukkan sisi pendek:");
            double sisiPendek = input.nextDouble();
            System.out.println("Masukkan sisi panjang:");
            double sisiPanjang = input.nextDouble();

            PersegiPanjang persegipanjang = new PersegiPanjang(sisiPendek, sisiPanjang);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PERSEGI PANJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + persegipanjang.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + persegipanjang.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + persegipanjang.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 4) {
            System.out.println("Masukkan sisi datar:");
            double sisiDatar = input.nextDouble();
            System.out.println("Masukkan sisi miring:");
            double sisiMiring = input.nextDouble();
            System.out.println("Masukkan tinggi:");
            double tinggi = input.nextDouble();

            JajarGenjang jajargenjang = new JajarGenjang(sisiDatar, sisiMiring, tinggi);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU JAJAR GENJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + jajargenjang.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + jajargenjang.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + jajargenjang.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 5) {
            System.out.println("Masukkan sisi miring satu:");
            double sisiMiringSatu = input.nextDouble();
            System.out.println("Masukkan sisi miring dua:");
            double sisiMiringDua = input.nextDouble();
            System.out.println("Masukkan sisi alas:");
            double sisiAlas = input.nextDouble();
            System.out.println("Masukkan sisi atas:");
            double sisiAtas = input.nextDouble();
            System.out.println("Masukkan tinggi:");
            double tinggi = input.nextDouble();

            Trapesium trapesium = new Trapesium(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU TRAPESIUM ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + trapesium.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + trapesium.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + trapesium.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 6) {
            System.out.println("Masukkan diagonal satu:");
            double diagonalSatu = input.nextDouble();
            System.out.println("Masukkan diagonal dua:");
            double diagonalDua = input.nextDouble();
            System.out.println("Masukkan sisi:");
            double sisi = input.nextDouble();
            
            BelahKetupat belahketupat = new BelahKetupat(sisi, diagonalSatu, diagonalDua);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU BELAH KETUPAT ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + belahketupat.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + belahketupat.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + belahketupat.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 7) {
            System.out.println("Masukkan diagonal satu:");
            double diagonalSatu = input.nextDouble();
            System.out.println("Masukkan diagonal dua:");
            double diagonalDua = input.nextDouble();
            System.out.println("Masukkan sisi pendek:");
            double sisiPendek = input.nextDouble();
            System.out.println("Masukkan sisi panjang:");
            double sisiPanjang = input.nextDouble();
            
            LayangLayang layanglayang = new LayangLayang(diagonalSatu, diagonalDua, sisiPendek, sisiPanjang);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LAYANG-LAYANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + layanglayang.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + layanglayang.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + layanglayang.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 8) {
            System.out.println("Masukkan jari-jari:");
            double jariJari = input.nextDouble();
            
            Lingkaran lingkaran = new Lingkaran(jariJari);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LINGKARAN ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + lingkaran.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + lingkaran.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + lingkaran.hitungKeliling());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }

    public static void menuBangunRuang(Scanner input) {
        System.out.println("\n=== MENU BANGUN RUANG ===");
        System.out.println("1. Prisma Segitiga");
        System.out.println("2. Limas Segitiga");
        System.out.println("3. Prisma Persegi");
        System.out.println("4. Limas Persegi");
        System.out.println("5. Prisma Jajar Genjang");
        System.out.println("6. Limas Jajar Genjang");
        System.out.println("7. Prisma Trapesium");
        System.out.println("8. Limas Trapesium");
        System.out.println("9. Prisma Belah Ketupat");
        System.out.println("10. Limas Belah Ketupat");
        System.out.println("11. Prisma Layang Layang");
        System.out.println("12. Limas Layang Layang");
        System.out.println("13. Tabung");
        System.out.println("14. Kerucut");
        
        
        
        System.out.print("Pilih bangun ruang (1): ");
        int pilihan = input.nextInt();
        boolean kembali;

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
                kembali = false;
                while(!kembali) {
                    System.out.println("\n=== MENU PRISMA SEGITIGA ===");
                    System.out.println("1. Tampilkan Nama");
                    System.out.println("2. Hitung Volume");
                    System.out.println("3. Hitung Luas Permukaan");
                    System.out.println("4. Kembali");
                    System.out.print("Pilih menu (1-4): ");
                    int subPilihan = input.nextInt();

                    switch (subPilihan) {
                        case 1:
                            System.out.println("Nama: " + prisma.getNama());
                            break;
                        case 2:
                            System.out.println("Volume: " + prisma.hitungVolume());
                            break;
                        case 3:
                            System.out.println("Luas Permukaan: " + prisma.hitungLuas());
                            break;
                        case 4:
                            kembali = true;
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
