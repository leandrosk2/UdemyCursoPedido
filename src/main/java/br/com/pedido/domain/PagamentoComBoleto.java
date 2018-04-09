package br.com.pedido.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.pedido.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name = "DT_VENCIMENTO", nullable = false)
	private Date dataVecimento;

	@JsonFormat(pattern="dd/MM/yyyy")
	@Column(name = "DT_PAGAMENTO", nullable = true)
	private Date dataPagamento;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVecimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVecimento = dataVecimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVecimento() {
		return dataVecimento;
	}

	public void setDataVecimento(Date dataVecimento) {
		this.dataVecimento = dataVecimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
