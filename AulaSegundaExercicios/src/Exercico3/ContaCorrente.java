
package Exercico3;


public class ContaCorrente extends Conta implements IConta  {

    private float depositar;
    private float sacar;
    private float investir;

    @Override
    public void depositar(float valor) {
        this.depositar = this.depositar + valor;
    }

    @Override
    public void sacar(float valor) {
        this.sacar = this.sacar - valor;
    }

    @Override
    public void investir(float valor) {
        this.investir = (float) (this.investir + 0.03);
    }

  

   
    
}
