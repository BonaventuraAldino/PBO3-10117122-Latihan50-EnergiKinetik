/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan50.energikinetik;

/**
 *
 * @author Aldy Senda
 */
public class Energi {
    private int kecepatan;
    private double massa;

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double hitungEnergiKinetik(){
        return 0.5*massa*(kecepatan*kecepatan);
        
    }
    
    public double hitungUsaha(){
        return 0.5*massa*(kecepatan*kecepatan) - 0.5 * massa *(0*0);
    }
        
}
