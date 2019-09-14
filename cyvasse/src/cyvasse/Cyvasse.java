/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import javax.swing.JFrame;

/**
 *
 * @author nraza
 */
public class Cyvasse{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Création du jeu 
        Jeu j = new Jeu();
        
        /**Mise en place de la fenêtre d'affichage**/
        JFrame fenetre = new JFrame("Jeu de Cyvasse");
        fenetre.add(j.getPisteComponent());
        fenetre.pack();
        fenetre.setVisible(true);
        
        
        /**Ajout de contrôles à la fenêtre d'affichage**/
        
        //Ajout du plateau de jeu 
        

        
        
        
        /*Déroulement du jeu depuis la classe Jeu*/
        
        
        /**Mise en place de la partie **/
        
        //Les joueurs saisissent leurs noms depuis une fenêtre
        
        
        //Joueur1 pose ses pions//possibilité de poser au hasard
        
        
        //Joueur2 pose les siens //possibilité de poser au hasard
        
        
        
        //Le jeu identifie le joueur dont le roi est le plus proche du milieu==> commence la partie
        
        
        
    }
    
}
