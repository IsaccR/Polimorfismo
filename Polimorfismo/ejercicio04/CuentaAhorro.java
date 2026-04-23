package Polimorfismo.ejercicio04;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double monto) {
        
        double interesExtra = monto * 0.05;
        this.saldo += (monto + interesExtra);
        
        System.out.println("Depósito en Cuenta Ahorro exitoso.");
        System.out.println("Monto: Q" + monto + " + Interés extra (5%): Q" + interesExtra);
        System.out.println("Nuevo saldo total: Q" + this.saldo);
    }
}