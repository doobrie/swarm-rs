/**
 * Example JAX_RS application showing how to deploy to WildFly Swarm
 */
package com.davidsalter.swarm.rs;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author david@davidsalter.com
 */
@Path("fruit")
public class FruitResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FruitResource
     */
    public FruitResource() {
    }

    /**
     * Retrieves representation of an instance of com.davidsalter.swarm.rs.FruitResource
     * @return a list of com.davidsalter.swarm.rs.Fruit
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getFruit() {
        Fruit apple = new Fruit(1, "Apple");
        Fruit orange = new Fruit(2, "Orange");
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(orange);
        return fruits;
    }
}
