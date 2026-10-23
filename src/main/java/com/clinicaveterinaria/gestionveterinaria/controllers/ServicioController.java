/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinicaveterinaria.gestionveterinaria.controllers;

import com.clinicaveterinaria.gestionveterinaria.domain.Servicio;
import com.clinicaveterinaria.gestionveterinaria.service.ServicioService;
import com.clinicaveterinaria.gestionveterinaria.service.TipoServicioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ServicioController {

    private final ServicioService servicioService;
    private final TipoServicioService tipoServicioService;

    public ServicioController(
            ServicioService servicioService,
            TipoServicioService tipoServicioService) {
        this.servicioService = servicioService;
        this.tipoServicioService = tipoServicioService;
    }

    @GetMapping("/servicios")
    public String listar(Model model) {
        model.addAttribute("servicios", servicioService.listarTodos());
        return "servicios";
    }

    @GetMapping("/servicios/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());
        return "formulario-servicio";
    }

    @GetMapping("/servicios/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Servicio servicio = servicioService.buscarPorId(id);

        if (servicio == null) {
            return "redirect:/servicios";
        }

        model.addAttribute("servicio", servicio);
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());

        return "formulario-servicio";
    }

    @PostMapping("/servicios/guardar")
    public String guardar(
            @ModelAttribute Servicio servicio,
            RedirectAttributes redirectAttributes) {

        servicioService.guardar(servicio);
        redirectAttributes.addFlashAttribute(
                "mensaje", "Servicio guardado correctamente.");

        return "redirect:/servicios";
    }

    @PostMapping("/servicios/eliminar/{id}")
    public String eliminar(
            @PathVariable Integer id,
            RedirectAttributes redirectAttributes) {

        servicioService.eliminar(id);
        redirectAttributes.addFlashAttribute(
                "mensaje", "Servicio eliminado correctamente.");

        return "redirect:/servicios";
    }    
}
