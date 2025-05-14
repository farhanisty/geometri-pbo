/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class BelahKetupat extends BangunDatar {
    public double sisi;
    public double diagonalSatu;
    public double diagonalDua;
    
    public BelahKetupat(double sisi, double diagonalSatu, double diagonalDua) {
        this.sisi = sisi;
        this.diagonalDua = diagonalDua;
        this.diagonalSatu = diagonalSatu;
    }

    @Override
    public double hitungLuas() {
        return this.diagonalSatu * this.diagonalDua / 2;
    }

    @Override
    public double hitungKeliling() {
        return this.sisi * 4;
    }

    @Override
    public String getNama() {
        return "Belah Ketupat";
    }
    
}
