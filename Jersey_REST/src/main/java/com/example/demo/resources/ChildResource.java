package com.example.demo.resources;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.example.demo.entity.Child;
import com.example.demo.entity.Parent;
import com.example.demo.service.ChildService;

@Path("/children")
public class ChildResource {
		@Autowired
		ChildService service;
		
		@GET
		@Produces({MediaType.APPLICATION_JSON_VALUE, javax.ws.rs.core.MediaType.APPLICATION_XML})
		public List<Child> getAllChildren() {	
		
			//Create Parent to test
		Parent c1Parent = new Parent("DAD-Mike","781-365-0026"); 
			//Create Child to test
		Child c1 = new Child();
			c1.setName("ram"); 
			c1.setAge(5);
			c1.setGender('M');
			//set Parent to Child
			c1.setParent(c1Parent);
			//set Child to Parent
			c1Parent.setChild(c1);
			
			//create new Child
			service.createChild(c1);
			
			Child c2 = new Child("rasik", 3, 'M');
			service.createChild(c2);
			c2.setParent(c1Parent);
			c1Parent.setChild(c2);
			
			List<Child> children = service.getChildren();
			return children; 
		
		}
		
		@GET
		@Path("/child/{id}")
		@Produces({MediaType.APPLICATION_JSON_VALUE, javax.ws.rs.core.MediaType.APPLICATION_XML})
		public Child getChild(@PathParam("id") int id) {	
			Child child = service.getChild(id);
			return child;
		}
	
		@POST
		@Path("/child")
		@Consumes({MediaType.APPLICATION_JSON_VALUE, javax.ws.rs.core.MediaType.APPLICATION_XML})
		public Child createChild(Child child) {	
			return (service.createChild(child));
		}
		
		@POST
		@Path("/child")
		@Consumes({MediaType.APPLICATION_JSON_VALUE, javax.ws.rs.core.MediaType.APPLICATION_XML})
		public Child updateChild(Child child) {	
			return (service.createChild(child));
		}
		
		@DELETE
		@Path("/child/{id}")
		public Child deleteChild(@PathParam("id") int id) {
			
			Child getChild = service.getChild(id);
			
			if(getChild.getId()!=0) {
				service.deleteChild(getChild);
				System.out.println("ID DELETED");
			}else {
				System.out.println("ID DOSE NOT EXIST");
			}
			
			return null;
			
		}
		
		
}
