/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpj.mensal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author ldamiao
 */
public class QuadradosAglutinados extends JPanel {
      @Override

    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.setColor(Color.black);

        
        ((Graphics2D) g).rotate(Math.E/4);// Gira a figura
                              
        // drawRect - Desenha retangulo
        // desenho x
        
        //         L, A, LQ, AQ
        g.drawRect(394, 6, 40, 40); //1 primeiro quadrado de cima

        g.drawRect(432,6, 40, 40); //2

        g.drawRect(394, 48, 40, 40); //3

        g.drawRect(432,48, 40, 40); //4
                

        g.drawRect(310, 90, 40, 40); //1 segundo quadrado da esquerda

        g.drawRect(352, 90, 40, 40); //2

        g.drawRect(310, 132, 40, 40); //3

        g.drawRect(352, 132, 40, 40); //4

        
                
        g.drawRect(394, 90, 40, 40); //1 terceiro quadrado do meio

        g.drawRect(432,90, 40, 40); //2

        g.drawRect(394, 132, 40, 40); //3

        g.drawRect(432,132, 40, 40); //4
        
        
        
        g.drawRect(474, 90, 40, 40); //1 quarto quadrado da direita

        g.drawRect(516, 90, 40, 40); //2

        g.drawRect(474, 132, 40, 40); //3

        g.drawRect(516, 132, 40, 40); //4
        
        
        g.drawRect(394, 174, 40, 40); //1 quinto quadrado de baixo

        g.drawRect(432,174, 40, 40); //2

        g.drawRect(394, 216, 40, 40); //3

        g.drawRect(432,216, 40, 40); //4
        

        // QUADRADOS AGLUTINADOS 
        ((Graphics2D) g).rotate(Math.E/-4);
        
        g.drawRect(100, 50, 40, 40); //Superior  (Referência)

        g.drawRect(70, 80, 40, 40); //Esquerdo 

        g.drawRect(130, 80, 40, 40); //Direito 

        g.drawRect(100, 110, 40, 40); //Inferior 


        g.drawRect(145, 125, 40, 40); //Superior  (Referência)

        g.drawRect(115, 155, 40, 40); //Esquerdo 

        g.drawRect(175, 155, 40, 40); //Direito 

        g.drawRect(145, 185, 40, 40); //Inferior 


        g.drawRect(100, 200, 40, 40); //Superior  (Referência)

        g.drawRect(70, 230, 40, 40); //Esquerdo 

        g.drawRect(130, 230, 40, 40); //Direito 

        g.drawRect(100, 260, 40, 40); //Inferior 

    }
}
