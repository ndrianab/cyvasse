/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author nraza
 */
public class Plateau {
    
    
    //Création d'un tableau pour ranger les cases qui serviront à faire le plateau
    Case[][] tableauCases;
    
    /*
    //On construit un plateau vide
    public Plateau (){
        tableauCases = new Case[8][8];
		for (int ctr = 0; ctr <= 7; ctr++){
			for (int ctr1 = 0; ctr1 <= 7; ctr1++){
				tableauCases[ctr][ctr1] = new Case();
                        }
                }
	}
    }*/
    
    
    public JComponent createComponent(){
        
        JPanel p = new JPanel();
        return null;
        
    }
    
    public void updateComponents(){
        
    }
    
}
