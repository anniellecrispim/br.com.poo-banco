package br.com.banco;

public class ContaCorrente {

    private int numConta;
    private int numAgencia;
    private double saldo;

    public ContaCorrente (int numConta, int numAgencia) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = 0.0;
    }

    public double exibirSaldo (){
        return this.saldo;
    }

    public void depositar (double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) {
        this.saldo -= valor;
    }

    public String verNumAgenciaConta() {
        return "Número da Conta: " + this.numConta + "Número da Agência : " + this.numAgencia;
    }

    @Override
    public String toString() {
        return "Numero da conta: " + this.numConta + "\nNúmero da Agência: " +
                this.numAgencia + "\nSaldo: " +this.saldo;

    }
}