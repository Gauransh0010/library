package com.lib.core.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class User {
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String username;
	
	private String password;
	
	private String email;
	
	public User(UserEntity userEntity) {
		this.id = userEntity.getId();
	}
	

}


