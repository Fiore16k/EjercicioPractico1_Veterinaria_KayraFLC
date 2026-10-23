/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.TipoServicio;
import java.util.List;

public interface TipoServicioService {

    List<TipoServicio> listarTodos();

    TipoServicio buscarPorId(Integer id);

    TipoServicio guardar(TipoServicio tipoServicio);

    void eliminar(Integer id);    
}
