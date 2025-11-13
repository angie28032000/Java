package com.cmc.evaluacion;

public class CalculadoraAmortizacion {

    // 🔹 Calcula la cuota constante
    public static double calcularCuota(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        double interesAnual = prestamo.getInteres();
        int plazo = prestamo.getPlazo();

        double interesMensual = interesAnual / 12 / 100;
        return (monto * interesMensual) / (1 - Math.pow(1 + interesMensual, -plazo));
    }

    // 🔹 Generar tabla de amortización
    public static void generarTabla(Prestamo prestamo) {
        double cuotaConstante = calcularCuota(prestamo);
        Cuota[] cuotas = new Cuota[prestamo.getPlazo()];

        for (int i = 0; i < cuotas.length; i++) {
            cuotas[i] = new Cuota(i + 1);
            cuotas[i].setCuota(cuotaConstante);
        }

        cuotas[0].setInicio(prestamo.getMonto());
        double interesMensual = prestamo.getInteres() / 12 / 100;

        for (int i = 0; i < cuotas.length; i++) {
            Cuota actual = cuotas[i];
            double inicio = actual.getInicio();
            double interes = inicio * interesMensual;
            double abonoCapital = actual.getCuota() - interes;
            double saldo = inicio - abonoCapital;

            actual.setInteres(interes);
            actual.setAbonoCapital(abonoCapital);
            actual.setSaldo(saldo);

            if (i + 1 < cuotas.length) {
                cuotas[i + 1].setInicio(saldo);
            }
        }

        prestamo.setCuotas(cuotas);
    }

    public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("\nN° | Cuota | Inicio | Interés | Abono Cap | Saldo");
        System.out.println("--------------------------------------------------");
        for (Cuota c : prestamo.getCuotas()) {
            c.mostrarPrestamo();
        }
    }
}
