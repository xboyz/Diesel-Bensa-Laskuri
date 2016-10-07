/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiril Tsereh
 */
public class Seutu {
    double hinta;
    
    public Seutu() {
        
    }
    
    
    public double pk(String pa) {
        if (pa == "98") {
            hinta = 1.42; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.42; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.42; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    
}
