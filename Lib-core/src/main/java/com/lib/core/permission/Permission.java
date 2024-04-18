package com.lib.core.permission;

import com.lib.core.role.RoleEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Permission {
	private Long id;
	private String name;
	
	public Permission(PermissionEntity permissionEntity) {
		this.id = permissionEntity.getId();
		this.name = permissionEntity.getName();
	}
	
	public PermissionEntity populatePermissionEntity() {
		PermissionEntity permissionEntity = new PermissionEntity();
		permissionEntity.setId(getId());
		permissionEntity.setName(getName());
		return permissionEntity;
	}

}
