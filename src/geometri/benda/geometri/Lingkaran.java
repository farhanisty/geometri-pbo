/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class Lingkaran extends BangunDatar {
    public static final double PI = 3.14;
    public double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Lingkaran.PI * (this.jariJari * this.jariJari);
    }

    @Override
    public double hitungKeliling() {
        return Lingkaran.PI * this.jariJari * 2;
    }

    @Override
    public String getNama() {
        return "Lingkaran";
    }
    
}
