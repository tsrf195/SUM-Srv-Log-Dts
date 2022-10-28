/**
 * 
 */
package com.controller.rst;

import java.util.BitSet;
import java.util.List;

import javax.naming.NamingException;

import com.conexion.rst.GestorSolicitudes;
import com.rest.ws.UsuarioDao;

/**
 * @author danie
 *
 */
public class CrtlPrenda {

	/**
	 * 
	 */
	public CrtlPrenda() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *FUNCION PARA VALIDAR USUARIO 
	 */
	//Funciona
	public String validarUsr(String correo, String clave) throws NamingException {

		// TODO Auto-generated method stub
		GestorSolicitudes gestorSolicitudes = new GestorSolicitudes();
		return gestorSolicitudes.getUser(correo, clave);
		
	}
	/**
	 *FUNCION PARA AGREGAR USUARIO 
	 */
	//...
	public String addPrnd(String tipo,
			String genero,
			String ruta,
			BitSet imagen) throws NamingException {

		// TODO Auto-generated method stub
		GestorSolicitudes gestorSolicitudes = new GestorSolicitudes();
		return gestorSolicitudes.addPrenda(tipo, genero, ruta, imagen);
	}
	/**
	 *FUNCION PARA ACRUALIZAR USUARIO 
	 */
	//...
	public String updUsr(String id, 
			String nombres,
			String apellidos,
			String correo,
			String clave,
			String cell,
			String doc,
			String direccion) throws NamingException {

		// TODO Auto-generated method stub
		GestorSolicitudes gestorSolicitudes = new GestorSolicitudes();
		return gestorSolicitudes.updUser(id, 
										nombres, 
										apellidos, 
										correo, 
										clave, 
										cell, 
										doc, 
										direccion);
	}
	/**
	 *FUNCION PARA ACRUALIZAR USUARIO 
	 */
	//...
	public String delUsr(String id) throws NamingException {

		// TODO Auto-generated method stub
		GestorSolicitudes gestorSolicitudes = new GestorSolicitudes();
		return gestorSolicitudes.delUser(id);
	}	
	
	

}