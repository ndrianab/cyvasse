/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nraza
 */
public class Plateau extends JPanel{
    
    
    //Création d'un tableau pour ranger les cases qui serviront à faire le plateau
    public Case[][] tableauCases;
    
    
    //Constructeur plateau vide
    public Plateau (){
        tableauCases = new Case[9][9];
        //Construction du tableau/plateau
        for (int i = 1; i <=10; i++){
            for (int j = 1; j <= 10; j++){
                tableauCases[i][j] = new Case();
            }
        }
    }
    
    
    
    
    /*****Pour interface*******/

    //Au moment où tu crées ta fenêtre tu instancies tes cases
    
    
    
    /*
    private JLabel [] labelsCases;//Label pour l'affichage de la case
    //Crée les labels contenant les cases pour l'affichage
    public JComponent createComponent(){
        
        //Création des contrôles pour le plateau de cases ( interface graphique)
        
        JPanel p = new JPanel();
        labelsCases = new JLabel[64];
        
        
        
        return p;
    }
    
    public void updateComponents(){
        //Instructions en cas de déplacement i guess
        
    }
    
    //Méthode qui permet aux joueurs en début de partie de placer leurs pions avec un drag&drop
    public void miseEnPlacePlateau(){
        
    }*/
    
}
