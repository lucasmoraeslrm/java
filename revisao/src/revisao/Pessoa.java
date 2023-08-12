/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Lucas Moraes
 */
public class Pessoa {
    
    String nome;
    String telefone;
    String email;
    String endereco;
    double valor_desconto;
    
    public Pessoa(String nome, String telefone, String email, String endereco, double valor_desconto) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.valor_desconto = valor_desconto;
    }

    public void calcularDesconto(double percentualDesconto) {
        this.valor_desconto = this.valor_desconto * (1 - percentualDesconto / 100);
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor de Desconto: " + valor_desconto);
    }
    
}
