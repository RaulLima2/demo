package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ClienteDTO;
import repository.ClienteRepository;


@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO save(ClienteDTO clienteDto) {
        return clienteRepository.save(clienteDto);
    }

    public List<ClienteDTO> findAll() {
        return (List<ClienteDTO>) clienteRepository.findAll();
    }

    public Optional<ClienteDTO> findById(Long id) {
        return  clienteRepository.findById(id);
    }

    public ClienteDTO update(ClienteDTO clienteDto) {
        return clienteRepository.save(clienteDto);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}
