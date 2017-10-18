
package br.com.taticoweb.entity;

import java.math.BigDecimal;
import java.util.List;

public class Produto {

	private int id;

	private String titulo;

	private String descricao;

	private String promdia;

	private String promMes;

	private BigDecimal valor;

	private String urlImg;

	private String sku;

	private List<Venda> vendas;

	public Produto() {

	}

	public Produto(
		int id, String titulo, String descricao, BigDecimal valor,
		String urlImg, String promdia, String promMes ) {

		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.urlImg = urlImg;
        this.promdia = promdia;
        this.promMes = promMes;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getTitulo() {

		return titulo;
	}

	public void setTitulo(String titulo) {

		this.titulo = titulo;
	}

	public String getDescricao() {

		return descricao;
	}

    public String getPromdia() {
        return promdia;
    }

    public void setPromdia(String promdia) {
        this.promdia = promdia;
    }

    public String getPromMes() {
        return promMes;
    }

    public void setPromMes(String promMes) {
        this.promMes = promMes;
    }

    public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public BigDecimal getValor() {

		return valor;
	}

	public void setValor(BigDecimal valor) {

		this.valor = valor;
	}

	public String getUrlImg() {

		return urlImg;
	}

	public void setUrlImg(String urlImg) {

		this.urlImg = urlImg;
	}

	public String getSku() {

		return sku;
	}

	public void setSku(String sku) {

		this.sku = sku;
	}

	public List<Venda> getVendas() {

		return vendas;
	}

	public void setVendas(List<Venda> vendas) {

		this.vendas = vendas;
	}

}
