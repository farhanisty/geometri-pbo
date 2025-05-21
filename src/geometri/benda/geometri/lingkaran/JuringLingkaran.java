/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.lingkaran;

/**
 *
 * @author farhannivta
 */
public class JuringLingkaran extends Lingkaran {
    public double sudut; 
    
    public JuringLingkaran(double sudut, double jariJari) {
        super(jariJari);
        this.sudut = sudut;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * this.jariJari * this.jariJari * (this.sudut / 360.0);
    }

    // Hitung panjang busur juring
    public double hitungPanjangBusur() {
        return 2 * Math.PI * this.jariJari * (this.sudut / 360.0);
    }

    @Override
    public double hitungKeliling() {
        return hitungPanjangBusur() + 2 * this.jariJari;
    }
    
    @Override
    public String getNama() {
        return "Juring Lingkaran";
    }
}
