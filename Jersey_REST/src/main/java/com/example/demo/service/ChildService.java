package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Child;
import com.example.demo.repository.ChildRepo;
import com.example.demo.repository.ChildRepoIntf;

@Service
public class ChildService implements ChildServiceIntf {
	
	@Autowired
	ChildRepoIntf repo;
	
	@Override
	public List<Child> getChildren() {
		// TODO Auto-generated method stub
		List<Child> childrens=(List<Child>) repo.findAll();
		return childrens;
	}

	@Override
	public Child getChild(int id) {
		// TODO Auto-generated method stub
		Optional<Child> checkChild =repo.findById(id);
		if(checkChild.isPresent()) {
			Child child = checkChild.get();
			return child;
		}else {
			return null;
		}
		
	}
	
	@Override
	public Child createChild(Child child) {
		repo.save(child);
		return child;
	}
	
	@Override
	public Child deleteChild(Child child) {
		repo.delete(child);
		return child;
	}


}
