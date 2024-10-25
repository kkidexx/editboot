package com.sprinboot.springweb.controlador;


import com.sprinboot.springweb.modelo.Entidad2;
import com.sprinboot.springweb.serviciooo.Entidad2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entidad2")
public class Entidad2Controller {

    private final Entidad2Service entidad2Service;

    public Entidad2Controller(Entidad2Service entidad2Service) {
        this.entidad2Service = entidad2Service;
    }

    @GetMapping
    public String listarEntidad2(Model model) {
        List<Entidad2> entidad2List = entidad2Service.obtenerTodasLasEntidades();
        model.addAttribute("entidad2", entidad2List);
        return "entidad2";
    }

    @GetMapping("/crear")
    public String crearEntidad2Form(Model model) {
        model.addAttribute("entidad2", new Entidad2());
        return "crearEntidad2";
    }

    @PostMapping
    public String crearEntidad2(@ModelAttribute Entidad2 entidad2) {
        entidad2Service.crearEntidad2(entidad2);
        return "redirect:/entidad2";
    }

    @GetMapping("/editar/{id}")
    public String editarEntidad2Form(@PathVariable Long id, Model model) {
        Entidad2 entidad2 = entidad2Service.obtenerEntidad2PorId(id);
        model.addAttribute("entidad2", entidad2);
        return "editarEntidad2";
    }

    @PostMapping("/editar/{id}")
    public String actualizarEntidad2(@PathVariable Long id, @ModelAttribute Entidad2 entidad2) {
        Entidad2 entidad2Existente = entidad2Service.obtenerEntidad2PorId(id);
        entidad2Existente.setCantidad(entidad2.getCantidad());
        entidad2Service.actualizarEntidad2(entidad2Existente);
        return "redirect:/entidad2";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEntidad2(@PathVariable Long id) {
        entidad2Service.eliminarEntidad2(id);
        return "redirect:/entidad2";
    }
}