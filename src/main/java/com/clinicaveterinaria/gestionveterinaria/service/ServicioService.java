/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.Servicio;
import java.util.List;

public interface ServicioService {

    List<Servicio> listarTodos();

    Servicio buscarPorId(Integer id);

    Servicio guardar(Servicio servicio);

    void eliminar(Integer id);    
}
