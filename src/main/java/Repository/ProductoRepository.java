package Repository;

import Model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long> {
    // Puedes agregar métodos personalizados aquí si necesitas consultas específicas
}
