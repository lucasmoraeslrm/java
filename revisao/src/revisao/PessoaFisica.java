/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Lucas Moraes
 */
class PessoaFisica extends Pessoa {
    String cpf;

    public PessoaFisica(String nome, String telefone, String email, String endereco, double valor_desconto, String cpf) {
        super(nome, telefone, email, endereco, valor_desconto);
        this.cpf = cpf;
    }

    @Override
    public void calcularDesconto(double percentualDesconto) {
        super.calcularDesconto(10);
    }
}