/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Service.Impl;

import com.example.Jhevalu.Entity.Taller;
import com.example.Jhevalu.Repository.TallerRepository;
import com.example.Jhevalu.Service.TallerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brenda Tiravanti
 */
@Service
public class TallerServiceImpl implements TallerService{

    @Autowired
    private TallerRepository TallerRepository;
    @Override
    public List<Taller> findAll() {
        return (List<Taller>) TallerRepository.findAll();
    }

    @Override
    public Taller findById(Long id) {
        return TallerRepository.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller taller) {
        return TallerRepository.save(taller);
    }

    @Override
    public void delete(Taller taller) {
        TallerRepository.delete(taller);
    }

    @Override
    public void deleteById(Long id) {
        TallerRepository.deleteById(id);
    }
}

