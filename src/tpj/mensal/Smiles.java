/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpj.mensal;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ldamiao
 */
public class Smiles extends JPanel {
    
     @Override
   public void paintComponent(Graphics g){
       
        super.paintComponent(g);
        
        //Smile sorrindo :) - fundo branco bordas azuis
        g.setColor(Color.WHITE);
        g.fillOval(10, 10, 100, 100);// desenha circunferencia
        g.setColor(Color.BLUE);//cor da linha
        g.drawOval(10, 10, 100, 100);//pinta
        g.drawOval(40, 40, 10, 10);//olhos
        g.drawOval(70, 40, 10, 10);//olhos
        g.drawArc(40,70,40,20,180, 180);//boca
        
        //Smile triste :( - fundo branco bordas azuis
        g.setColor(Color.WHITE);
        g.fillOval(120, 10, 100, 100);
        g.setColor(Color.BLUE);
        g.drawOval(120, 10, 100, 100);
        g.drawOval(150, 40, 10, 10);//olhos
        g.drawOval(180, 40, 10, 10);//olhos
        g.drawArc(150,80,40,20,20,150);//boca
        
        //Smile sorrindo :) -  fundo amarelo bordas pretas
        g.setColor(Color.YELLOW);
        g.fillOval(10, 120, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(10, 120, 100, 100);  
        g.drawOval(40, 150, 10, 10);//olhos
        g.drawOval(70, 150, 10, 10);//Olhos
        g.drawArc(40,180,40,20,180,180);//boca
        
        //Smile triste :( -  fundo amarelo bordas pretas
        g.setColor(Color.YELLOW);
        g.fillOval(120, 120, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(120, 120, 100, 100);
        g.drawOval(150, 150, 10, 10);//olhos
        g.drawOval(180, 150, 10, 10);//olhos
        g.drawArc(150,190,40,20,20,150);//boca
                
   }
    
}
