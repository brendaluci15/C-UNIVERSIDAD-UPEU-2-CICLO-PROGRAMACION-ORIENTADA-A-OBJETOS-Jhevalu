/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Service.Impl;

import com.example.Jhevalu.Entity.TipoPersona;
import com.example.Jhevalu.Repository.TipoPersonaRepository;
import com.example.Jhevalu.Service.TipoPersonaService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brenda Tiravanti
 */
@Service
public class TipoPersonaServiceImpl implements TipoPersonaService{

    @Autowired
    private TipoPersonaRepository TipoPersonaRepository;

    @Transactional
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) TipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return TipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return TipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        TipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        TipoPersonaRepository.deleteById(id);
    }
}



