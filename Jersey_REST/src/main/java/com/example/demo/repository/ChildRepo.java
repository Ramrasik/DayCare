package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Child;

@Repository
public class ChildRepo{
	List<Child> children;
	
	@PersistenceContext
	EntityManager em;
	
	public ChildRepo() {
		children = new ArrayList<>();
		
		Child c1 = new Child();
		c1.setName("ram");
		c1.setAge(5);
		c1.setGender('M');
		
		Child c2 = new Child("rasik", 3, 'M');
		
		children.add(c1);
		children.add(c2);
	}
/*	
	@Override
	public List<Children> getChildrens() {
		// TODO Auto-generated method stub
		return children;
	}

	@Override
	public Children getChildren(int id) {
		// TODO Auto-generated method stub
		
		for(Children child:children) {
			if(child.getId()==id) {
				return child;
			}
		}
		return null;
	}
	
	@Override
	public void create(Children child) {
		System.out.println("child added");
		
	}*/

	
}
