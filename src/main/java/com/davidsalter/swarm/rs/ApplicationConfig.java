/**
 * Example JAX_RS application showing how to deploy to WildFly Swarm
 */
package com.davidsalter.swarm.rs;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * Application Path configuration object.
 * 
 * @author david@davidsalter.com
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.davidsalter.swarm.rs.FruitResource.class);
    }
    
}
