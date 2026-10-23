
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.Servicio;
import java.util.List;

public interface ServicioService {

    List<Servicio> listarTodos();

    Servicio buscarPorId(Integer id);

    Servicio guardar(Servicio servicio);

    void eliminar(Integer id);
}
