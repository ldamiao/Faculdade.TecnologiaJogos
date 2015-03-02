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
public class CirculosOvais extends JPanel{
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        
        // circuferencia 1
        int w = 150, x = 150, y = 50, z = 50;//valores default 
        
         for (int i = 0; i < 10; i++) {
            g.setColor(Color.black);
            g.drawOval(w, x, y, z);// desenhando circulo oval
            w -= 5; //decrementa o valores dados no inicio
            x -= 5;
            y += 10;
            z += 10;
        }
         
         //circuferencia 2
        int a = 260, b = 135, c = 50, d = 100;
        for (int i = 0; i < 10; i++){
        
            g.setColor(Color.black);
            g.drawOval(a, b, c, d);
            a += 3;
            b -= 6;
            c += 5;
            d += 10;
        } 
           
    }
    
}
