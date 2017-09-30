package br.com.taticoweb.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.taticoweb.entity.Pessoa;
import br.com.taticoweb.util.Constantes;

@Path("/alo")
public class AloMundoService {

	@GET
	public String aloMundoGet() {
		return "Al� Mundo GET!";
	}
	
	@POST
	public String aloMundoPost() {
		return "Al� Mundo POST!";
	}
	
	@GET
	@Path("/alo2")
	@Produces(MediaType.TEXT_XML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String aloMundoGet2(@QueryParam("msg") String msg) {
		return "<h1>Al� Mundo GET 2: " + msg + "</h1>";
	}
	
	@GET
	@Path("/param/{msg}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String testeParam(@PathParam("msg") String msg) {
		return "Param: " + msg;
	}
	
	@POST
	@Path("/json")	
	@Produces(Constantes.APPLICATION_JSON_UTF8)
	@Consumes(Constantes.APPLICATION_JSON_UTF8)
	public Pessoa testJson(Pessoa p) {
		System.out.println(p.getNome());
		
		p.setNome("Cl�udia");
		
		Map<String, Pessoa> irmaos = new HashMap<>();
		
		Pessoa[] filhos = new Pessoa[5];
		for (int i = 0; i < 5; i++) {
			Pessoa filho = new Pessoa();
			filho.setNome("Filho " + i);
			
			Pessoa irmao = new Pessoa();
			irmao.setNome("Ana");
			
			irmaos.put(String.valueOf(i), irmao);
			filhos[i] = filho;
		}
		
		p.setIrmaos(irmaos);
		p.setFilhos(filhos);
		
		return p;
	}

}
