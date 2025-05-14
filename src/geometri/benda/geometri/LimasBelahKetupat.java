/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class LimasBelahKetupat extends BelahKetupat{
    public double tinggiLimas;

    public LimasBelahKetupat(double tinggiLimas, double sisi, double diagonalSatu, double diagonalDua) {
        super(sisi, diagonalSatu, diagonalDua);
        this.tinggiLimas = tinggiLimas;
    }
     public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Belah Ketupat";
    }
    
}
