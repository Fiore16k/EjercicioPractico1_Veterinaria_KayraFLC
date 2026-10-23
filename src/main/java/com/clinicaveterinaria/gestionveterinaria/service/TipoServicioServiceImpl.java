/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.TipoServicio;
import com.clinicaveterinaria.gestionveterinaria.repository.TipoServicioRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class TipoServicioServiceImpl {

    private final TipoServicioRepository tipoServicioRepository;

    public TipoServicioServiceImpl(TipoServicioRepository tipoServicioRepository) {
        this.tipoServicioRepository = tipoServicioRepository;
    }

    @Override
    public List<TipoServicio> listarTodos() {
        return tipoServicioRepository.findAll();
    }

    @Override
    public TipoServicio buscarPorId(Integer id) {
        return tipoServicioRepository.findById(id).orElse(null);
    }

    @Override
    public TipoServicio guardar(TipoServicio tipoServicio) {
        return tipoServicioRepository.save(tipoServicio);
    }

    @Override
    public void eliminar(Integer id) {
        tipoServicioRepository.deleteById(id);
    }    
}
