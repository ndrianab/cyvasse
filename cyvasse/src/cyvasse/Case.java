/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nraza
 */
public class Case extends JLabel {
    
    public JPanel panel;
    public JLabel caseLabel;
    public  int id ;
    /*Pion qui sera contenu par la case en question*/
    private Pion pion;
    private int abscisse;
    private int ordonnee;
    private int numeroCase;
    private String couleur;
    //private ImageIcon imageCase;
    
    
    public Case(){}
    
    /*
    //Construction (en paramètre il prend le pion qui va se retrouver sur la case
    public Case(int abscisse, int ordonnee, int numero){ //, String couleur) {
        setLocationCase(abscisse, ordonnee, numero);
        //this.couleur = couleur;
    }*/
    
    public Case(int numero){
        numeroCase = numero;
        caseLabel = new JLabel();
    	//caseLabel.setText("case vide");
    	this.panel = new JPanel();
        caseLabel.setIcon(null);
        caseLabel.setPreferredSize(new Dimension(80,80));
        //imageCase = null;
        
        //Boucles pour la couleur des cases
        for (int i = 1 ; i <=36 ; i++){
            if (this.numeroCase == i){
                this.panel.setBackground(Color.BLUE);
            } 
        }
        for (int i = 37 ; i <= 45 ; i++){
            if (this.numeroCase == i){
                this.panel.setBackground(Color.GRAY);
            }
        }
        for (int i = 46 ; i <= 81 ; i++){
            if (this.numeroCase == i){
                this.panel.setBackground(Color.RED);
            }
        }
        
        this.panel.setPreferredSize(new Dimension(80, 80));
        this.panel.setBorder(BorderFactory.createLineBorder(Color.white));
        this.panel.setVisible(true);
        this.panel.add(caseLabel);
        
    }
    
    
    
    
    /***********Gestion des pions et de l'occupation de la case************/
    
    //Getter qui permet de retourner le pion sur le case donnée
    //Si case vide, retournera null
    public Pion getPion(int numeroCase) { return pion; }
    
    public int getAbscisse(int numero){ return abscisse; }
    public int getOrdonnee(int numero){ return ordonnee; }
    public int getNumero(int numero) { return numero;}

    //Setter qui permet de mettre un objet de la Classe Pion sur cette case
    public void ajoutPion(Pion pion, int numeroCase) {
        this.pion = pion;
        caseLabel.setText(pion.getNom(pion));
        //this.panel.setOpaque(false);
        caseLabel.setIcon(pion.imagePion);
        //this.imageCase = Pion.getImage(pion); //= pion.imagePion;
    }
    

    //Méthode qui permet de verifier si la case est occupée ou non 
    public boolean estOccupee(int numeroCase)
    {
        Pion lePion = getPion(numeroCase);
        if (lePion == null){return false;}
        else return true;	
    }
    /*
    public void setPion(int numeroJoueur, String nomPion){
        
    }*/
    
    
    
    
}
