/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.skeleton.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.time.LocalDateTime;
import javax.ws.rs.Path;

/**
 *
 * @author dspiess
 */
@Path("/")
public class AboutResource {
    @GET
    @Path("/time")
    @Produces("text/plain")
    public String get() {
        return "The time is " + LocalDateTime.now();
    }  
}
