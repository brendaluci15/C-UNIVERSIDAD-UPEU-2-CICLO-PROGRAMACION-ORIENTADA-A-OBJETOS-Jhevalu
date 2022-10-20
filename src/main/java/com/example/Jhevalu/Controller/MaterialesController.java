/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Controller;

import com.example.Jhevalu.Entity.Materiales;
import com.example.Jhevalu.Service.MaterialesService;
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
@RequestMapping("/Materiales")
@Api(value = "Microservicios de gestion de materiales", description ="Microservicio de Materiales")
public class MaterialesController {
    @Autowired
    private MaterialesService materialesService;

    @ApiOperation(value="Lista de materiales")
    @GetMapping("/all")
    public List<Materiales> findAll() {
        return materialesService.findAll();
    }

    @ApiOperation(value="Obtiene datos de los materiales")
    @GetMapping("/{id}")
    public ResponseEntity<Materiales> findById(@PathVariable Long id) {
        Materiales materiales = materialesService.findById(id);
        return ResponseEntity.ok(materiales);
    }

    @ApiOperation(value="Elimina materiales")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        materialesService.deleteById(id);
    }

    @ApiOperation(value="Crea Materiales")
    @PostMapping("/save")
    public Materiales save(@RequestBody Materiales materiales) {
        return materialesService.save(materiales);
    }

    @ApiOperation(value="Modifica Materiales")
    @PutMapping("/update")
    public Materiales update(@RequestBody Materiales materiales) {
        return materialesService.save(materiales);
    }
}



