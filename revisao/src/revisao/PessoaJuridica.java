/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author Lucas Moraes
 */
class PessoaJuridica extends Pessoa {
    String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String endereco, double valor_desconto, String cnpj) {
        super(nome, telefone, email, endereco, valor_desconto);
        this.cnpj = cnpj;
    }

    @Override
    public void calcularDesconto(double percentualDesconto) {
        super.calcularDesconto(20);
    }
}
