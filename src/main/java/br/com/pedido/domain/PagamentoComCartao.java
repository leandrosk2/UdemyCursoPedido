package br.com.pedido.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.pedido.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 1L;

	@Column(name = "NU_PARCELAS", nullable = false)
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {

	}



	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas =numeroDeParcelas;
	}



	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
