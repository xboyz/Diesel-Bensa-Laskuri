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
public class AjoneuvOhjain {
    private Ajoneuvo model;
    private GUI näkymä;
    
    public AjoneuvOhjain(Ajoneuvo model, GUI näkymä) {
        this.model = model;
        this.näkymä = näkymä;
    }
    
    public static void main(String[] args) {
        String merkki = "";
        String malli = "";
        double vero = 0;
        double kulutus = 0;
        double vakuutus = 0;
        Ajoneuvo model = new Ajoneuvo(merkki, malli, vero, kulutus, vakuutus);
        GUI näkymä = new GUI();
        AjoneuvOhjain ohjain = new AjoneuvOhjain(model, näkymä);
        näkymä.rekisteröiOhjain(ohjain);
    }
     
}
