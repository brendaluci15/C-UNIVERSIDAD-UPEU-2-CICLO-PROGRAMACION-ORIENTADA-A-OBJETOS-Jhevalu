/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Service;

import com.example.Jhevalu.Entity.TipoPersona;
import java.util.List;

/**
 *
 * @author Brenda Tiravanti
 */
public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipopersona);

    public void delete(TipoPersona tipopersona);

    public void deleteById(Long id);
}
