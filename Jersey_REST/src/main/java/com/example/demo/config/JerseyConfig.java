package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.demo.resources.ChildResource;
import com.example.demo.resources.MyResource;

@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(MyResource.class);
		register(ChildResource.class);
		
	}

}
