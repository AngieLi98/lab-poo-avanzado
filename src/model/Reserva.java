package model;

public class Reserva {
    private int idReserva;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva() {
    }

    public Reserva(int idReserva, String cliente, String fecha, int duracionHoras) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", cliente='" + cliente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}
