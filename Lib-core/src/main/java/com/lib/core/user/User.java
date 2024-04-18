package com.lib.core.user;

import com.lib.core.role.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class User {
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String username;
	
	private String password;
	
	private String email;
	private Boolean isActive; 
	
	private Role role;
	
	public User(UserEntity userEntity) {
		this.id = userEntity.getId();
		this.firstName = userEntity.getFirstName();
		this.lastName = userEntity.getLastName();
		this.username = userEntity.getUsername();
		this.password = userEntity.getPassword();
		this.email = userEntity.getEmail();
		this.isActive = userEntity.getIsActive();
		if(userEntity.getRoleId() != null) {
			Role role = new Role();
			role.setId(userEntity.getRoleId());
			this.role = role;
		}
		
	}
	
	public UserEntity populateUserEntity() {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(getId());
		userEntity.setFirstName(getFirstName());
		userEntity.setLastName(getLastName());
		userEntity.setUsername(getUsername());
		userEntity.setPassword(getPassword());
		userEntity.setEmail(getEmail());
		userEntity.setIsActive(getIsActive());
		return userEntity;
		
	}
	

}


