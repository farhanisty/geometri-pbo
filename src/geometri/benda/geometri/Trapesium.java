/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class Trapesium extends BangunDatar {
    public double sisiAtas;
    public double sisiAlas;
    public double sisiMiringSatu;
    public double sisiMiringDua;
    public double tinggi;
    
    public Trapesium(double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.sisiAtas = sisiAtas;
        this.sisiMiringSatu = sisiMiringSatu;
        this.sisiMiringDua = sisiMiringDua;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return (this.sisiAlas + this.sisiAtas) * this.tinggi / 2;
    }

    @Override
    public double hitungKeliling() {
        return this.sisiAlas + this.sisiMiringDua + this.sisiMiringSatu + this.sisiAtas;
    }

    @Override
    public String getNama() {
        return "Trapesium";
    }
    
}
