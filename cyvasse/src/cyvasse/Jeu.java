/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;
import java.util.*;
import javax.swing.JComponent;

/**
 *
 * @author nraza
 */
public class Jeu {
    
    private Plateau lePlateau;
    private List<Joueur> joueurs;
    private final boolean continuer = true;
    
    public Jeu(){
        /******Construction du jeu*****/
        
        lePlateau = new Plateau();//Création du plateau de jeu
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        
        joueurs = new ArrayList<Joueur>();
        joueurs.add(j1);
        joueurs.add(j2);

    }
    
    
    public void unTour(){
        if (continuer){
            
        }
    }
    
    
    
    public void update() {
        lePlateau.updateComponents();
    }
    public JComponent getPisteComponent() {
        return lePlateau.createComponent();
    }
    
    
    public void finPartie(){
        
    }
}
