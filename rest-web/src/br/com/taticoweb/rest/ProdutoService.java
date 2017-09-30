package br.com.taticoweb.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.taticoweb.dao.ProdutoDAO;
import br.com.taticoweb.entity.Produto;

@Path("produto")
public class ProdutoService {

	private ProdutoDAO produtoDAO;

	@PostConstruct
	private void init() {
		produtoDAO = new ProdutoDAO();
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public List<Produto> listProdutos() {
		try {
			return produtoDAO.listarProdutos();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
