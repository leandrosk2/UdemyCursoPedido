package br.com.pedido.domain.enums;

public enum TipoCliente {
	PESSOAFISICA("F", "Pessoa Física"), PESSOAJURIDICA("J", "Pessoa Jurídica");

	private String tipoPessoa;
	private String descricaoTipoPessoa;

	private TipoCliente(String tipoPessoa, String descricaoTipoPessoa) {
		this.tipoPessoa = tipoPessoa;
		this.descricaoTipoPessoa = descricaoTipoPessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public String getDescricaoTipoPessoa() {
		return descricaoTipoPessoa;
	}

	public static TipoCliente toEnum(String tipoPessoa) {

		if (tipoPessoa == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (tipoPessoa.equals(x.getTipoPessoa())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Tipo Pessoa inválido " + tipoPessoa);
	}
}
