/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Repository;

import com.example.Jhevalu.Entity.Materiales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brenda Tiravanti
 */
@Repository
public interface MaterialesRepository extends CrudRepository<Materiales, Long>{
    
}