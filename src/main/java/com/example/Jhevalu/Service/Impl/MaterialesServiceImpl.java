/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Service.Impl;

import com.example.Jhevalu.Entity.Materiales;
import com.example.Jhevalu.Repository.MaterialesRepository;
import com.example.Jhevalu.Service.MaterialesService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brenda Tiravanti
 */
@Service
public class MaterialesServiceImpl implements MaterialesService{
    @Autowired
    private MaterialesRepository MaterialesRepository;

    @Transactional
    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) MaterialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return MaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return MaterialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        MaterialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        MaterialesRepository.deleteById(id);
    }
}



