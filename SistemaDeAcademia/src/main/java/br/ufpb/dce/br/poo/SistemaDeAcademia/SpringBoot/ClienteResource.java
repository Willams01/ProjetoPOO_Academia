package br.ufpb.dce.br.poo.SistemaDeAcademia.SpringBoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufpb.dce.br.poo.SistemaDeAcademia.Cliente;

@RestController
public class ClienteResource {
	private Map<Integer, Cliente> clientes;
	
	public ClienteResource() {
		clientes = new HashMap<Integer, Cliente>();
		
		Cliente c1 = new Cliente(1, "Willams", "123.123.1236-63", null, null,null,null);
		Cliente c2 = new Cliente(2, "Alison S2", "123.654.789-36", null, null,null,null);
		Cliente c3 = new Cliente(3, "Hugo <3", "242.424.242-24", null, null,null,null);
		Cliente c4 = new Cliente(4, "Alba", "242.424.242-24", null, null,null,null);

		clientes.put(1, c1);
		clientes.put(2, c2);
		clientes.put(3, c3);
		clientes.put(4, c4);
	}
	
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listar() {
		return new ResponseEntity<List<Cliente>>(new ArrayList<Cliente>(clientes.values()), HttpStatus.OK);
	}
}
