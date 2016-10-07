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
    String seutu;
    
    public Kuljettaja(int uusiKm, String uusiSeutu) {
        km = uusiKm;
        seutu = uusiSeutu;
    }
    
    public int km() {
        return km;
    }
    
}
