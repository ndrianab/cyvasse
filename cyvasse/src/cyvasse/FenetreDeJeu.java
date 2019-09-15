/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

/**
 *
 * @author nraza
 */
public class FenetreDeJeu extends JFrame{
    
    
    /*********   Déclarations    *********/
    Random r = new Random();
    Boolean continuer = true;
    
    
    public JLabel montagne = new JLabel();
    public JPanel uneMontagne = new JPanel();
    public JButton boutonCommencer = new JButton("Commencer");//bouton de commencement du jeu
    public JButton boutonQuitter = new JButton("Quitter la partie");
    private JPanel lesBoutons = new JPanel();//Panel pour contenir les boutons
    public JPanel plateauDeJeu = new JPanel();//Création du panel qui va accueillir le plateau de cases
    
    //Instanciation des cases
    public Case case1 = new Case(1);
    public Case case2 = new Case(2);
    public Case case3 = new Case(3);
    public Case case4 = new Case(4);
    public Case case5 = new Case(5);
    public Case case6 = new Case(6);
    public Case case7 = new Case(7);
    public Case case8 = new Case(8);
    public Case case9 = new Case(9);
    
    public Case case10 = new Case(10);
    public Case case11 = new Case(11);
    public Case case12 = new Case(12);
    public Case case13 = new Case(13);
    public Case case14 = new Case(14);
    public Case case15 = new Case(15);
    public Case case16 = new Case(16);
    public Case case17 = new Case(17);
    public Case case18 = new Case(18);
    
    public Case case19 = new Case(19);
    public Case case20 = new Case(20);
    public Case case21 = new Case(21);
    public Case case22 = new Case(22);
    public Case case23 = new Case(23);
    public Case case24 = new Case(24);
    public Case case25 = new Case(25);
    public Case case26 = new Case(26);
    public Case case27 = new Case(27);
    
    public Case case28 = new Case(28);
    public Case case29 = new Case(29);
    public Case case30 = new Case(30);
    public Case case31 = new Case(31);
    public Case case32 = new Case(32);
    public Case case33 = new Case(33);
    public Case case34 = new Case(34);
    public Case case35 = new Case(35);
    public Case case36 = new Case(36);
    
    public Case case37 = new Case(37);
    public Case case38 = new Case(38);
    public Case case39 = new Case(39);
    public Case case40 = new Case(40);
    public Case case41 = new Case(41);
    public Case case42 = new Case(42);
    public Case case43 = new Case(43);
    public Case case44 = new Case(44);
    public Case case45 = new Case(45);
    
    public Case case46 = new Case(46);
    public Case case47 = new Case(47);
    public Case case48 = new Case(48);
    public Case case49 = new Case(49);
    public Case case50 = new Case(50);
    public Case case51 = new Case(51);
    public Case case52 = new Case(52);
    public Case case53 = new Case(53);
    public Case case54 = new Case(54);
    
    
    public Case case55 = new Case(55);
    public Case case56 = new Case(56);
    public Case case57 = new Case(57);
    public Case case58 = new Case(58);
    public Case case59 = new Case(59);
    public Case case60 = new Case(60);
    public Case case61 = new Case(61);
    public Case case62 = new Case(62);
    public Case case63 = new Case(63);
    
    public Case case64 = new Case(64);
    public Case case65 = new Case(65);
    public Case case66 = new Case(66);
    public Case case67 = new Case(67);
    public Case case68 = new Case(68);
    public Case case69 = new Case(69);
    public Case case70 = new Case(70);
    public Case case71 = new Case(71);
    public Case case72 = new Case(72);
   
