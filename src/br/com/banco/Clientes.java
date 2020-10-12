package br.com.banco;

public class Clientes {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String endereco;
    private ContaCorrente conta;

    public Clientes (String nome, String dataNascimento, String cpf, String rg, String endereco){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public void exibirSaldo() {
        //System.out.println(this.conta.exibirSaldo());
        this.conta.exibirSaldo();
    }

    public void sacar(double valor) {
        this.conta.sacar(valor);
    }

    public void depositar(double valor) {
        this.conta.depositar(valor);
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public void removerConta() {
        this.conta = null;
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + this.nome + "\nData de Nascimento: : " +
                this.dataNascimento + "\nDocumentos (RG e CPF): " +this.rg + ", "
                + this.cpf + "\nEndereço do Cliente: " +this.endereco;

    }

}

