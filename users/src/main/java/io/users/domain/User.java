package io.users.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table
@Data
public class User {

	@Id
	@GenericGenerator(name="useruuid",strategy="uuid2")
	@GeneratedValue(generator="useruuid")
	private String userId;
	private String username;
	private String email;
	private String password;
}
