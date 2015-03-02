/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpj.mensal;

import java.awt.*;

/**
 *
 * @author ldamiao
 */


public class Estrela extends Polygon {
    /* Parametros
    * eixoX = posicao no eixo X
    * eixoY = posicao no eixo Y
    * raio = raio da Circunferência de referência (Parte Superior)
    * raioInterno = raio da circunferência interna para ligação dos pontos
    * numeroVertices = numero de vertices (numero das pontas das estrelas)
    * anguloInicial =  angulo inicial da estrela
    */
    public Estrela(int eixoX, int eixoY, int raio, int raioInterno, int numeroVertices, double anguloInicial) {
        super(CoordenadasX(eixoX, raio, raioInterno,  numeroVertices, anguloInicial)
              ,CoordenadasY( eixoY, raio, raioInterno, numeroVertices, anguloInicial)
              ,numeroVertices * 2);
    }

    protected static int[] CoordenadasX(int eixoX, int raio, int raioInter, int numeroVert, double anguloInicial) {
        int resultado[] = new int [ numeroVert * 2 ];
        double anguloAdd = (2 * Math.PI) / numeroVert;
        double angulo = anguloInicial;
        double innerAngle = anguloInicial + (Math.PI / numeroVert);
        for (int i=0; i < numeroVert ; i++) {
            resultado[i*2]=(int)Math.round(raio * Math.cos(angulo)) + eixoX;
            angulo += anguloAdd;
            resultado[ (i * 2) + 1 ] = (int)Math.round( raioInter * Math.cos(innerAngle)) + eixoX;
            innerAngle += anguloAdd;
        }
        
        return resultado;
    }

    protected static int[] CoordenadasY(int eixoY, int raio, int raioInter, int numeroVert, double anguloInicial) {
        int resultado[] = new int[numeroVert * 2];
        double anguloAdd = (2 * Math.PI) / numeroVert;
        double angulo = anguloInicial;
        double anguloInterno = anguloInicial + (Math.PI/numeroVert);
        for (int i=0 ; i < numeroVert ; i++) {
            resultado[ i * 2] = (int)Math.round(raio * Math.sin(angulo)) + eixoY;
            angulo += anguloAdd;
            resultado[ (i * 2) + 1] = (int)Math.round(raioInter * Math.sin(anguloInterno))  + eixoY;
            anguloInterno += anguloAdd;
        }
        return resultado;
    }
}

