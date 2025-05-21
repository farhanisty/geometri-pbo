/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran;

/**
 *
 * @author farhannivta
 */
public class TemberengLingkaran extends Lingkaran {
    private double sudutTheta;
    
    public TemberengLingkaran(double jariJari, double sudutTheta) {
        super(jariJari);
        this.sudutTheta = sudutTheta;
    }
    
    @Override
    public double hitungLuas() {
        double thetaRadian = Math.toRadians(this.sudutTheta);

        double luasJuring = (this.sudutTheta / 360.0) * Lingkaran.PI * this.jariJari * this.jariJari;

        double luasSegitiga = 0.5 * this.jariJari * this.jariJari * Math.sin(thetaRadian);

        // Luas tembereng = luas juring - luas segitiga
        return luasJuring - luasSegitiga;
    }
    
    @Override
    public double hitungKeliling() {
        double halfThetaRadian = Math.toRadians(this.sudutTheta / 2);

        double panjangBusur = (this.sudutTheta / 360.0) * 2 * Lingkaran.PI * this.jariJari;

        double taliBusur = 2 * this.jariJari * Math.sin(halfThetaRadian);

        return panjangBusur + taliBusur;
    }
    
    @Override
    public String getNama() {
        return "Tembereng Lingkaran";
    }
}
