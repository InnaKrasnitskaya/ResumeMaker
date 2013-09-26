package resumemaker.resumeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Person\"")
public class Person {
	
	@Id
	@Column(name = "\"IdPerson\"")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idPerson;
	
	@Column(name = "\"Name\"")
	private String name;
	
	@Column(name = "\"Surname\"")
	private String surname;
	
	@Column(name = "\"LastName\"")
	private String lastName;

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}
