/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpj.mensal;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author ldamiao
 */
public class Mensal extends JFrame  {
    

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        GerarExercicio1();                
        GerarExercicio2();        
        GerarExercicio3();
        GerarExercicio4();        
        GerarExercicio5();        
        GerarExercicio6();        
    }
    
    protected static void GerarExercicio1(){
    
        PaintEstrela estrela = new PaintEstrela();
        Estrela[] coordenadas = new Estrela[7];

        //Estrela com 12 pontas e 6 Camadas
        // feito um for e a cada interação é retirado 10 de cada ponto nos raios 
        for(int i=0; i <= 6 ; i ++){
            //posição no quadro Diferente 
            if(i == 6)
                coordenadas[i] = new Estrela(500, 120, 100, 80, 12, 0);
            else
                coordenadas[i] = new Estrela(150, 120, 100 - (i * 10), 80- (i * 10), 12, 0);

        } 
        estrela.setPropriedades(coordenadas, Color.black,null);
    
        GerarFrame(270,750,estrela, "Exercicio 1");
    }
    
    protected static void GerarExercicio2(){
        GerarFrame(270,250,new Smiles(), "Exercicio 2");
    }
 
    protected static void GerarExercicio3(){
     
        PaintEstrela estrela = new PaintEstrela();
        Estrela[] coordenadas = new Estrela[24];

        int j = 0;
        for(int i=0; i <= 23 ; i ++){

            if(i <= 11)
                coordenadas[i] = new Estrela((i <= 5 ? 150 : 500), 150, 120 - (j * 10), 70- (j * 10), 5, 50);
            else
                coordenadas[i] = new Estrela((i <= 17 ? 150 : 500), 500, 120 - (j * 10), 70- (j * 10), 5, 50);

            j = (j < 5 ? j+1 : 0);
        }

        estrela.setPropriedades(coordenadas, Color.black,new Color[]{Color.WHITE,Color.GREEN,Color.BLUE, Color.RED});

        GerarFrame(680,660,estrela, "Exercicio 3");
    
    }
    
    protected static void GerarExercicio4(){
        GerarFrame(400,700,new QuadradosDiagonais(), "Exercicio 4");
    }
    
    protected static void GerarExercicio5(){
        GerarFrame(350,500,new CirculosOvais(), "Exercicio 5");
    }
    
    protected static void GerarExercicio6(){
        GerarFrame(600,500,new QuadradosAglutinados(), "Exercicio 6");
    }
    
    public static void GerarFrame(int largura, int altura, JPanel painel, String texto)
    {
        // Monta Frame e exibe 
        javax.swing.JFrame frame = new javax.swing.JFrame(texto);
        frame.setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE );
        frame.setBackground(Color.WHITE);
        frame.getContentPane().add(painel);
        frame.setSize(altura,largura);
        frame.setBackground(Color.white);
        frame.setVisible(true);
    }
  

}
