/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class Segitiga extends BangunDatar {
    public double sisiSatu;
    public double sisiDua;
    public double sisiAlas;
    public double tinggi;
    
    public Segitiga(double sisiSatu, double sisiDua, double sisiAlas, double tinggi) {
        this.sisiSatu = sisiSatu;
        this.sisiDua = sisiDua;
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return this.sisiAlas * this.tinggi / 2;
    }

    @Override
    public double hitungKeliling() {
        return this.sisiSatu + this.sisiDua + this.sisiAlas;
    }

    @Override
    public String getNama() {
        return "Segitiga";
    }
    
}
