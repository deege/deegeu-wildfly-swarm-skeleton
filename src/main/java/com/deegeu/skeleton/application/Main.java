/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.skeleton.application;

import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSDeployment;
import com.deegeu.skeleton.resources.AboutResource;

/**
 *
 * @author dspiess
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Container container = new Container();
        JAXRSDeployment deployment = new JAXRSDeployment( container );
        deployment.addResource(AboutResource.class);
        container.start().deploy(deployment);
    }    
}
