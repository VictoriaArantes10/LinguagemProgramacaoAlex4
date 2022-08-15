/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasegundaexercicios;

/**
 *
 * @author Victoria
 */
    public class PessoaFisica extends Pessoa
{  
  private String cpf;
  
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public PessoaFisica(String cpf, String nome, int telefone, String email, String endereco, float desconto) {
        super(nome, telefone, email, endereco, desconto);
        this.cpf = cpf;
    }

    @Override
  public  void calcularDesconto(float percetualDesconto)
    {
       float percentual = percetualDesconto + 10;
       
       this.valor = valor + (valor * percentual )/100;
        
    }
  
      @Override
   public void imprimir()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Valor do Desconto: " + this.getValor());
        System.out.println("CPF: " + this.getCpf());
        
    }
    
}
