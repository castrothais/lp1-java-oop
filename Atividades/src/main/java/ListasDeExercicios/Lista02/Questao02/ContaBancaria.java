package ListasDeExercicios.Lista02.Questao02;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private float saldo;

    ContaBancaria() {
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta<=0) {
            throw new IllegalArgumentException("Número conta inválida!");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo<0) {
            throw new IllegalArgumentException("Saldo inválido!");
        }
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        if(valor<=0) {
            throw new IllegalArgumentException("Valor informado inválido!");
        }
        this.saldo+=valor;
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    public String exibirInformacoes() {
        return String.format("Titular: %s | Conta: %d | Saldo: %.2f",
                this.titular, this.numeroConta, this.saldo);
    }

}
