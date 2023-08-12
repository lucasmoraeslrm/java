/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao;

/**
 *
 * @author Lucas Moraes
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Lucas Ramos", "123456789", "lucasmoraes.lrm@gmail.com", "Rua A", 1000.0, "123.456.789-01");
        PessoaJuridica pessoa2 = new PessoaJuridica("LRM Online", "987654321", "contato@lrmonline.com.br", "Avenida B", 2000.0, "12.345.678/0001-90");

        pessoa1.imprimir();
        pessoa1.calcularDesconto(10);
        pessoa1.imprimir();

        pessoa2.imprimir();
        pessoa2.calcularDesconto(20);
        pessoa2.imprimir();
    }
    
}
