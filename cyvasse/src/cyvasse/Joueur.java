/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import java.util.Vector;

/**
 *
 * @author nraza
 */
public class Joueur {
    
    //Attributs de la classe joueur
    private String nom;
    private int numeroJoueur;
    private Vector<Pion> lesPions = new Vector<Pion>(); //array pour ranger les pions du joueur
    private Vector<Pion> lesPrises = new Vector<Pion>(); //array pour ranger les prises du joueur
    private String couleur; 
    

    //Getter pour retourner le nom du joueur 
    public String getNomJoueur() {return nom;}
    
    public int getNumeroJoueur() {return numeroJoueur;}
        
    public String getCouleurJoueur(){return couleur;}
    
    //Gestion de la relation du joueur avec la case
    private Case laCase;
    public Case getCase(){return laCase;}
    
    
    //Relation du joueur avec une case
    
    
    
    //Constructeur
    public Joueur(String n, int i, String c){
        nom = n;
        numeroJoueur = i;
        couleur = c;
    }
    
}
