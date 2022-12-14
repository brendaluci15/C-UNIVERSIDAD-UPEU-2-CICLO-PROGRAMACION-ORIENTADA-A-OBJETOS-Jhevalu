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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author Brenda Tiravanti
 */
@Data
@Entity
@Table(name = "persona")

public class Persona implements Serializable{

 @Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "pers_ap_paterno")
    String persApPaterno;

    @Column(name = "pers_ap_materno")
    String persApMaterno;

    @Column(name = "pers_nombres")
    String persNombres;

    @Column(name = "pers_dni")
    String persDni;

    @Column(name = "pers_telefono")
    String persTelefono;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tipe_id")
    private TipoPersona tipePersona;    
    
}
