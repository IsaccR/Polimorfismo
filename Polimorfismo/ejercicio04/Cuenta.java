package Polimorfismo.ejercicio04;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depositando Q" + monto + ". Saldo actual: Q" + saldo);
    }
}
