/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Service;

import com.example.Jhevalu.Entity.Persona;
import java.util.List;

/**
 *
 * @author Brenda Tiravanti
 */
public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona save(Persona persona);

    public void delete(Persona persona);

    public void deleteById(Long id);
}
