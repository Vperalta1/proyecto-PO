package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.ProductosDAO;
import java.util.List;
import com.distribuida.entities.Productos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
				ProductosDAO productosDAO = context.getBean("ProductosDAOImpl",ProductosDAO.class);
				
				
				//CRUD
				
				//ADD
				Productos producto =new Productos();
				//clienteDAO.add(cliente);
				
				//UP
				Productos producto2 =new Productos();
				//clienteDAO.up(cliente1);
				
				//	DEL
				
				//findAll
				List<Productos> clientes=productosDAO.findAll();
				
				
				
				
				//impresion
				for (Productos item : clientes) {
					System.out.println(item.toString());
				}
				
				//findOne
				//Clientes cliente =clienteDAO.findOne(3);
				
				//System.out.println(cliente.toString());
				
				context.close();
			}

	}


