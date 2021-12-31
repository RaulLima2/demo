package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CarroDTO;
import repository.CarroRepository;


@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public CarroDTO save(CarroDTO carroDto) {
        return carroRepository.save(carroDto);
    }

    public List<CarroDTO> findAll() {
        return (List<CarroDTO>) carroRepository.findAll();
    }

    public Optional<CarroDTO> findById(Long id) {
        return  carroRepository.findById(id);
    }

    public CarroDTO update(CarroDTO carroDto) {
        return carroRepository.save(carroDto);
    }

    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
}
