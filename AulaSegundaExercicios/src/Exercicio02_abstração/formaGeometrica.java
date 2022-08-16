/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02_abstração;

/**
 *
 * @author Victoria
 */
public class formaGeometrica extends Forma{
    
    @Override
    public float quadrado(float lado) {
        return lado * lado;
    }

    @Override
    public float triangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    @Override
    public float circunferencia(float raio) {
        return (float) Math.PI * raio * raio;
    }
}
