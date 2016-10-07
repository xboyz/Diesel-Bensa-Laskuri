/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiril Tsereh
 */
public class Kuljettaja {
    int km;
    double hinta;
    Seutu seutu = new Seutu();
    
    
    public Kuljettaja(int uusiKm, String uusiSeutu) {
        km = uusiKm;
    }
    
    public int km() {
        return km;
    }
    
    public double hinta(String syotSeutu, String pa) {
        if (syotSeutu == "PK-seutu") {
            hinta = seutu.pk(pa);
        }
        return hinta;
    }
    
}
