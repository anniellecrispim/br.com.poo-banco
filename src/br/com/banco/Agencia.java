package br.com.banco;
import java.util.ArrayList;

public class Agencia {

    private int numero;
    private String endereco;

    public Agencia (int numero, String endereco) {
        this.numero = numero;
        this.endereco = endereco;
    }

    public Clientes cadastrarCliente (String nome, String dataNascimento, String cpf, String rg, String endereco){
        Clientes cliente = new Clientes (nome, dataNascimento, cpf, rg, endereco);
        return cliente;
    }

    public ContaCorrente criarConta(Clientes cliente, int numeroConta){
        ContaCorrente conta = new ContaCorrente(numeroConta, this.numero);
        cliente.setConta(conta);
        return conta;
    }

}