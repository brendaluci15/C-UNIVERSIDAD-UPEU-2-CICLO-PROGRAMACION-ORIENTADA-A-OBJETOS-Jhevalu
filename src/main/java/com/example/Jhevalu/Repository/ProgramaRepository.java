/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Jhevalu.Repository;

import com.example.Jhevalu.Entity.Programa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brenda Tiravanti
 */
@Repository
public interface ProgramaRepository extends CrudRepository<Programa, Long>{
    
}
