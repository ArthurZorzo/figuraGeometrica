/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraGeometrica;

/**
 *
 * @author IFSC
 */
public class main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
       
        circulo.desenha();
        quadrado.desenha();
        triangulo.desenha();
    }
}