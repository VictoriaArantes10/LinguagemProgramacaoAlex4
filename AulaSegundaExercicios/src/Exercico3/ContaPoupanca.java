
package Exercico3;


public class ContaPoupanca extends Conta implements IConta {

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
        this.investir = (float) (this.investir + 0.05);

    
    }
    
    public void imprimir()
    {
      System.out.println("Depositar: " + this.depositar());
       System.out.println("Sacar: " + this.sacar());
        System.out.println("Investir: " + this.investir());
     
    }

    private String depositar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String sacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String investir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
