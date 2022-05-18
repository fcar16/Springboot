package com.proyecto.proyectoWeb.models;

import javax.persistence.*;

//Ejemplo de una clase referencia a una tabla de la base de datos.
@Entity
@Table(name="student")
public class Student {

    //Ejemplo para la ID de la tabla.
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;

    //Ejemplo para una columna de una tabla.
    @Column(name="first_name", nullable=false)
    public String firstName;
      
	public Student() {
		super();
	}

	public Student(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + "]";
	}

    
    

}