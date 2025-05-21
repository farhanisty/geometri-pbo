/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran.bola;

/**
 *
 * @author farhannivta
 */
public class CincinBola extends Bola {
    public double h1;   // jarak bidang potong bawah dari pusat bola
    public double h2;   // jarak bidang potong atas dari pusat bola

    public CincinBola(double h1, double h2, double jariJari) {
        super(jariJari);
        this.h1 = h1;
        this.h2 = h2;
    }
    
    @Override
    public double hitungLuas() {
        double h = hitungTinggi();
        return 2 * Math.PI * this.jariJari * h;
    }

    @Override
    public double hitungVolume() {
        double a = hitungJariJariAlasBawah();
        double b = hitungJariJariAlasAtas();
        double h = hitungTinggi();
        return (Math.PI * h * h / 6) * (3 * a + 3 * b + h);
    }
    
    @Override
    public String getNama() {
        return "Cincin Bola";
    }

    public double hitungJariJariAlasBawah() {
        return Math.sqrt(this.jariJari * this.jariJari - h1 * h1);
    }

    public double hitungJariJariAlasAtas() {
        return Math.sqrt(this.jariJari * this.jariJari - h2 * h2);
    }

    public double hitungTinggi() {
        return Math.abs(h1 - h2);
    }
}
