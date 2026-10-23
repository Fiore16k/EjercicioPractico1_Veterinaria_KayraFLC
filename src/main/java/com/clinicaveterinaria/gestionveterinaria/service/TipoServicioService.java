
package com.clinicaveterinaria.gestionveterinaria.service;

import com.clinicaveterinaria.gestionveterinaria.domain.TipoServicio;
import java.util.List;

public interface TipoServicioService {

    List<TipoServicio> listarTodos();

    TipoServicio buscarPorId(Integer id);

    TipoServicio guardar(TipoServicio tipoServicio);

    void eliminar(Integer id);
}
