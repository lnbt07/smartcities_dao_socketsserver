package br.com.fiap.service;

import java.rmi.RemoteException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.fiap.smarticities.dao.ClienteDAO;
import com.fiap.smarticities.entity.Cliente;

public class ClienteServiceImpl implements ClienteService {

	@Override
	public Cliente buscar(int id) throws RemoteException {
		EntityManager em = Persistence.createEntityManagerFactory("smartcities-dao")
				.createEntityManager();
		ClienteDAO dao = new ClienteDAO(em);
		return dao.buscar(id);
	}

}
