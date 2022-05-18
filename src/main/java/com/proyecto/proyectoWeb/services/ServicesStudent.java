package com.proyecto.proyectoWeb.services;

import com.proyecto.proyectoWeb.models.Student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.proyectoWeb.repository.RepositoryStudent;

@Service
public class ServicesStudent implements InterfacesStudent {

	@Autowired
	RepositoryStudent c;

	
	public List<Student> getall() {
		// TODO Auto-generated method stub
	List<Student> result = c.findAll();
	
		return result;

	}


}
