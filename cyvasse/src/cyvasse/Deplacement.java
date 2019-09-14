/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

/**
 *
 * @author nraza
 */
public class Deplacement {

    //Déplacements sur les deux axes
    private double deplacementX;
    private double deplacementY;

    //Pour gérer les coordonnées de départ et d'arrivée
    private Position arrivee;
    private Position depart;


    //Constructeur
    public Deplacement(Position depart, Position arrivee)
    {
            this.arrivee = arrivee;
            this.depart = depart;
            this.deplacementX = arrivee.getColonne() - depart.getColonne();
            this.deplacementY = arrivee.getLigne() - depart.getLigne();
    }

    

    //Getters et setters
    public double getDeplacementX() {
            return deplacementX;
    }

    public double getDeplacementY() {
            return deplacementY;
    }

    public Position getArrivee() {
            return arrivee;
    }

    public Position getDepart() {
            return depart;
    }

    //Bool pour vérifie s'il n y a pas eu de déplacement
    public boolean isNul(){
            return deplacementX == 0 && deplacementY == 0;
    }
    
}
