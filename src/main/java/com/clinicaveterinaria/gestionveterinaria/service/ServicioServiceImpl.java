/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.Servicio;
import com.clinicaveterinaria.gestionveterinaria.repository.ServicioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicioServiceImpl {

    private final ServicioRepository servicioRepository;

    public ServicioServiceImpl(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    @Override
    public List<Servicio> listarTodos() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio buscarPorId(Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public Servicio guardar(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public void eliminar(Integer id) {
        servicioRepository.deleteById(id);
    }    
}
