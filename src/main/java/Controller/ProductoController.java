package Controller;

import Model.Productos;
import Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Productos> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Productos> crearProducto(@RequestBody Productos producto) {
        Productos nuevoProducto = productoRepository.save(producto);
        return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Productos> obtenerProductoPorId(@PathVariable("id") Long id) {
        Productos producto = productoRepository.findById(id).orElse(null);
        if (producto != null) {
            return new ResponseEntity<>(producto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Productos> actualizarProducto(@PathVariable("id") Long id, @RequestBody Productos producto) {
        if (productoRepository.existsById(id)) {
            producto.setProductoId(id);
            Productos productoActualizado = productoRepository.save(producto);
            return new ResponseEntity<>(productoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable("id") Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
