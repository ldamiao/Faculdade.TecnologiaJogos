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

public class PaintEstrela  extends JPanel {
    Estrela coordenadas[];
    Color corLinha;    
    Color coresInterna[];
    
    public void setPropriedades(Estrela coordenadas[], Color corLinha, Color coresInterna[]) {
        this.coordenadas = coordenadas;
        this.corLinha = corLinha;
        this.coresInterna = coresInterna;
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //seta cor de Fundo do Painel
        setBackground(Color.white);

        for (int i = 0; i < coordenadas.length; i++){
            if(coresInterna != null){

                if(i> 5 && i <=11)
                     g.setColor(coresInterna[1]);   
                else if(i> 11 && i <=17)
                     g.setColor(coresInterna[2]);  
                else if (i> 17 && i <=24)
                     g.setColor(coresInterna[3]); 
                else
                     g.setColor(coresInterna[0]); 
                ((Graphics2D) g).fill(coordenadas[i]);
            }
            g.setColor(corLinha);
            ((Graphics2D) g).draw(coordenadas[i]);  

        }
    }
}
