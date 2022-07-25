package br.com.fiap.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.fiap.smarticities.entity.Cliente;

public interface ClienteService extends Remote {

	Cliente buscar(int id) throws RemoteException;
	
}
