/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Service;

import com.example.Jhevalu.Entity.PersonaTaller;
import java.util.List;

/**
 *
 * @author Brenda Tiravanti
 */
public interface PersonaTallerService {

    public List<PersonaTaller> findAll();

    public PersonaTaller findById(Long id);

    public PersonaTaller save(PersonaTaller personaTaller);

    public void delete(PersonaTaller personaTaller);

    public void deleteById(Long id);
}
