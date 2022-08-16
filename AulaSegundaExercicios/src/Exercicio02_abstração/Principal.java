/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02_abstração;

/**
 *
 * @author Victoria
 */
public class Principal {
    
    public static void main(String[] args){
    formaGeometrica forma = new formaGeometrica();
        
    System.out.println("Quadrado: "+forma.quadrado(3));
    System.out.println("Triangulo: "+forma.triangulo(3,4));
    System.out.println("Circulo: "+forma.circunferencia(30));
    }
}
