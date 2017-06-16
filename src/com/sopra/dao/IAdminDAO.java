package com.sopra.dao;

import com.sopra.model.Admin;

public interface IAdminDAO extends IDAO<Admin, Integer> {


	public Admin findByUsername(String username);
	
}
