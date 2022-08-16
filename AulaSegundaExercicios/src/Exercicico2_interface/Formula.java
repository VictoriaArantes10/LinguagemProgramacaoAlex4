
package Exercicico2_interface;


public class Formula implements IFormula{
    
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
