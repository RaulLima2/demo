package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.ClienteDTO;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDTO, Long> {
    public ClienteDTO save(ClienteDTO cliente);
    public List<ClienteDTO> findAll();
    public Optional<ClienteDTO> findById(Long id);
    public ClienteDTO update(ClienteDTO cliente);
    public void deleteById(Long id);
}