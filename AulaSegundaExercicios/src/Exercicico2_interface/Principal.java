/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicico2_interface;

/**
 *
 * @author Victoria
 */
public class Principal {
    
    public static void main(String[] args){
        
        Formula formula = new Formula();
        
        System.out.println("Quadrado: "+formula.quadrado(3));
        System.out.println("Triangulo: "+formula.triangulo(3,4));
        System.out.println("Circulo: "+formula.circunferencia(30));
    }
}
