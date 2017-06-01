package br.edu.ifrs.canoas.james.service;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.edu.ifrs.canoas.james.repository.AccountRepository;

import java.util.stream.Collectors;

/**
 * Created by rodrigo on 2/21/17.
 */
@Service
public class AccountUserDetailsService  {			// implements UserDetailsService

	private final AccountRepository accountRepository;

	@Autowired
	public AccountUserDetailsService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return this.accountRepository.findByUsername(username)
//				.map(account -> new UserImpl(account.getUsername(), account.getPassword(), account.isActive(),
//						account.isActive(), account.isActive(), account.isActive(),
//						// AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER")
//						account.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getRole()))
//								.collect(Collectors.toList()),
//						account.getUsuario()))
//				.orElseThrow(() -> new UsernameNotFoundException("couldn't find " + username + "!"));
//	}
}