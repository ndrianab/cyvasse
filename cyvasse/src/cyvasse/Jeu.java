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
    private boolean continuer = true;
    private final boolean roiCapturé = false;
    
    FenetreDeJeu fenetredejeu;
    
    public Jeu(){
        
        this.fenetredejeu = new FenetreDeJeu();
        
        /******Construction du jeu*****/
        
        //lePlateau = new Plateau();//Création du plateau de jeu
        Joueur Joueur1 = new Joueur("Joueur 1", 1, "bleu");//Création du joueur 1 qui occupe la partie haute du plateau à l'écran
        Joueur Joueur2 = new Joueur("Joueur 2", 2, "rouge");//Création du joueur 2 qui occupe la partie basse du plateau à l'écran
        
        joueurs = new ArrayList<Joueur>();
        joueurs.add(Joueur1);
        joueurs.add(Joueur2);

    }
    
    
    public void unTour(int tour_joueur){
        do{
            
        }while(continuer);  
    }
    
    
    /*
    public void update() {
        lePlateau.updateComponents();
    }
    public JComponent getPisteComponent() {
        return lePlateau.createComponent();
    }*/
    
    
    public void finPartie(){
        //Fin de la partie si le Roi est capturé i.e mangé par un adversaire
        
        if (roiCapturé)
        {
            continuer = false;
        }
        
    }
    
    
    public int changementTour(int leJoueur)
    {
        if (leJoueur == 1){return 2;}
        else {return 1;}
    }
}
