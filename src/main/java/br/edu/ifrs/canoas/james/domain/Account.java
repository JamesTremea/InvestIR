package br.edu.ifrs.canoas.james.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rodrigo on 2/21/17.
 */
@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	private String username;
	private String password;
	private boolean active;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles;
	@OneToOne(fetch = FetchType.EAGER)
	private Usuario usuario;

	public Account() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}