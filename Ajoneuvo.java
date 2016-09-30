/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

/**
 *
 * @author Xboyz Inc
 */
public class Ajoneuvo {
    private double vakuutus, vero, kulutus;
    private String merkki, malli;
    
    public Ajoneuvo(String uusiMerkki, String uusiMalli, double uusiKulutus, double uusiVero, double uusiVakuutus) {
        merkki = uusiMerkki;
        malli = uusiMalli;
        kulutus = uusiKulutus;
        vero = uusiVero;
        vakuutus = uusiVakuutus;
    }
    
}
