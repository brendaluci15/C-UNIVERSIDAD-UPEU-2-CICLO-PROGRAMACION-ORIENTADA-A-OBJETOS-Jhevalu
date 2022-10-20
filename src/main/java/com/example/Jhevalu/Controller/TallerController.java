/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Controller;

import com.example.Jhevalu.Entity.Taller;
import com.example.Jhevalu.Service.TallerService;
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
@RequestMapping("/taller")
@Api(value = "Microservicios de gestion de talleres", description ="Microservicio de Talleres")
public class TallerController {
    @Autowired
    private TallerService tallerService;

    @ApiOperation(value="Lista de Talleres")
    @GetMapping("/all")
    public List<Taller> findAll() {
        return tallerService.findAll();
    }

    @ApiOperation(value="Obtiene datos de un Taller")
    @GetMapping("/{id}")
    public ResponseEntity<Taller> findById(@PathVariable Long id) {
        Taller taller = tallerService.findById(id);
        return ResponseEntity.ok(taller);
    }

    @ApiOperation(value="Elimina un Taller")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tallerService.deleteById(id);
    }

    @ApiOperation(value="Crea un taller")
    @PostMapping("/save")
    public Taller save(@RequestBody Taller taller) {
        return tallerService.save(taller);
    }

    @ApiOperation(value="Modifica un taller")
    @PutMapping("/update")
    public Taller update(@RequestBody Taller taller) {
        return tallerService.save(taller);
    }
}




