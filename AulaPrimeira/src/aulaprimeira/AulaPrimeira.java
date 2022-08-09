/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaprimeira;


public class AulaPrimeira {

  
    public static void main(String[] args) {
    //String cpf, String nome, int telefone, String email, String endereco, double desconto   
    pessoaFisica pessoaF = new pessoaFisica("350048463877","victoria",62434382,"victoria@arantes", "rua aaaa",10);
    pessoaF.imprimir();
    
  
    //String cpf, String nome, int telefone, String email, String endereco, double desconto   
    pessoaJuridica pessoaJ = new pessoaJuridica("63232732","victoria",62434382,"victoria@arantes", "rua aaaa",166);
    pessoaJ.imprimir();
    
    
      
    }
    
   
   
    
}
