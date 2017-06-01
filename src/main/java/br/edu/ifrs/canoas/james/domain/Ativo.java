package br.edu.ifrs.canoas.james.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ativo {

	@Id
	@GeneratedValue
	private long id;
	private String ticker;
	private String descricao;
	private String tipoAtivo;
	private Date vencimento;

	public Ativo(){

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoAtivo() {
		return tipoAtivo;
	}

	public void setTipoAtivo(String tipoAtivo) {
		this.tipoAtivo = tipoAtivo;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

}
