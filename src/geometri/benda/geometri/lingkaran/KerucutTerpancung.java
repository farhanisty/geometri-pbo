/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran;

/**
 *
 * @author farhannivta
 */
public class KerucutTerpancung extends Lingkaran {
    public double jariJariKecil;
    public double tinggi;

    public KerucutTerpancung(double tinggi, double jariJariKecil, double jariJariBesar) {
        super(jariJariBesar);
        this.jariJariKecil = jariJariKecil;
    }
    
    public double hitungVolume() {
        return (1.0 / 3) * Lingkaran.PI * tinggi * (this.jariJari * this.jariJari + this.jariJari * this.jariJariKecil + this.jariJariKecil * this.jariJariKecil);
    }
    
    public double hitungSisiMiring() {
        return Math.sqrt(Math.pow(this.jariJari - this.jariJariKecil, 2) + Math.pow(tinggi, 2));
    }
    
    @Override
    public double hitungLuas() {
        double s = hitungSisiMiring();
        double luasSelimut = Math.PI * (this.jariJari + this.jariJariKecil) * s;
        double luasAlasBesar = Math.PI * this.jariJari * this.jariJari;
        double luasAlasKecil = Math.PI * this.jariJariKecil * this.jariJariKecil;
        return luasSelimut + luasAlasBesar + luasAlasKecil;
    }
    
    @Override
    public String getNama() {
        return "Kerucut Terpancung";
    }
}
