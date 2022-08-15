
package aulasegundaexercicios;


public class Pessoa {
     
    
    private String nome;
    private int telefone;
    private String email;
    private String endereco;
    protected float valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor =  valor;
    }

    
    //Construtor
    public Pessoa(String nome, int telefone, String email, String endereco, float desconto) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valor =  desconto;
    }
    
    

   public  void calcularDesconto(float percetualDesconto)
    {
        
    }
    
    public void imprimir()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tolefone: " + this.getTelefone());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Valor do Desconto: " + this.getValor());
        
    }
    
}
