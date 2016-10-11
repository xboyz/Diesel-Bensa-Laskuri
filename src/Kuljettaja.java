/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xboyz Inc
 */
public class Kuljettaja {

    int km;                 //kilometrit
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
        } else if (syotSeutu == "Turun seutu") {
            hinta = seutu.turku(pa);
        } else if (syotSeutu == "Tampereen seutu") {
            hinta = seutu.tampere(pa);
        } else if (syotSeutu == "Oulun seutu") {
            hinta = seutu.oulu(pa);
        } else if (syotSeutu == "Jyväskylän seutu") {
            hinta = seutu.jyvaskyla(pa);
        } else if (syotSeutu == "Porin seutu") {
            hinta = seutu.pori(pa);
        } else if (syotSeutu == "Seinäjoen seutu") {
            hinta = seutu.seinajoki(pa);
        } else if (syotSeutu == "Koko Suomi") {
            hinta = seutu.kokoSuomi(pa);
        }
        return hinta;
    }
}
