
package aulaprimeira;


public class pessoaJuridica extends Pessoa 
{
      private String cnpj;
      
       public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
     public pessoaJuridica(String cnpj, String nome, int telefone, String email, String endereco, float desconto) {
        super(nome, telefone, email, endereco, desconto);
        this.cnpj = cnpj;
    }
    
     
     @Override
     public  void calcularDesconto(float percetualDesconto)
    {
      
       float percentual = percetualDesconto + 20;
       
       this.valor = valor + (valor * percentual )/100;
    }
     
      @Override
   public void imprimir()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tolefone: " + this.getTelefone());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Valor do Desconto: " + this.getValor());
        System.out.println("CNPJ: " + this.getCnpj());
        
    }
    }