    public Case case73 = new Case(73);
    public Case case74 = new Case(74);
    public Case case75 = new Case(75);
    public Case case76 = new Case(76);
    public Case case77 = new Case(77);
    public Case case78 = new Case(78);
    public Case case79 = new Case(79);
    public Case case80 = new Case(80);
    public Case case81 = new Case(81);
    
    
    //Instanciation des pions 
    public Pion roiBleu = new Pion("Roi", 1, 2) {};
    public Pion roiRouge = new Pion("Roi", 2, 2) {};
    public Pion dragonBleu = new Pion("Dragon", 1, 5) {};
    public Pion dragonRouge = new Pion("Dragon", 2, 5){};
    public Pion elephantBleu = new Pion("Elephant", 1, 4) {};
    public Pion elephantRouge = new Pion("Elephant", 2, 4) {};
    public Pion trebuchetBleu = new Pion("Trebuchet", 1, 4) {};
    public Pion trebuchetRouge = new Pion("Trebuchet", 2, 4) {};
    public Pion catapulteBleu = new Pion("Catapulte", 1, 4) {};
    public Pion catapulteRouge = new Pion("Catapulte", 2, 4) {};
    public Pion arbaletrierBleu = new Pion("Arbalétrier", 1, 4){};
    public Pion arbaletrierRouge = new Pion("Arbalétrier", 2, 4){};
    public Pion cavLegerBleu = new Pion("Cavalier léger", 1, 2) {};
    public Pion cavLegerRouge = new Pion("Cavalier léger", 2, 2) {};
    public Pion cavLourdBleu = new Pion("Cavalier lourd", 1, 2) {};
    public Pion cavLourdRouge = new Pion("Cavalier lourd", 2, 2) {};
    public Pion lancierBleu = new Pion("Lancier", 1, 2) {};
    public Pion lancierRouge = new Pion("Lancier", 2, 2) {};
    public Pion populaceBleu = new Pion("Populace", 1, 1) {};
    public Pion populaceRouge = new Pion("Populace", 2, 1) {};
    
