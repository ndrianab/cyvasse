/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyvasse;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nraza
 */
public class FenetreDebut extends JFrame implements ActionListener{
    
    private JPanel panel = new JPanel();
    public JButton boutonJouer = new JButton("Lancer le jeu");
    private JButton boutonQuitter = new JButton("Quitter le jeu");

    public FenetreDebut(){
    this.setTitle("Bienvenue dans le jeu Cyvasse");
    this.setSize(400, 150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //Ajout du bouton à notre content pane
    panel.add(boutonJouer);
    panel.add(boutonQuitter);

    boutonQuitter.setSize(new Dimension(250, 50));
    boutonJouer.setSize(new Dimension(250, 50));

    boutonJouer.addActionListener(this);
    boutonQuitter.addActionListener(this);

    this.setContentPane(panel);
    this.setVisible(true);
    pack();


}      

public  void  actionPerformed(ActionEvent e)
{
    Object  source=e.getSource();
    Jeu j = new Jeu();
    if  (source==boutonJouer)
    { 
        //j.Jeu();
        this.dispose();
    }
    else if (source==boutonJouer)
    { 
        this.dispose();
    }
}


    
}
