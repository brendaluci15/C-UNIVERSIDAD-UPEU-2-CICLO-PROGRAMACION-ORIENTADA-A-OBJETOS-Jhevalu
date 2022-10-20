/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Service;

import com.example.Jhevalu.Entity.Materiales;
import java.util.List;

/**
 *
 * @author Brenda Tiravanti
 */
public interface MaterialesService {

    public List<Materiales> findAll();

    public Materiales findById(Long id);

    public Materiales save(Materiales materiales);

    public void delete(Materiales materiales);

    public void deleteById(Long id);
}
