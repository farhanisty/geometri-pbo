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
            System.out.println("3. Hitung Bangun Ruang Terpotong");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    menuBangunDatar(input);
                    break;
                case 2:
                    menuBangunRuang(input);
                    break;
                case 3:
                    menuBangunRuangTerpotong(input);
                    break;
                case 4:
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
        System.out.println("9. Juring Lingkaran");
        System.out.println("10. Tembereng Lingkaran");
        System.out.print("Pilih bangun datar (1-10): ");
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
        else if (pilihan == 9) {
            System.out.println("Masukkan jari-jari:");
            double jariJari = input.nextDouble();
            System.out.println("Masukkan sudut:");
            double sudut = input.nextDouble();
            
            JuringLingkaran juringlingkaran = new JuringLingkaran(jariJari, sudut);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU JURING LINGKARAN ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Luas");
                System.out.println("3. Hitung Keliling");
                System.out.println("4. Hitung Panjang Busur");
                System.out.println("5. Kembali");
                System.out.print("Pilih menu (1-5): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + juringlingkaran.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + juringlingkaran.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + juringlingkaran.hitungKeliling());
                        break;
                    case 4:
                        System.out.println("Panjang Busur: " + juringlingkaran.hitungPanjangBusur());
                    case 5:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 10) {
            System.out.println("Masukkan jari-jari:");
            double jariJari = input.nextDouble();
            System.out.println("Masukkan sudut theta:");
            double sudutTheta = input.nextDouble();
            
            TemberengLingkaran temberenglingkaran = new TemberengLingkaran(jariJari, sudutTheta);

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
                        System.out.println("Nama: " + temberenglingkaran.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + temberenglingkaran.hitungLuas());
                        break;
                    case 3:
                        System.out.println("Keliling: " + temberenglingkaran.hitungKeliling());
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
        System.out.println("5. Prisma Persegi Panjang");
        System.out.println("6. Limas Persegi Panjang");
        System.out.println("7. Prisma Jajar Genjang");
        System.out.println("8. Limas Jajar Genjang");
        System.out.println("9. Prisma Trapesium");
        System.out.println("10. Limas Trapesium");
        System.out.println("11. Prisma Belah Ketupat");
        System.out.println("12. Limas Belah Ketupat");
        System.out.println("13. Prisma Layang Layang");
        System.out.println("14. Limas Layang Layang");
        System.out.println("15. Tabung");
        System.out.println("16. Kerucut");
        System.out.println("17. Bola");
        
        System.out.print("Pilih bangun ruang (1-17): ");
        int pilihan = input.nextInt();
        boolean kembali;

        if (pilihan == 1) {
            System.out.print("Masukkan sisi satu: ");
            double sisiSatu = input.nextDouble();
            System.out.print("Masukkan sisi dua: ");
            double sisiDua = input.nextDouble();
            System.out.print("Masukkan sisi alas: ");
            double sisiAlas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = input.nextDouble();
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();

            PrismaSegitiga prismaSegitiga = new PrismaSegitiga(tinggiPrisma, sisiSatu, sisiDua, sisiAlas, tinggiSegitiga);
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
                        System.out.println("Nama: " + prismaSegitiga.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaSegitiga.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaSegitiga.hitungLuas());
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
            System.out.print("Masukkan sisi satu: ");
            double sisiSatu = input.nextDouble();
            System.out.print("Masukkan sisi dua: ");
            double sisiDua = input.nextDouble();
            System.out.print("Masukkan sisi alas: ");
            double sisiAlas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi satu: ");
            double tinggiSegitigaSatu = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi dua: ");
            double tinggiSegitigaDua = input.nextDouble(); 
            System.out.print("Masukkan tinggi segitiga sisi alas: ");
            double tinggiSegitigaAlas = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();

            LimasSegitiga limasSegitiga = new LimasSegitiga(tinggiLimas, sisiSatu, sisiDua, sisiAlas, tinggi, tinggiSegitigaSatu, tinggiSegitigaDua, tinggiSegitigaAlas);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS SEGITIGA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasSegitiga.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasSegitiga.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasSegitiga.hitungLuas());
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
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();

            PrismaPersegi prismaPersegi = new PrismaPersegi(tinggiLimas, sisi);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA PERSEGI ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaPersegi.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaPersegi.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaPersegi.hitungLuas());
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
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = input.nextDouble();

            LimasPersegi limasPersegi = new LimasPersegi(tinggiLimas, sisi, tinggiSegitiga);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS PERSEGI ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasPersegi.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasPersegi.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasPersegi.hitungLuas());
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
            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = input.nextDouble();
            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();

            PrismaPersegiPanjang prismaPersegiPanjang = new PrismaPersegiPanjang(tinggiLimas, sisiPendek, sisiPanjang);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA PERSEGI PANJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaPersegiPanjang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaPersegiPanjang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaPersegiPanjang.hitungLuas());
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
            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = input.nextDouble();
            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi pendek: ");
            double tinggiSegitigaSisiPendek = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi panjang: ");
            double tinggiSegitigaSisiPanjang = input.nextDouble();

            LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(tinggiLimas, sisiPendek, sisiPanjang, tinggiSegitigaSisiPendek, tinggiSegitigaSisiPanjang);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS PERSEGI PANJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasPersegiPanjang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasPersegiPanjang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasPersegiPanjang.hitungLuas());
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
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();
            System.out.print("Masukkan sisi datar: ");
            double sisiDatar = input.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            double sisiMiring = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(tinggiPrisma, sisiDatar, sisiMiring, tinggi);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA JAJAR GENJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaJajarGenjang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaJajarGenjang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaJajarGenjang.hitungLuas());
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
            System.out.print("Masukkan sisi datar: ");
            double sisiDatar = input.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            double sisiMiring = input.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi datar: ");
            double tinggiSegitigaSisiDatar = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi miring: ");
            double tinggiSegitigaSisiMiring = input.nextDouble();

            LimasJajarGenjang limasJajarGenjang = new LimasJajarGenjang(tinggiLimas, sisiDatar, sisiMiring, tinggi, tinggiSegitigaSisiDatar, tinggiSegitigaSisiMiring);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS JAJAR GENJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasJajarGenjang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasJajarGenjang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasJajarGenjang.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 9) {
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();
            System.out.print("Masukkan sisi atas: ");
            double sisiAtas = input.nextDouble();
            System.out.print("Masukkan sisi alas: ");
            double sisiAlas = input.nextDouble();
            System.out.print("Masukkan sisi miring satu: ");
            double sisiMiringSatu = input.nextDouble();
            System.out.print("Masukkan sisi miring dua: ");
            double sisiMiringDua = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            PrismaTrapesium prismaTrapesium = new PrismaTrapesium(tinggiPrisma, sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA TRAPESIUM ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaTrapesium.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaTrapesium.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaTrapesium.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 10) {
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan sisi atas: ");
            double sisiAtas = input.nextDouble();
            System.out.print("Masukkan sisi alas: ");
            double sisiAlas = input.nextDouble();
            System.out.print("Masukkan sisi miring satu: ");
            double sisiMiringSatu = input.nextDouble();
            System.out.print("Masukkan sisi miring dua: ");
            double sisiMiringDua = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi atas: ");
            double tinggiSegitigaSisiAtas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi alas: ");
            double tinggiSegitigaSisiAlas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi miring satu: ");
            double tinggiSegitigaSisiMiringSatu = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi miring dua: ");
            double tinggiSegitigaSisiMiringDua = input.nextDouble();

            LimasTrapesium limasTrapesium = new LimasTrapesium(tinggiLimas, sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi, tinggiSegitigaSisiAtas, tinggiSegitigaSisiAlas, tinggiSegitigaSisiMiringSatu, tinggiSegitigaSisiMiringDua);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS JAJAR GENJANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasTrapesium.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasTrapesium.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasTrapesium.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 11) {
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();
            System.out.print("Masukkan diagonal satu: ");
            double diagonalSatu = input.nextDouble();
            System.out.print("Masukkan diagonal dua: ");
            double diagonalDua = input.nextDouble();

            PrismaBelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(tinggiPrisma, sisi, diagonalSatu, diagonalDua);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA BELAH KETUPAT ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaBelahKetupat.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaBelahKetupat.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaBelahKetupat.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 12) {
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();
            System.out.print("Masukkan diagonal satu: ");
            double diagonalSatu = input.nextDouble();
            System.out.print("Masukkan diagonal dua: ");
            double diagonalDua = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi: ");
            double tinggiSegitigaSisi = input.nextDouble();

            LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(tinggiLimas, sisi, diagonalSatu, diagonalDua, tinggiSegitigaSisi);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS BELAH KETUPAT ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasBelahKetupat.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasBelahKetupat.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasBelahKetupat.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 13) {
            System.out.print("Masukkan tinggi prisma: ");
            double tinggiPrisma = input.nextDouble();
            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = input.nextDouble();
            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = input.nextDouble();
            System.out.print("Masukkan diagonal satu: ");
            double diagonalSatu = input.nextDouble();
            System.out.print("Masukkan diagonal dua: ");
            double diagonalDua = input.nextDouble();

            PrismaLayangLayang prismaLayangLayang = new PrismaLayangLayang(tinggiPrisma, diagonalSatu, diagonalDua, sisiPendek, sisiPanjang);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU PRISMA LAYANG LAYANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + prismaLayangLayang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + prismaLayangLayang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + prismaLayangLayang.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 14) {
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = input.nextDouble();
            System.out.print("Masukkan sisi pendek: ");
            double sisiPendek = input.nextDouble();
            System.out.print("Masukkan sisi panjang: ");
            double sisiPanjang = input.nextDouble();
            System.out.print("Masukkan diagonal satu: ");
            double diagonalSatu = input.nextDouble();
            System.out.print("Masukkan diagonal dua: ");
            double diagonalDua = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi pendek: ");
            double tinggiSegitigaSisiPendek = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga sisi panjang: ");
            double tinggiSegitigaSisiPanjang = input.nextDouble();

            LimasLayangLayang limasLayangLayang = new LimasLayangLayang(tinggiLimas, diagonalSatu, diagonalDua, sisiPendek, sisiPanjang, tinggiSegitigaSisiPendek, tinggiSegitigaSisiPanjang);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU LIMAS LAYANG LAYANG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + limasLayangLayang.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + limasLayangLayang.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + limasLayangLayang.hitungLuas());
                        break;
                    case 4:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 15) {
            System.out.print("Masukkan tinggi tabung: ");
            double tinggiTabung = input.nextDouble();
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            

            Tabung tabung = new Tabung(tinggiTabung, jariJari);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU TABUNG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Kembali");
//                System.out.println("3. Hitung Luas Permukaan");
//                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-3): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + tabung.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + tabung.hitungVolume());
                        break;
                    case 3:
                        kembali = true;
                        break;
//                    case 3:
//                        System.out.println("Luas Permukaan: " + tabung.hitungLuas());
//                        break;
//                    case 4:
//                        kembali = true;
//                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 16) {
            System.out.print("Masukkan tinggi kerucut: ");
            double tinggiKerucut = input.nextDouble();
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            

            Kerucut kerucut = new Kerucut(tinggiKerucut, jariJari);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU KERUCUT ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Kembali");
//                System.out.println("3. Hitung Luas Permukaan");
//                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-3): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + kerucut.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + kerucut.hitungVolume());
                        break;
                    case 3:
                        kembali = true;
                        break;
//                    case 3:
//                        System.out.println("Luas Permukaan: " + tabung.hitungLuas());
//                        break;
//                    case 4:
//                        kembali = true;
//                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if (pilihan == 17) {
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            Bola bola = new Bola(jariJari);
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU BOLA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Kembali");
                System.out.print("Pilih menu (1-4): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + kerucut.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + kerucut.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + tabung.hitungLuas());
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
    
    public static void menuBangunRuangTerpotong(Scanner input){
        System.out.println("\n=== MENU BANGUN RUANG TERPOTONG ===");
        System.out.println("1. Kerucut Terpancung");
        System.out.println("2. Tembereng Bola");
        System.out.println("3. Juring Bola");
        System.out.println("4. Cincin Bola");
        
        System.out.print("Pilih bangun ruang terpotong (1-4): ");
        int pilihan = input.nextInt();
        boolean kembali;
        
        if (pilihan == 1) {
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan jari-jari kecil: ");
            double jariJariKecil = input.nextDouble();
            System.out.print("Masukkan jari-jari besar: ");
            double jariJariBesar = input.nextDouble();
            
            KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(tinggi, jariJariKecil, jariJariBesar);

            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU KERUCUT TERPANCUNG ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Sisi Miring");
                System.out.println("4. Hitung Luas");
                System.out.println("5. Kembali");
                System.out.print("Pilih menu (1-5): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + kerucutTerpancung.getNama());
                        break;
                    case 2:
                        System.out.println("Luas: " + kerucutTerpancung.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Sisi Miring: " + kerucutTerpancung.hitungSisiMiring());
                        break;
                    case 4:
                        System.out.println("Luas: " + kerucutTerpancung.hitungLuas());
                        break;
                    case 5:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if(pilihan == 2) {
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            TemberengBola temberengBola = new TemberengBola(tinggi, jariJari);
            
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU TEMBERENG BOLA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Hitung Luas Permukaan Melengkung");
                System.out.println("5. Hitung Luas Bidang Potong");
                System.out.println("6. Kembali");
                System.out.print("Pilih menu (1-6): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + temberengBola.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + temberengBola.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + temberengBola.hitungLuas());
                        break;
                    case 4:
                        System.out.println("Luas Permukaan Melengkung: " + temberengBola.hitungLuasPermukaanMelengkung());
                        break;
                    case 5:
                        System.out.println("Luas Bidang Potong: " + temberengBola.hitungLuasBidangPotong());
                        break;
                    case 6:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if(pilihan == 3) {
            System.out.print("Masukkan alpha derajat: ");
            double alphaDerajat = input.nextDouble();
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            JuringBola juringBola = new JuringBola(alphaDerajat, jariJari);
            
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU JURING BOLA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Hitung Luas Permukaan Melengkung");
                System.out.println("5. Hitung Luas Bidang Segitiga Kerucut");
                System.out.println("6. Kembali");
                System.out.print("Pilih menu (1-6): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + juringBola.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + juringBola.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + juringBola.hitungLuas());
                        break;
                    case 4:
                        System.out.println("Luas Permukaan Melengkung: " + juringBola.hitungLuasPermukaanMelengkung());
                        break;
                    case 5:
                        System.out.println("Luas Bidang Segitiga Kerucut: " + juringBola.hitungLuasBidangSegitigaKerucut());
                        break;
                    case 6:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
        else if(pilihan == 4) {
            System.out.print("Masukkan jarak bidang potong bawah dari pusat bola: ");
            double h1 = input.nextDouble();
            System.out.print("Masukkan jarak bidang potong atas dari pusat bola: ");
            double h2 = input.nextDouble();
            System.out.print("Masukkan jari-jari: ");
            double jariJari = input.nextDouble();
            
            CincinBola cincinBola = new CincinBola(h1, h2, jariJari);
            
            kembali = false;
            while(!kembali) {
                System.out.println("\n=== MENU JURING BOLA ===");
                System.out.println("1. Tampilkan Nama");
                System.out.println("2. Hitung Volume");
                System.out.println("3. Hitung Luas Permukaan");
                System.out.println("4. Hitung Jari Jari Alas Bawah");
                System.out.println("5. Hitung Jari Jari Alas Atas");
                System.out.println("6. Kembali");
                System.out.print("Pilih menu (1-6): ");
                int subPilihan = input.nextInt();

                switch (subPilihan) {
                    case 1:
                        System.out.println("Nama: " + cincinBola.getNama());
                        break;
                    case 2:
                        System.out.println("Volume: " + cincinBola.hitungVolume());
                        break;
                    case 3:
                        System.out.println("Luas Permukaan: " + cincinBola.hitungLuas());
                        break;
                    case 4:
                        System.out.println("Hitung Jari Jari Alas Bawah: " + cincinBola.hitungJariJariAlasBawah());
                        break;
                    case 5:
                        System.out.println("Hitung Jari Jari Alas Atas: " + cincinBola.hitungJariJariAlasAtas());
                        break;
                    case 6:
                        kembali = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }
}
