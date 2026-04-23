package Polimorfismo.ejercicio10;

public class TrabajadorporHora extends Trabajador {
    private int horasTrabajadas;
    private double pagoPorHora;

    public TrabajadorporHora(int horas, double pago) {
        this.horasTrabajadas = horas;
        this.pagoPorHora = pago;
    }

    @Override
    public void calcularPago() {
        double total = horasTrabajadas * pagoPorHora;
        System.out.println("Trabajador por Horas:");
        System.out.println("Horas laboradas: " + horasTrabajadas);
        System.out.println("Pago por hora: Q" + pagoPorHora);
        System.out.println("Total a pagar: Q" + total);
    }
}
