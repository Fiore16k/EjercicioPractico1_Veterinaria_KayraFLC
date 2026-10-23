
package com.clinicaveterinaria.gestionveterinaria.service;
import com.clinicaveterinaria.gestionveterinaria.domain.Cita;
import com.clinicaveterinaria.gestionveterinaria.repository.CitaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImpl implements CitaService {
    
    private final CitaRepository citaRepository;

    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public List<Cita> listarTodas() {
        return citaRepository.findAll();
    }

    @Override
    public Cita buscarPorId(Integer id) {
        return citaRepository.findById(id).orElse(null);
    }
}    