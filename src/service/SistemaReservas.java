package service;

import model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(int idReserva) {
        if (idReserva <= 0) {
            throw new IllegalArgumentException("El id debe ser mayor a 0");
        }

        Reserva encontrada = null;

        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                encontrada = reserva;
                break;
            }
        }

        if (encontrada == null) {
            throw new IllegalArgumentException("No existe una reserva con el id: " + idReserva);
        }

        reservas.remove(encontrada);
        System.out.println("la reserva "+ idReserva +" fue eliminada");
    }

    public void listarReservas() {
        for (Reserva reserva: reservas) {
            System.out.println(reserva);
        }
    }

    public int contarReservas() {
        return reservas.size();
    }

}
