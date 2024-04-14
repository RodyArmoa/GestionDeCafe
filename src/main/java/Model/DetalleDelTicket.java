package Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class DetalleDelTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;

    @ManyToOne
    private Tickets tickets;

    @ManyToOne
    private Productos productos;

    private int cantidad;
    private BigDecimal precio;

    // Getters y Setters
    // ...


    public Long getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Long detalleId) {
        this.detalleId = detalleId;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
