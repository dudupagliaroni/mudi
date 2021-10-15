package br.com.eduardopagliaroni.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.eduardopagliaroni.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {

	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImage;
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImage);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}

}
