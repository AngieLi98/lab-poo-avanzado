package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Reserva reserva1 = new Reserva(12, "Liz", "09/12/2025", 2);
        Reserva reserva2 = new Reserva(21,"Violeta", "10/12/2025",3);
        Reserva reserva3 = new Reserva(8, "Jazmin", "09/10/2025",1);

        sistema.agregarReserva(reserva1);
        sistema.agregarReserva(reserva2);
        sistema.agregarReserva(reserva3);

        System.out.println("\nLista de reservas");
        sistema.listarReservas();

        reserva2.setCliente("lucy");
        System.out.println("\nNombre de reserva2 se cambio a: "+ reserva2.getCliente());

        System.out.println("\nTotal de reservas: " + sistema.contarReservas());

        try {
            sistema.eliminarReserva(12);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nLista de reservas");
        sistema.listarReservas();

    }

}
