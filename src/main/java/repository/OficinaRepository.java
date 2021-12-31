package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.OficinaDTO;

@Repository
public interface OficinaRepository extends JpaRepository<OficinaDTO, Long>{
    public OficinaDTO save(OficinaDTO oficina);
    public List<OficinaDTO> findAll();
    public Optional<OficinaDTO> findById(Long id);
    public OficinaDTO update(OficinaDTO oficina);
    public void deleteById(Long id);
}
