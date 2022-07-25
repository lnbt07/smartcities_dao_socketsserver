package com.fiap.smarticities.dao;

import javax.persistence.EntityManager;

import com.fiap.smarticities.entity.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Integer> {

	public ClienteDAO(EntityManager em) {
		super(em);
	}

}
