
package aulasegundaexercicios;


public class AulaSegundaExercicios {

 
    public static void main(String[] args) {
       
    //String cpf, String nome, int telefone, String email, String endereco, double desconto   
    PessoaFisica pessoaF = new PessoaFisica("350048463877","victoria",62434382,"victoria@arantes", "rua aaaa",10);
    pessoaF.imprimir();
    
  
    //String cpf, String nome, int telefone, String email, String endereco, double desconto   
    PessoaJuridica pessoaJ = new PessoaJuridica("63232732","victoria",62434382,"victoria@arantes", "rua aaaa",166);
    pessoaJ.imprimir();
    }
    
}
