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
@Table(name = "pers_taller")
public class PersonaTaller implements Serializable{

    @Id
    @Column(name = "peta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petaId;

    /*@ManyToOne //De muchos a uno
    @Column(name = "tall_id")
    private Long tallId;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "pers_id")
    private Long persId;*/

}


