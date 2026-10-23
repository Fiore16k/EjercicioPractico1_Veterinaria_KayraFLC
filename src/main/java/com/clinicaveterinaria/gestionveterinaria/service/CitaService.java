/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.Cita;
import java.util.List;

public interface CitaService {

    List<Cita> listarTodas();

    Cita buscarPorId(Integer id);    
}
