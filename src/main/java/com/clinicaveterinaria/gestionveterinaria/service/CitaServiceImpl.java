/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;
import com.clinicaveterinaria.gestionveterinaria.domain.Cita;
import com.clinicaveterinaria.gestionveterinaria.repository.CitaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImpl {

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
}
