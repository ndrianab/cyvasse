/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nraza
 */
public abstract class Pion {
    
    //On Attributs
    private String nom;
    private int portee = 1;
    private int puissance;
    //On attribue un numéro et une couleur pour le relier à un joueur
    private int numeroJoueur;
    private String couleur;
    public boolean estCapture = false;
    public ImageIcon imagePion;
    
   
    
    //private String image = "\\images\\pions\\dragon.png";
    
    /*Constructeur pour initialiser le nom et le joueur d'un objet Pion*/
    public Pion(String nom, int numeroJoueur, int puissance ){
        JLabel labelPion = new JLabel();
        setNom(nom);
        setNumeroJoueur(numeroJoueur);
        this.couleur = setCouleurPion(numeroJoueur);
        setPuissance(puissance);
        setImage(nom);
        this.estCapture = false;
        
    }
    //voir comment ajouter la couleur au pion ?
    
    
    
    //Getters et setters
    public void setNom(String nom) { this.nom = nom; }
    
    public String setCouleurPion (int numeroJoueur){
        String s = null;
        if (numeroJoueur == 1) { s = "Bleu"; }
        else if (numeroJoueur == 2){ s = "Rouge"; }
        return s;
    }
    public void setNumeroJoueur(int numeroJoueur) { this.numeroJoueur = numeroJoueur;}
    
    public void setPuissance (int puissance) { this.puissance = puissance;}
    

    
    public String getNom(Pion pion) { return nom;}
    public String getCouleurPion(Pion pion){return couleur;}
    public int getNumeroJoueur(Pion pion) { return numeroJoueur;}
    public static ImageIcon getImage(Pion pion){ return pion.imagePion;}

    
    
    public void setImage(String nom){
        switch (nom)
        {

            case "Roi" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\king.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
             
            case "Dragon" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\dragon.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Elephant" : imagePion  = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\elephant.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Trebuchet" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\trebuchet.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Catapulte" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\catapult.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Arbalétrier" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\crossbowman.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Cavalier léger" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\lighthorse.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Cavalier lourd" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\heavyhorse.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Lancier" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\spearman.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            case "Populace" : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\rabble.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
                
            default : imagePion = new ImageIcon(new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\mountain.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
                break;
        }

    }
    /*
    ImageIcon imageRoi = new ImageIcon("\\images\\pions\\king.png");
    public ImageIcon imageDragon = new ImageIcon("\\images\\pions\\dragon.png");
    public ImageIcon imageElephant = new ImageIcon("\\images\\pions\\elephant.png");
    public ImageIcon imageTrebuchet = new ImageIcon("\\images\\pions\\trebuchet.png");
    public ImageIcon imageCatapulte = new ImageIcon("\\images\\pions\\catapult.png");
    public ImageIcon imageArbaletrier = new ImageIcon("\\images\\pions\\crossbowman.png");
    public ImageIcon imageCavLourde= new ImageIcon("\\images\\pions\\heavyhorse.png");
    public ImageIcon imageCavLegere = new ImageIcon("\\images\\pions\\lighthorse.png");
    public ImageIcon imageLance = new ImageIcon("\\images\\pions\\spearman.png");
    public ImageIcon imagePopulace = new ImageIcon("\\images\\pions\\rabble.png");
    */
}
