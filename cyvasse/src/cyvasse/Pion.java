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
public abstract class Pion {
    
    //On lui attribut un nom
    private String nom;
    
    //On attribue un numéro pour le relier à un joueur
    private int numeroJoueur;
    
    //Création d'une string pour le lien vers l'image
    private String image;
    
    
    /*Constructeur pour initialiser le nom et le joueur d'un objet Pion*/
    public Pion(String nom, int numeroJoueur, String image) {
        setNom(nom);
        setNumeroJoueur(numeroJoueur);
        setImage(image);
    }
    
    
    //Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(int numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }
        
    public String getImage(){
        return image;
    }
    
    public void setImage(String image){
        this.image = image;
    }
    
    
    //Création d'un méthode qui permet de vérifier la validité du déplacement du pion
    public abstract boolean estValide(Deplacement deplacement);
}
