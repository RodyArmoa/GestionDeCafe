package Repository;

import Model.DetalleDelTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleTicketRepository extends JpaRepository<DetalleDelTicket, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}

