package banco12;

public class Conta {
    private int numero;
    private double saldo;
    Cliente cliente = new Cliente("Nome do Cliente", (byte) 25);

    
    public Conta(int numero, double saldoInicial) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número da conta deve ser positivo.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        if (destino == null) {
            throw new IllegalArgumentException("Conta destino não pode ser nula.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de transferência deve ser positivo.");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }

   
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
