package com.sprinboot.springweb.controlador;

import com.sprinboot.springweb.modelo.Entidad4;
import com.sprinboot.springweb.serviciooo.Entidad4Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entidad4")
public class Entidad4Controller {

    private final Entidad4Service entidad4Service;

    public Entidad4Controller(Entidad4Service entidad4Service) {
        this.entidad4Service = entidad4Service;
    }

    @GetMapping
    public String listarEntidad4(Model model) {
        List<Entidad4> entidad4List = entidad4Service.obtenerTodasLasEntidades();
        model.addAttribute("entidad4", entidad4List);
        return "entidad4";
    }

    @GetMapping("/crear")
    public String crearEntidad4Form(Model model) {
        model.addAttribute("entidad4", new Entidad4());
        return "crearEntidad4";
    }

    @PostMapping
    public String crearEntidad4(@ModelAttribute Entidad4 entidad4) {
        entidad4Service.crearEntidad4(entidad4);
        return "redirect:/entidad4";
    }

    @GetMapping("/editar/{id}")
    public String editarEntidad4Form(@PathVariable Long id, Model model) {
        Entidad4 entidad4 = entidad4Service.obtenerEntidad4PorId(id);
        model.addAttribute("entidad4", entidad4);
        return "editarEntidad4";
    }

    @PostMapping("/editar/{id}")
    public String actualizarEntidad4(@PathVariable Long id, @ModelAttribute Entidad4 entidad4) {
        Entidad4 entidad4Existente = entidad4Service.obtenerEntidad4PorId(id);
        entidad4Existente.setDetalle(entidad4.getDetalle());
        entidad4Service.actualizarEntidad4(entidad4Existente);
        return "redirect:/entidad4";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEntidad4(@PathVariable Long id) {
        entidad4Service.eliminarEntidad4(id);
        return "redirect:/entidad4";
    }
}