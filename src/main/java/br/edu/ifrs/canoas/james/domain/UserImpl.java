package br.edu.ifrs.canoas.james.domain;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by rodrigo on 3/19/17.
 * Edited by James on 06/01/17.
 */

public class UserImpl  {								// extends User

    private Usuario usuario;

//    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, authorities);
//    }
//
//    public UserImpl(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
//    }
//
//    public UserImpl(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Usuario usuario) {
//        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
//        this.usuario = usuario;
//     }

    public Usuario getUsuario() {
		return usuario;
	}

    public void setUsuario (Usuario usuario) {
        this.usuario = usuario;
    }
}
