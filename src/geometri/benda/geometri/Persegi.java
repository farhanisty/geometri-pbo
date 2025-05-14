/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class Persegi extends BangunDatar {

    public double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    @Override
    public double hitungKeliling() {
        return this.sisi * 4;
    }

    @Override
    public String getNama() {
        return "Persegi";
    }
    
}