    /*******  Déclaration des images qui seront utilisées *******/
    public ImageIcon imageRoi = new ImageIcon("\\images\\pions\\king.png");
    public ImageIcon imageDragon = new ImageIcon("\\images\\pions\\dragon.png");
    public ImageIcon imageElephant = new ImageIcon("\\images\\pions\\elephant.png");
    public ImageIcon imageTrebuchet = new ImageIcon("\\images\\pions\\trebuchet.png");
    public ImageIcon imageCatapulte = new ImageIcon("\\images\\pions\\catapult.png");
    public ImageIcon imageArbaletrier = new ImageIcon("\\images\\pions\\crossbowman.png");
    public ImageIcon imageCavLourde= new ImageIcon("\\images\\pions\\heavyhorse.png");
    public ImageIcon imageCavLegere = new ImageIcon("\\images\\pions\\lighthorse.png");
    public ImageIcon imageLance = new ImageIcon("\\images\\pions\\spearman.png");
    public ImageIcon imagePopulace = new ImageIcon("\\images\\pions\\rabble.png");
    
    
    

    
    public FenetreDeJeu(){
        
        getContentPane().add(plateauDeJeu);
        
        this.setSize(new Dimension(1000,1000));
        this.setTitle("Cyvasse");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(new BorderLayout());
        
        this.setContentPane(plateauDeJeu);
        this.setVisible(true);

        //Plateau
        //this.add(plateauDeJeu);//, BorderLayout.CENTER);
        plateauDeJeu.setSize(new Dimension(800,800));
        plateauDeJeu.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        
        /*
        //Boutons
        this.add(boutonCommencer);
        //lesBoutons.setSize(new Dimension (900,100));
        /*lesBoutons.add(boutonCommencer);
        lesBoutons.add(boutonQuitter);
        //Ajout des événements aux boutons
        boutonCommencer.addActionListener(this);
        //boutonQuitter.addActionListener(this);
        
        c.gridx = 11;
        c.gridy = 11;
        plateauDeJeu.add(lesBoutons, c, HORIZONTAL);*/

        
        ImageIcon laMontagne = new ImageIcon("C:\\Users\\nraza\\OneDrive\\Bureau\\Projet JAVA\\cyvasse\\src\\images\\pions\\mountain.png");
        uneMontagne.add(montagne);
        uneMontagne.setSize(new Dimension(80,80));
        //laMontagne.setSize(new Dimension(80,80));
        //Placement des cases
        
        //Première ligne
        c.gridx = 0;
        c.gridy = 0;
        plateauDeJeu.add(case1.panel, c);
        
        c.gridx = 1;
        c.gridy = 0;
        plateauDeJeu.add(case2.panel, c);
        
        c.gridx = 2;
        c.gridy = 0;
        plateauDeJeu.add(case3.panel, c);
        
        c.gridx = 3;
        c.gridy = 0;
        plateauDeJeu.add(case4.panel, c);
        
        c.gridx = 4;
        c.gridy = 0;
        plateauDeJeu.add(case5.panel, c);

        c.gridx = 5;
        c.gridy = 0;
        plateauDeJeu.add(case6.panel, c);
        
        c.gridx = 6;
        c.gridy = 0;
        plateauDeJeu.add(case7.panel, c);
        
        c.gridx = 7;
        c.gridy = 0;
        plateauDeJeu.add(case8.panel, c);
        
        c.gridx = 8;
        c.gridy = 0;
        plateauDeJeu.add(case9.panel, c);
        
        //Deuxième ligne
        c.gridx = 0;
        c.gridy = 1;
        plateauDeJeu.add(case10.panel, c);
        
        c.gridx = 1;
        c.gridy = 1;
        plateauDeJeu.add(case11.panel, c);
        
        c.gridx = 2;
        c.gridy = 1;
        plateauDeJeu.add(case12.panel, c);
        
        c.gridx = 3;
        c.gridy = 1;
        plateauDeJeu.add(case13.panel, c);
        
        c.gridx = 4;
        c.gridy = 1;
        plateauDeJeu.add(case14.panel, c);
        
        c.gridx = 5;
        c.gridy = 1;
        plateauDeJeu.add(case15.panel, c);
        
        c.gridx = 6;
        c.gridy = 1;
        plateauDeJeu.add(case16.panel, c);
        
        c.gridx = 7;
        c.gridy = 1;
        plateauDeJeu.add(case17.panel, c);
        
        c.gridx = 8;
        c.gridy = 1;
        plateauDeJeu.add(case18.panel, c);
        
        //Troisième ligne
        c.gridx = 0;
        c.gridy = 2;
        plateauDeJeu.add(case19.panel, c);
        
        c.gridx = 1;
        c.gridy = 2;
        plateauDeJeu.add(case20.panel, c);
        
        c.gridx = 2;
        c.gridy = 2;
        plateauDeJeu.add(case21.panel, c);
        
        c.gridx = 3;
        c.gridy = 2;
        plateauDeJeu.add(case22.panel, c);
        
        c.gridx = 4;
        c.gridy = 2;
        plateauDeJeu.add(case23.panel, c);
        
        c.gridx = 5;
        c.gridy = 2;
        plateauDeJeu.add(case24.panel, c);
        
        c.gridx = 6;
        c.gridy = 2;
        plateauDeJeu.add(case25.panel, c);
        
        c.gridx = 7;
        c.gridy = 2;
        plateauDeJeu.add(case26.panel, c);
        
        c.gridx = 8;
        c.gridy = 2;
        plateauDeJeu.add(case27.panel, c);
        
        //Quatrième ligne
        c.gridx = 0;
        c.gridy = 3;
        plateauDeJeu.add(case28.panel, c);
        
        c.gridx = 1;
        c.gridy = 3;
        plateauDeJeu.add(case29.panel, c);
        
        c.gridx = 2;
        c.gridy = 3;
        
        plateauDeJeu.add(case30.panel, c);
        
        c.gridx = 3;
        c.gridy = 3;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case31.panel, c);
        
        c.gridx = 4;
        c.gridy = 3;
        plateauDeJeu.add(case32.panel, c);
        
