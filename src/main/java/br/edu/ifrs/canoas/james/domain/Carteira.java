package br.edu.ifrs.canoas.james.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.edu.canoas.lds.sed.domain.EmployeePosition;

@Entity
public class Carteira {

	@Id
	@GeneratedValue
	private long id;

	private double credIrrf;
	private double prejNormal;
	private double prejDaytrade;
	private double prejFii;
	private Date dataRef;
	private Date ultimaAtualizacao;

	@OneToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "ativo", fetch = FetchType.EAGER)
	private List<AtivoCarteira> ativosEmCarteira;






}
