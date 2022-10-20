/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Controller;

import com.example.Jhevalu.Entity.TipoPersona;
import com.example.Jhevalu.Service.TipoPersonaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Brenda Tiravanti
 */
@RestController
@RequestMapping("/TipoPersona")
@Api(value = "Microservicios de gestion de TipoPersona", description ="Microservicio de TipoPersona")
public class TipoPersonaController {
    @Autowired
    private TipoPersonaService tipoPersonaService;

    @ApiOperation(value="Lista de tipo de personas")
    @GetMapping("/all")
    public List<TipoPersona> findAll() {
        return tipoPersonaService.findAll();
    }

    @ApiOperation(value="Obtiene datos de tipoPersona")
    @GetMapping("/{id}")
    public ResponseEntity<TipoPersona> findById(@PathVariable Long id) {
        TipoPersona tipoPersona = tipoPersonaService.findById(id);
        return ResponseEntity.ok(tipoPersona);
    }

    @ApiOperation(value="Elimina un tipoPersona")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tipoPersonaService.deleteById(id);
    }

    @ApiOperation(value="Crea una persona")
    @PostMapping("/save")
    public TipoPersona save(@RequestBody TipoPersona tipoPersona) {
        return tipoPersonaService.save(tipoPersona);
    }

    @ApiOperation(value="Modifica un tipoPersona")
    @PutMapping("/update")
    public TipoPersona update(@RequestBody TipoPersona tipoPersona) {
        return tipoPersonaService.save(tipoPersona);
    }
}




