package com.sprinboot.springweb.controlador;

import com.sprinboot.springweb.modelo.Entidad3;
import com.sprinboot.springweb.serviciooo.Entidad3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/entidad3")
public class Entidad3Controller {

    private final Entidad3Service entidad3Service;

    public Entidad3Controller(Entidad3Service entidad3Service) {
        this.entidad3Service = entidad3Service;
    }

    @GetMapping
    public String listarEntidad3(Model model) {
        List<Entidad3> entidad3List = entidad3Service.obtenerTodasLasEntidades();
        model.addAttribute("entidad3", entidad3List);
        return "entidad3";
    }

    @GetMapping("/crear")
    public String crearEntidad3Form(Model model) {
        model.addAttribute("entidad3", new Entidad3());
        return "crearEntidad3";
    }

    @PostMapping
    public String crearEntidad3(@ModelAttribute Entidad3 entidad3) {
        entidad3Service.crearEntidad3(entidad3);
        return "redirect:/entidad3";
    }

    @GetMapping("/editar/{id}")
    public String editarEntidad3Form(@PathVariable Long id, Model model) {
        Entidad3 entidad3 = entidad3Service.obtenerEntidad3PorId(id);
        model.addAttribute("entidad3", entidad3);
        return "editarEntidad3";
    }

    @PostMapping("/editar/{id}")
    public String actualizarEntidad3(@PathVariable Long id, @ModelAttribute Entidad3 entidad3) {
        Entidad3 entidad3Existente = entidad3Service.obtenerEntidad3PorId(id);
        entidad3Existente.setDescripcion(entidad3.getDescripcion());
        entidad3Service.actualizarEntidad3(entidad3Existente);
        return "redirect:/entidad3";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEntidad3(@PathVariable Long id) {
        entidad3Service.eliminarEntidad3(id);
        return "redirect:/entidad3";
    }
}