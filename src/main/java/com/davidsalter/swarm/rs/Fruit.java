/**
 * Example JAX_RS application showing how to deploy to WildFly Swarm
 */
package com.davidsalter.swarm.rs;

import java.io.Serializable;

/**
 * Class implementation of a fruit
 * 
 * @author david@davidsalter.com
 */
public class Fruit implements Serializable {

    private final int id;
    private final String name;
    
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
