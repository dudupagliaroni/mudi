package br.com.eduardopagliaroni.mvc.mudi.controller;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.eduardopagliaroni.mvc.mudi.dto.RequisiçãoNovoPedido;
import br.com.eduardopagliaroni.mvc.mudi.model.Pedido;
import br.com.eduardopagliaroni.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String novo(RequisiçãoNovoPedido requisicao) {
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		System.out.println(pedido);
		return "/pedido/formulario";
	}

}
