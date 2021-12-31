package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CarroDTO;
import service.CarroService;


@RestController
@RequestMapping("/api/v1/carro")
public class CarroResources {
    @Autowired
    private CarroService carroService;

    @PostMapping
    public CarroDTO save(@RequestBody CarroDTO carro) {
        return carroService.save(carro);
    }

    @GetMapping
    public ResponseEntity<List<CarroDTO>> findAll() {
        List<CarroDTO> carros = carroService.findAll();
        if(carros == null || carros.isEmpty()) {
            return new ResponseEntity<List<CarroDTO>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<CarroDTO>>(HttpStatus.OK);
        }
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return carroService.findById(id)
        .map(recordCarro -> ResponseEntity.ok().body(recordCarro))
        .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<CarroDTO> update(@PathVariable("id") Long id, @RequestBody CarroDTO carro) {
        return carroService.findById(id)
                .map(recordCarro -> {
                    recordCarro.setPlaca(carro.getPlaca());
                    recordCarro.setCor(carro.getCor());
                    recordCarro.setModelo(carro.getModelo());
                    recordCarro.setAno(carro.getAno());
                    recordCarro.setAnoModelo(carro.getAnoModelo());
                    recordCarro.setCliente(carro.getCliente());
                    recordCarro.setOficina(carro.getOficina());
                        CarroDTO updated = carroService.save(recordCarro);
                        return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return carroService.findById(id)
        .map(recordCarro -> {
            carroService.deleteById(id);
                return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

}
