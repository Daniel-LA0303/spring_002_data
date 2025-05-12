package com.mx.jpa.proc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

//para la forma 1
@NamedStoredProcedureQuery(
name = "Person.verPersonas",
procedureName = "verPersonas",
resultClasses = Person.class
)
@NamedStoredProcedureQuery(
        name = "Person.buscarPersona",
        procedureName = "buscarPersona",
        resultClasses = Person.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "person_id", type = Long.class)
        }
)
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @Column(name = "last_name")
    private String lastName;

	public Person() {
		super();
	}

	public Person(Long id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		
		return "id " + this.id + " name " + this.name + " lastname " + this.lastName;
	}

	
}