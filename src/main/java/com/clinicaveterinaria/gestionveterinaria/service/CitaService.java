
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.Cita;
import java.util.List;

public interface CitaService {

    List<Cita> listarTodas();

    Cita buscarPorId(Integer id);
}
