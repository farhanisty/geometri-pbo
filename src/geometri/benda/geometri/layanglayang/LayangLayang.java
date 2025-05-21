/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri.layanglayang;

import geometri.benda.geometri.BangunDatar;

/**
 *
 * @author farhannivta
 */
public class LayangLayang extends BangunDatar {
    public double diagonalSatu;
    public double diagonalDua;
    public double sisiPendek;
    public double sisiPanjang;
    
    public LayangLayang(double diagonalSatu, double diagonalDua, double sisiPendek, double sisiPanjang) {
        this.diagonalSatu = diagonalSatu;
        this.diagonalDua = diagonalDua;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
    }

    @Override
    public double hitungLuas() {
        return this.diagonalSatu * this.diagonalDua / 2;
    }

    @Override
    public double hitungKeliling() {
        return this.sisiPendek * 2 + this.sisiPanjang * 2;
    }

    @Override
    public String getNama() {
        return "Layang-layang";
    }
    
}
