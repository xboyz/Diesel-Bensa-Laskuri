/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekti;

/**
 *
 * @author Kiril Tsereh
 */
public class Ajoneuvo {
    private double vakuutus, vero, kulutus;
    private String merkki, malli;
    
    public Ajoneuvo(String uusiMerkki, String uusiMalli, double uusiVakuutus, double uusiVero, double uusiKulutus) {
        merkki = uusiMerkki;
        malli = uusiMalli;
        vakuutus = uusiVakuutus;
        vero = uusiVero;
        kulutus = uusiKulutus;
    }
    
}
