package projekti;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author Xboyz Inc
 */
public class GUI extends JFrame {
    private AjoneuvOhjain ohjain;
    private JPanel sisältöpaneeli;
    private JButton hyväksy;
    
    public GUI() {
        alustaKomponentit();
    }
    
    public void rekisteröiOhjain(AjoneuvOhjain ohjain) {
        this.ohjain = ohjain;
    }
    
    private void alustaKomponentit() {
        setTitle("Kululaskuri");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sisältöpaneeli = new JPanel();
        hyväksy = new JButton("Hyväksy");
        
        sisältöpaneeli.add(hyväksy);
        setContentPane(sisältöpaneeli);
    }
}
