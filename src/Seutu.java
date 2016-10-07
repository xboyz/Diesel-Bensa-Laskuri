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
    
    public double pk(String pa) {
        if (pa == "98") {
            hinta = 1.485; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.408; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.211; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double jyvaskyla(String pa) {
        if (pa == "98") {
            hinta = 1.481; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.403; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.213; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double tampere(String pa) {
        if (pa == "98") {
            hinta = 1.471; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.390; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.196; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double oulu(String pa) {
        if (pa == "98") {
            hinta = 1.447; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.363; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.171; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double pori(String pa) {
        if (pa == "98") {
            hinta = 1.407; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.371; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.186; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double turku(String pa) {
        if (pa == "98") {
            hinta = 1.470; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.386; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.196; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double seinajoki(String pa) {
        if (pa == "98") {
            hinta = 1.461; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.392; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.199; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    public double kokoSuomi(String pa) {
        if (pa == "98") {
            hinta = 1.471; // Tohon 98 pk-seutu hinta
        }
        else if (pa == "95") {
            hinta = 1.393; // Tohon 95 pk-seutu hinta
        }
        else if (pa == "d") {
            hinta = 1.119; // Tohon diesel pk-seutu hinta
        }
        return hinta;
    }
    
}
