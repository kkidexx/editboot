package com.sprinboot.springweb.controlador;

import com.sprinboot.springweb.modelo.Entidad1;
import com.sprinboot.springweb.serviciooo.Entidad1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entidad1")
public class Entidad1Controller {

    private final Entidad1Service entidad1Service;

    public Entidad1Controller(Entidad1Service entidad1Service) {
        this.entidad1Service = entidad1Service;
    }

    @GetMapping
    public String listarEntidad1(Model model) {
        List<Entidad1> entidad1List = entidad1Service.obtenerTodasLasEntidades();
        model.addAttribute("entidad1", entidad1List);
        return "entidad1";
    }

    @GetMapping("/crear")
    public String crearEntidad1Form(Model model) {
        model.addAttribute("entidad1", new Entidad1());
        return "crearEntidad1";
    }

    @PostMapping
    public String crearEntidad1(@ModelAttribute Entidad1 entidad1) {
        entidad1Service.crearEntidad1(entidad1);
        return "redirect:/entidad1";
    }

    @GetMapping("/editar/{id}")
    public String editarEntidad1Form(@PathVariable Long id, Model model) {
        Entidad1 entidad1 = entidad1Service.obtenerEntidad1PorId(id);
        model.addAttribute("entidad1", entidad1);
        return "editarEntidad1";
    }

    @PostMapping("/editar/{id}")
    public String actualizarEntidad1(@PathVariable Long id, @ModelAttribute Entidad1 entidad1) {
        Entidad1 entidad1Existente = entidad1Service.obtenerEntidad1PorId(id);
        if (entidad1Existente != null) {
            entidad1Existente.setNombre(entidad1.getNombre());
            entidad1Existente.setPrecio(entidad1.getPrecio());
            entidad1Service.actualizarEntidad1(entidad1Existente);
        }
        return "redirect:/entidad1";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEntidad1(@PathVariable Long id) {
        entidad1Service.eliminarEntidad1(id);
        return "redirect:/entidad1";
    }
}