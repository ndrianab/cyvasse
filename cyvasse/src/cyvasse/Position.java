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
public class Position {
 
    //Création de variables type int pour récupérer les coordonnées de la position
    private int ligne; 
    private int colonne; 
        
    //Constructeur
    public Position(int colonne, int ligne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    
    //Getters et setters 
    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public boolean equals(Position position) {
        return position.getColonne() == this.getColonne() && position.ligne == this.ligne;
    }
}