        c.gridx = 5;
        c.gridy = 3;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case33.panel, c);
        
        c.gridx = 6;
        c.gridy = 3;
        plateauDeJeu.add(case34.panel, c);
        
        c.gridx = 7;
        c.gridy = 3;
        plateauDeJeu.add(case35.panel, c);
        
        c.gridx = 8;
        c.gridy = 3;
        plateauDeJeu.add(case36.panel, c);
        
        //Cinquième ligne
        c.gridx = 0;
        c.gridy = 4;
        plateauDeJeu.add(case37.panel, c);
        
        c.gridx = 1;
        c.gridy = 4;
        plateauDeJeu.add(case38.panel, c);
        
        c.gridx = 2;
        c.gridy = 4;
        plateauDeJeu.add(case39.panel, c);
        
        c.gridx = 3;
        c.gridy = 4;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case40.panel, c);
        
        c.gridx = 4;
        c.gridy = 4;
        plateauDeJeu.add(case41.panel, c);
        
        c.gridx = 5;
        c.gridy = 4;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case42.panel, c);
        
        c.gridx = 6;
        c.gridy = 4;
        plateauDeJeu.add(case43.panel, c);
        
        c.gridx = 7;
        c.gridy = 4;
        plateauDeJeu.add(case44.panel, c);
        
        c.gridx = 8;
        c.gridy = 4;
        plateauDeJeu.add(case45.panel, c);
        
        //Sixième ligne
        c.gridx = 0;
        c.gridy = 5;
        plateauDeJeu.add(case46.panel, c);
        
        c.gridx = 1;
        c.gridy = 5;
        plateauDeJeu.add(case47.panel, c);
        
        c.gridx = 2;
        c.gridy = 5;
        plateauDeJeu.add(case48.panel, c);
        
        c.gridx = 3;
        c.gridy = 5;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case49.panel, c);
        
        c.gridx = 4;
        c.gridy = 5;
        plateauDeJeu.add(case50.panel, c);
        
        c.gridx = 5;
        c.gridy = 5;
        plateauDeJeu.add(uneMontagne, c);
        //plateauDeJeu.add(case51.panel, c);
        
        c.gridx = 6;
        c.gridy = 5;
        plateauDeJeu.add(case52.panel, c);
        
        c.gridx = 7;
        c.gridy = 5;
        plateauDeJeu.add(case53.panel, c);
        
        c.gridx = 8;
        c.gridy = 5;
        plateauDeJeu.add(case54.panel, c);
        
        
        //Septième ligne
        
        c.gridx = 0;
        c.gridy = 6;
        plateauDeJeu.add(case55.panel, c);
        
        c.gridx = 1;
        c.gridy = 6;
        plateauDeJeu.add(case56.panel, c);
        
        c.gridx = 2;
        c.gridy = 6;
        plateauDeJeu.add(case57.panel, c);
        
        c.gridx = 3;
        c.gridy = 6;
        plateauDeJeu.add(case58.panel, c);
        
        c.gridx = 4;
        c.gridy = 6;
        plateauDeJeu.add(case59.panel, c);
        
        c.gridx = 5;
        c.gridy = 6;
        plateauDeJeu.add(case60.panel, c);
        
        c.gridx = 6;
        c.gridy = 6;
        plateauDeJeu.add(case61.panel, c);
        
        c.gridx = 7;
        c.gridy = 6;
        plateauDeJeu.add(case62.panel, c);
        
        c.gridx = 8;
        c.gridy = 6;
        plateauDeJeu.add(case63.panel, c);
        
        
        //Huitième ligne
        c.gridx = 0;
        c.gridy = 7;
        plateauDeJeu.add(case64.panel, c);
        
        c.gridx = 1;
        c.gridy = 7;
        plateauDeJeu.add(case65.panel, c);
        
        c.gridx = 2;
        c.gridy = 7;
        plateauDeJeu.add(case66.panel, c);
        
        c.gridx = 3;
        c.gridy = 7;
        plateauDeJeu.add(case67.panel, c);
        
        c.gridx = 4;
        c.gridy = 7;
        plateauDeJeu.add(case68.panel, c);
        
        c.gridx = 5;
        c.gridy = 7;
        plateauDeJeu.add(case69.panel, c);
        
        c.gridx = 6;
        c.gridy = 7;
        plateauDeJeu.add(case70.panel, c);
        
        c.gridx = 7;
        c.gridy = 7;
        plateauDeJeu.add(case71.panel, c);
        
        c.gridx = 8;
        c.gridy = 7;
        plateauDeJeu.add(case72.panel, c);
        
        //Neuvième ligne
        c.gridx = 0;
        c.gridy = 8;
        plateauDeJeu.add(case73.panel, c);
        
        c.gridx = 1;
        c.gridy = 8;
        plateauDeJeu.add(case74.panel, c);
        
        c.gridx = 2;
        c.gridy = 8;
        plateauDeJeu.add(case75.panel, c);
        
        c.gridx = 3;
        c.gridy = 8;
        plateauDeJeu.add(case76.panel, c);
        
        c.gridx = 4;
        c.gridy = 8;
        plateauDeJeu.add(case77.panel, c);
        
        c.gridx = 5;
        c.gridy = 8;
        plateauDeJeu.add(case78.panel, c);
        
        c.gridx = 6;
        c.gridy = 8;
        plateauDeJeu.add(case79.panel, c);
        
        c.gridx = 7;
        c.gridy = 8;
        plateauDeJeu.add(case80.panel, c);
        
        c.gridx = 8;
        c.gridy = 8;
        plateauDeJeu.add(case81.panel, c);
        
        
        
        MouseListener ml = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
            
                JComponent jc = (JComponent)e.getSource();
                TransferHandler th = jc.getTransferHandler();
                th.exportAsDrag(jc, e, TransferHandler.MOVE);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                TransferHandler reçoit = jc.getTransferHandler;
            
            }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
                
        /******** Placement des pions sur leur case de base en début de partie *********/
        case4.ajoutPion(arbaletrierBleu, 4);
        case4.caseLabel.addMouseListener(ml);
        case3.caseLabel.setTransferHandler(null);
        
        case5.ajoutPion(roiBleu, 5);
        case5.caseLabel.addMouseListener(ml);
        case9.ajoutPion(dragonBleu, 9);
        case9.caseLabel.addMouseListener(ml);
        case11.ajoutPion(catapulteBleu, 11);
        case18.ajoutPion(trebuchetBleu, 18);
        case19.ajoutPion(cavLegerBleu, 19);
        case21.ajoutPion(lancierBleu, 21);
        case23.ajoutPion(elephantBleu, 23);
        case25.ajoutPion(populaceBleu, 25);
        case27.ajoutPion(cavLourdBleu, 27);
        
        case55.ajoutPion(cavLourdRouge, 55);
        case57.ajoutPion(populaceRouge, 57);
        case59.ajoutPion(elephantRouge, 59);
        case61.ajoutPion(lancierRouge, 61);
        case63.ajoutPion(cavLegerRouge, 63);
        case64.ajoutPion(dragonRouge, 64);
        case64.ajoutPion(trebuchetRouge, 64);
        case71.ajoutPion(catapulteRouge, 71);
        case73.ajoutPion(dragonRouge, 73);
        case77.ajoutPion(roiRouge, 77);
        case78.ajoutPion(arbaletrierRouge, 78);
    }
    
    
    
    
    /*partie du code relative à des boutons qui n'existent pluuuuuuus
    public  void  actionPerformed(ActionEvent e)
    {
        Object  source=e.getSource();
        
        if  (source==boutonCommencer)
        { 
            int joueur = r.nextInt(2);
            
            tourJeu(joueur);//On force le premier tour
            do{
                int suivant = getJoueurSuivant(joueur);//On change de joueur
                tourJeu(suivant);//tour du joueur suivant
            }while(continuer);
            
        }
        else if (source==boutonQuitter)
        { 
            this.dispose();
        }
    }*/
    
    
    

    
    private void tourJeu(int joueur){
        
        //Ajout du MouseListener pour Drag&Drop
        
    }
    
    public int getJoueurSuivant(int joueur){
        if (joueur==1){return 1;}
        else {return 2;}
    }
    
    //Prévoir méthode lorsque le Roi est capturé
}


