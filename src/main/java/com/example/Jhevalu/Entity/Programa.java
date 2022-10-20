/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jhevalu.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author Brenda Tiravanti
 */
@Data
@Entity
@Table(name = "programa")
public class Programa implements Serializable{

    @Id
    @Column(name = "prog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progId;

    @Column(name = "prog_name")
    String progName;

    @Column(name = "prog_descripcion")
    String progDescripcion;
}