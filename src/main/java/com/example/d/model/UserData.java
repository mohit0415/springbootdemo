package com.example.d.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserData {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String location;

}
