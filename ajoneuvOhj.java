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
    private Ajoneuvo malli;
    private GUI näkymä;
    
    public AjoneuvOhjain(Ajoneuvo malli, GUI näkymä) {
        this.malli = malli;
        this.näkymä = näkymä;
    }
    
    public static void main(String[] args) {
        GUI näkymä = new GUI();
        AjoneuvOhjain ohjain = new AjoneuvOhjain(malli, näkymä);
        näkymä.rekisteröiOhjain(ohjain);
    }
     
}
