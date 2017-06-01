package br.edu.ifrs.canoas.james.auth;

import br.edu.canoas.lds.sed.config.Messages;
import br.edu.canoas.lds.sed.service.AccountUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by rodrigo on 2/22/17.
 */
@Configuration
@EnableGlobalAuthentication
@Profile("production")
public class SecurityConfigProd extends GlobalAuthenticationConfigurerAdapter {

	private final UserDetailsService userDetailsService;
    @Autowired
    private AccountUserDetailsService userService;
    @Autowired
    private Messages messages;

	public SecurityConfigProd(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new CustomAuthenticationProvider(userService,messages));
	}


}
