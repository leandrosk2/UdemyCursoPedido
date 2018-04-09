package br.com.pedido.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private Integer codigoEstadoPagamento;
	private String descricaoEstadoPagamento;

	private EstadoPagamento(Integer codigoEstadoPagamento, String descricaoEstadoPagamento) {
		this.codigoEstadoPagamento = codigoEstadoPagamento;
		this.descricaoEstadoPagamento = descricaoEstadoPagamento;
	}

	public static EstadoPagamento toEnum(Integer codigoEstadoPagamento) {

		if (codigoEstadoPagamento == null) {
			return null;
		}
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (codigoEstadoPagamento.equals(x.getCodigoEstadoPagamento())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código Pagamento inválido " + codigoEstadoPagamento);
	}

	public Integer getCodigoEstadoPagamento() {
		return codigoEstadoPagamento;
	}

	public String getDescricaoEstadoPagamento() {
		return descricaoEstadoPagamento;
	}
}
