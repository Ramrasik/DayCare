package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Child;

public interface ChildRepoIntf extends CrudRepository<Child, Integer>{

	/*public List<Children> getChildrens();
	public Children getChildren(int id);
	public void create(Children child);*/
}
