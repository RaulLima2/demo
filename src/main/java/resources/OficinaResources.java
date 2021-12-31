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

import dto.OficinaDTO;
import service.OficinaService;

@RestController
@RequestMapping("/api/v1/oficina")
public class OficinaResources {
    @Autowired
    private OficinaService oficinaService;


    @PostMapping
    public OficinaDTO save(@RequestBody OficinaDTO oficinaDTO) {
        return oficinaService.save(oficinaDTO);
    }

    @GetMapping
    public ResponseEntity<List<OficinaDTO>> findAll() {
        List<OficinaDTO> oficina = oficinaService.findAll();
        if(oficina == null || oficina.isEmpty()) {
            return new ResponseEntity<List<OficinaDTO>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<OficinaDTO>>(HttpStatus.OK);
        }
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return oficinaService.findById(id)
        .map(recordOficina -> ResponseEntity.ok().body(recordOficina))
        .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<OficinaDTO> update(@PathVariable("id") Long id, @RequestBody OficinaDTO oficinaDTO) {
        return oficinaService.findById(id)
                .map(recordOficina -> {
                    recordOficina.setCodigo(oficinaDTO.getCodigo());
                    recordOficina.setNome(oficinaDTO.getNome());
                    recordOficina.setEspecialidade(oficinaDTO.getEspecialidade());
                    recordOficina.setEndereco(oficinaDTO.getEndereco());
                    recordOficina.setCarros(oficinaDTO.getCarros());
                        OficinaDTO updated = oficinaService.save(recordOficina);
                        return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return oficinaService.findById(id)
        .map(recordOficina -> {
            oficinaService.deleteById(id);
                return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
