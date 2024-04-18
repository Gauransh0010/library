package com.lib.core.role;

import java.util.List;

import com.lib.core.permission.Permission;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Role {
	private Long id;
	private String name;
    
	private List<Permission> permissionList;
	public Role(RoleEntity roleEntity) {
		this.id = roleEntity.getId();
		this.name = roleEntity.getName();
	}
	
	public RoleEntity populateRoleEntity() {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setId(getId());
		roleEntity.setName(getName());
		return roleEntity;
	}
	
}
