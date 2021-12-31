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

import dto.ClienteDTO;
import service.ClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteResources {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO save(@RequestBody ClienteDTO cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll() {
        List<ClienteDTO> cliente = clienteService.findAll();
        if(cliente == null || cliente.isEmpty()) {
            return new ResponseEntity<List<ClienteDTO>>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<ClienteDTO>>(HttpStatus.OK);
        }
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return clienteService.findById(id)
        .map(recordCliente -> ResponseEntity.ok().body(recordCliente))
        .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<ClienteDTO> update(@PathVariable("id") Long id, @RequestBody ClienteDTO cliente) {
        return clienteService.findById(id)
                .map(recordCliente -> {
                    recordCliente.setCpf(cliente.getCpf());
                    recordCliente.setNome(cliente.getNome());
                    recordCliente.setDataNascimento(cliente.getDataNascimento());
                    recordCliente.setCarros(cliente.getCarros());
                        ClienteDTO updated = clienteService.save(recordCliente);
                        return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return clienteService.findById(id)
        .map(recordCliente -> {
            clienteService.deleteById(id);
                return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
