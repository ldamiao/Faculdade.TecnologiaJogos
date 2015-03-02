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
public class QuadradosDiagonais extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        //DESENHANDO 18 RETÂNGULOS DENTRO UM DO OUTRO
        int x = 100, y = 100, w = 300, z = 200;

        for (int i = 0; i < 18; i++) {
            g.setColor(Color.black);
            g.drawRect(x, y, w, z);
            x += ((i % 2) == 0 ? 5/2 : 5);
            y += ((i % 2) == 0 ? 5/2 : 5);
            w -= ((i % 2) == 0 ? 10/2 : 10);
            z -= ((i % 2) == 0 ? 10/2 : 10);
        }
        
        int a = 600, b = 220, c = 15, d = 5;
        for (int i = 18; i > 0; i--) {
            g.setColor(Color.black);
            g.drawRect(a, b, c, d);
            a -= ((i % 2) == 0 ? 10/2 : 10);
            b -= ((i % 2) == 0 ? 7/2 : 7);
            c += ((i % 2) == 0 ? 4/2 : 4);
            d += ((i % 2) == 0 ? 9/2 : 9);
        }

    }

}
