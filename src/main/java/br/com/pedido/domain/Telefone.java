package br.com.pedido.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TB_TELEFONE")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NU_DDD", length = 2, nullable = false)
	private String codigoDiscagem;

	@Column(name = "NU_DDI", length = 2, nullable = false)
	private String codigoArea;

	@Column(name = "NU_TELEFONE", length = 10, nullable = false)
	private String numeroTelefone;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "NU_CLIENTE")
	private Cliente clientes;

	public Telefone() {

	}

	public Telefone(Integer id, String codigoDiscagem, String codigoArea, String numeroTelefone, Cliente clientes) {
		super();
		this.id = id;
		this.codigoDiscagem = codigoDiscagem;
		this.codigoArea = codigoArea;
		this.numeroTelefone = numeroTelefone;
		this.clientes = clientes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoDiscagem() {
		return codigoDiscagem;
	}

	public void setCodigoDiscagem(String codigoDiscagem) {
		this.codigoDiscagem = codigoDiscagem;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
