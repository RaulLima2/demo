package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dto.CarroDTO;


@Repository
public interface CarroRepository  extends JpaRepository<CarroDTO, Long> {
    public CarroDTO save(CarroDTO carro);
    public List<CarroDTO> findAll();
    public Optional<CarroDTO> findById(Long id);
    public CarroDTO update(CarroDTO carro);
    public void deleteById(Long id);
}
