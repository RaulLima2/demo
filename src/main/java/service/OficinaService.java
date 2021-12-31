package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.OficinaDTO;
import repository.OficinaRepository;

@Service
public class OficinaService {
    
    @Autowired
    private OficinaRepository oficinaRepository;


    public OficinaDTO save(OficinaDTO oficinaDTO) {
        return oficinaRepository.save(oficinaDTO);
    }

    public List<OficinaDTO> findAll() {
        return (List<OficinaDTO>) oficinaRepository.findAll();
    }

    public Optional<OficinaDTO> findById(Long id) {
        return  oficinaRepository.findById(id);
    }

    public OficinaDTO update(OficinaDTO oficinaDTO) {
        return oficinaRepository.save(oficinaDTO);
    }

    public void deleteById(Long id) {
        oficinaRepository.deleteById(id);
    }
}
