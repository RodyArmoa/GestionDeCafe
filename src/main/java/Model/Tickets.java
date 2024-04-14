package Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private LocalDateTime fechaHora;
    private BigDecimal total;
    private String estado;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "tickets")
    private List<DetalleDelTicket> detalles;

    // Getters y Setters
    // ...


    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleDelTicket> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleDelTicket> detalles) {
        this.detalles = detalles;
    }
}
