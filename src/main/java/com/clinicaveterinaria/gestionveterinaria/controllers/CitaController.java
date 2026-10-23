
package com.clinicaveterinaria.gestionveterinaria.controllers;

import com.clinicaveterinaria.gestionveterinaria.service.CitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CitaController {

    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/citas")
    public String listar(Model model) {
        model.addAttribute("citas", citaService.listarTodas());
        return "citas";
    }    
}
