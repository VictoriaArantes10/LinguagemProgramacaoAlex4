
package aulaprimeira;


public class pessoaFisica extends Pessoa
{  
  private String cpf;
  
   public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public pessoaFisica(String cpf, String nome, int telefone, String email, String endereco, float desconto) {
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
