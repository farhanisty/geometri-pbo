/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.benda.geometri;

/**
 *
 * @author farhannivta
 */
public class LimasLayangLayang extends LayangLayang{
    public double tinggiLimas;

    public LimasLayangLayang(double tinggiLimas, double tinggiLayangLayang, double diagonalSatu, double diagonalDua, double sisiPendek, double sisiPanjang) {
        super(diagonalSatu, diagonalDua, sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
    }
    
    public double hitungVolume() {
        return this.tinggiLimas * this.hitungLuas() / 3;
    }
    
    @Override
    public String getNama() {
        return "Limas Layang Layang";
    }
    
}
