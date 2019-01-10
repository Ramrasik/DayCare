package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Child;

public interface ChildServiceIntf {
	
	public List<Child> getChildren();
	public Child getChild(int id);
	public Child createChild(Child child);
	Child deleteChild(Child child);
}
