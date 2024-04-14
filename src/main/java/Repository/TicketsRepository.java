package Repository;

import Model.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}
