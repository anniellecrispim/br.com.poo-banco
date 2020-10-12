package br.com.banco;
import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {
        ArrayList<Clientes> clientes = new ArrayList<> ();
        ArrayList<ContaCorrente> contaCorrente = new ArrayList<> ();

        Agencia agencia = new Agencia(3, "Rua Manoel Barbosa");
        clientes.add (agencia.cadastrarCliente("Annielle", "24/01/2000", "6666666666-6", "377477-3", "Rua Manoel Tavares"));
        System.out.print(clientes);

        contaCorrente.add(agencia.criarConta(clientes.get(0), 1441));
        System.out.println(contaCorrente);

        //As funçõos:
        clientes.get(0).depositar(100);
        clientes.get(0).sacar(20);
        clientes.get(0).exibirSaldo();

        System.out.println(contaCorrente);

    }

}