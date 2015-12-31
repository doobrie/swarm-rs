/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidsalter.swarm.rs;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Fruit implements Serializable {

    private int id;
    private String name;
    
    public Fruit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }   
}
