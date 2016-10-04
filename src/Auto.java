/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiril Tsereh
 */
public class Auto {
    
    private double vakuutus, vero, kulutus;
    private String pa, merkki, malli;
    
    public Auto(String uusiPa, double uusiKulutus, double uusiVero, double uusiVakuutus) {
        pa = uusiPa;
        kulutus = uusiKulutus;
        vero = uusiVero;
        vakuutus = uusiVakuutus;
    }
    
    public double kiinteätVkt() {
        double vkt = vero + vakuutus;
        return vkt;
    }
    
    
    
}
