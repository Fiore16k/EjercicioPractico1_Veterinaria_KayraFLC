
package com.clinicaveterinaria.gestionveterinaria.controllers;

import com.clinicaveterinaria.gestionveterinaria.domain.TipoServicio;
import com.clinicaveterinaria.gestionveterinaria.service.TipoServicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TipoServicioController {

    private final TipoServicioService tipoServicioService;

    public TipoServicioController(TipoServicioService tipoServicioService) {
        this.tipoServicioService = tipoServicioService;
    }

    @GetMapping("/tipos-servicio")
    public String listar(Model model) {
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());
        return "tipos-servicio";
    }

    @GetMapping("/tipos-servicio/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("tipoServicio", new TipoServicio());
        return "formulario-tipo-servicio";
    }

    @GetMapping("/tipos-servicio/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        TipoServicio tipo = tipoServicioService.buscarPorId(id);

        if (tipo == null) {
            return "redirect:/tipos-servicio";
        }

        model.addAttribute("tipoServicio", tipo);
        return "formulario-tipo-servicio";
    }

    @PostMapping("/tipos-servicio/guardar")
    public String guardar(
            @ModelAttribute TipoServicio tipoServicio,
            RedirectAttributes redirectAttributes) {

        tipoServicioService.guardar(tipoServicio);
        redirectAttributes.addFlashAttribute(
                "mensaje", "Tipo de servicio guardado correctamente.");

        return "redirect:/tipos-servicio";
    }

    @PostMapping("/tipos-servicio/eliminar/{id}")
    public String eliminar(
            @PathVariable Integer id,
            RedirectAttributes redirectAttributes) {

        tipoServicioService.eliminar(id);
        redirectAttributes.addFlashAttribute(
                "mensaje", "Tipo de servicio eliminado correctamente.");

        return "redirect:/tipos-servicio";
    }    
}
